import javax.xml.crypto.Data

/**
 * https://blog.csdn.net/itachi85/article/details/84311537
 *
 *
 */

/**
 * 1 Groovy 变量定义
 * 2 Groovy 方法定义
 * 3 Groovy 可以省略的代码
 *
 */

println "-------------------1.Groovy 变量定义-------------------"

/**
 * 1 Groovy中变量定义
 *
 *  a.用def关键字来定义变量
 *  b.可以不指定变量的类型
 *  c.默认访问修饰符是public
 *
 */
def a = 1
def int b = 19
def c = "hello world!"

println a
println b
println c


println "-------------------2.Groovy 方法定义-------------------"
/**
 * 2. Groovy 中方法定义
 *
 * a 方法使用返回类型或def关键字定义
 * b 方法可以接收任意数量的参数
 * c 这些参数可以不申明类型
 * d 如果不提供可见性修饰符，则该方法为public
 * e 如果指定了方法返回类型，可以不需要def关键字来定义方法
 * f 如果不使用return ，方法的返回值为最后一行代码的执行结果
 */

def log() {
    println "haha"
}

Integer add(Integer a, Integer b) {
    return a + b
}

Integer minus(a, b) {
    return a - b
}

Integer sum(x, y) {
    x + y
}

println log()
println add(3, 5)
println minus(4, 1)
println sum(12, 23)


println "-------------------3.Groovy 获取时间-------------------"
/***
 * 3 Groovy中有很多省略的地方：
 *
 * 语句后面的分号可以省略。
 * 方法的括号可以省略，比如注释1和注释3处。
 * 参数类型可以省略，比如注释2处。
 * return可以省略掉，比如注释4处。
 */
println releaseTime()

def releaseTime() {
    def date = new Date()
    def format = date.format("yyyy-mm-dd HH:mm:ss", TimeZone.getTimeZone("UTC"))
    return format
}


println "-------------------4.Groovy 集合定义和遍历-------------------"

/***
 * 4 集合
 *
 *   4.1 集合定义
 *
 * a List 的话使用 [] 定义，各项用 , 隔开即可。
 * b Map 的话使用 [:]，各项也是用 , 隔开
 * c groovy 集合里不要求每一项都是同类型，
 *       比如可以这样定义 def list = [1, 'dasu', true]，
 *       集合里包含数字，字符串，布尔值三种类型
 *
 *    4.2 集合遍历
 *
 *       a. 通过下标操作符 [] 读写元素值，并使用正索引值访问列表元素或负索引值从列表尾部访问元素，
 *       b. 也可以使用范围，
 *       c. 或使用左移 << 追加列表元素，
 *
 *       注意：跟 java 不同的是，
 *       groovy 并不存在下标访问越界，
 *       当下标为负数时则从右开始算起，当指定的下标没有存放值时返回 null。
 */

def numList = [1, 2, 3]

def strLrist = ["a", "b", "c"]

def numMap = [

        "1": "aaa",
        "2": "bbb",
        "c": "ccc"
]

println numList[1]
println strLrist[1]
println numList << 3

def getValue(Map map){

    map.each{
        println it.key+":"+it.value
    }

}

getValue(numMap)

numMap.each {k,v -> println "impl "+ v}

class Person{

    int id;
    String name;
    int age;



}


