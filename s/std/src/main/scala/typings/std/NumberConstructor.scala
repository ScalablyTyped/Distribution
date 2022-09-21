package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberConstructor
  extends StObject
     with /* standard es5 */
Instantiable0[Number]
     with Instantiable1[/* value */ Any, Number] {
  
  /* standard es5 */
  def apply(): Double = js.native
  def apply(value: Any): Double = js.native
  
  /**
    * The value of Number.EPSILON is the difference between 1 and the smallest value greater than 1
    * that is representable as a Number value, which is approximately:
    * 2.2204460492503130808472633361816 x 10‍−‍16.
    */
  /* standard es2015.core */
  val EPSILON: Double = js.native
  
  /**
    * The value of the largest integer n such that n and n + 1 are both exactly representable as
    * a Number value.
    * The value of Number.MAX_SAFE_INTEGER is 9007199254740991 2^53 − 1.
    */
  /* standard es2015.core */
  val MAX_SAFE_INTEGER: Double = js.native
  
  /** The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. */
  /* standard es5 */
  val MAX_VALUE: Double = js.native
  
  /**
    * The value of the smallest integer n such that n and n − 1 are both exactly representable as
    * a Number value.
    * The value of Number.MIN_SAFE_INTEGER is −9007199254740991 (−(2^53 − 1)).
    */
  /* standard es2015.core */
  val MIN_SAFE_INTEGER: Double = js.native
  
  /** The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. */
  /* standard es5 */
  val MIN_VALUE: Double = js.native
  
  /**
    * A value that is less than the largest negative number that can be represented in JavaScript.
    * JavaScript displays NEGATIVE_INFINITY values as -infinity.
    */
  /* standard es5 */
  val NEGATIVE_INFINITY: Double = js.native
  
  /**
    * A value that is not a number.
    * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
    */
  /* standard es5 */
  val NaN: Double = js.native
  
  /**
    * A value greater than the largest number that can be represented in JavaScript.
    * JavaScript displays POSITIVE_INFINITY values as infinity.
    */
  /* standard es5 */
  val POSITIVE_INFINITY: Double = js.native
  
  /**
    * Returns true if passed value is finite.
    * Unlike the global isFinite, Number.isFinite doesn't forcibly convert the parameter to a
    * number. Only finite values of the type number, result in true.
    * @param number A numeric value.
    */
  /* standard es2015.core */
  def isFinite(number: Any): scala.Boolean = js.native
  
  /**
    * Returns true if the value passed is an integer, false otherwise.
    * @param number A numeric value.
    */
  /* standard es2015.core */
  def isInteger(number: Any): scala.Boolean = js.native
  
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a
    * number). Unlike the global isNaN(), Number.isNaN() doesn't forcefully convert the parameter
    * to a number. Only values of the type number, that are also NaN, result in true.
    * @param number A numeric value.
    */
  /* standard es2015.core */
  def isNaN(number: Any): scala.Boolean = js.native
  
  /**
    * Returns true if the value passed is a safe integer.
    * @param number A numeric value.
    */
  /* standard es2015.core */
  def isSafeInteger(number: Any): scala.Boolean = js.native
  
  /**
    * Converts a string to a floating-point number.
    * @param string A string that contains a floating-point number.
    */
  /* standard es2015.core */
  def parseFloat(string: java.lang.String): Double = js.native
  
  /**
    * Converts A string to an integer.
    * @param string A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in `string`.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  /* standard es2015.core */
  def parseInt(string: java.lang.String): Double = js.native
  def parseInt(string: java.lang.String, radix: Double): Double = js.native
}
