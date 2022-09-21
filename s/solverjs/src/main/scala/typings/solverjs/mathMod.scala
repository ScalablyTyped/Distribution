package typings.solverjs

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("solverjs/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alternativeStringArrange(st1: String, st2: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("alternativeStringArrange")(st1.asInstanceOf[js.Any], st2.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def ascii(ch: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ascii")(ch.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def avg(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("avg")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fac(n: Double): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("fac")(n.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def getFib(arg_n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFib")(arg_n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getGcd(arg1: Double, arg2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getGcd")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hcf(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hcf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isAlNum(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlNum")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAlpha(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArmstrong(n: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArmstrong")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isArmstrong(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArmstrong")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCoPrime(x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCoPrime")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDecimal(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFibonacci(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFibonacci")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKishnamurthyNumber(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKishnamurthyNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLeap(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeap")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLower(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLower")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPalindrome(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPalindrome")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPerfectSquare(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPerfectSquare")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrime(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrime")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSpace(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpace")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTitle(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTitle")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUpper(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpper")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lcm(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lcm")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def len(x: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def len(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def max(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def min(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def mod(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def numToAscii(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numToAscii")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def permutation(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("permutation")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def phoneExtractor(str: String): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("phoneExtractor")(str.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
  
  inline def phoneValidator(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("phoneValidator")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pow(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def printFib(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printFib")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def randomInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remainder(divident: Double, devisor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remainder")(divident.asInstanceOf[js.Any], devisor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reverse(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def reverseNumber(n: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseNumber")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reverseNumber(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseNumber")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sumAllDigit(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sumAllDigit")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sumOfN(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sumOfN")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def token(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("token")().asInstanceOf[String]
  
  inline def wordCount(str: String, separetor: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wordCount")(str.asInstanceOf[js.Any], separetor.asInstanceOf[js.Any])).asInstanceOf[Double]
}
