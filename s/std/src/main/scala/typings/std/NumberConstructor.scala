package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConstructor
  extends Instantiable0[Number]
     with Instantiable1[/* value */ js.Any, Number] {
  /**
    * The value of Number.EPSILON is the difference between 1 and the smallest value greater than 1
    * that is representable as a Number value, which is approximately:
    * 2.2204460492503130808472633361816 x 10‍−‍16.
    */
  val EPSILON: Double = js.native
  /**
    * The value of the largest integer n such that n and n + 1 are both exactly representable as
    * a Number value.
    * The value of Number.MAX_SAFE_INTEGER is 9007199254740991 2^53 − 1.
    */
  val MAX_SAFE_INTEGER: Double = js.native
  /** The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. */
  val MAX_VALUE: Double = js.native
  /**
    * The value of the smallest integer n such that n and n − 1 are both exactly representable as
    * a Number value.
    * The value of Number.MIN_SAFE_INTEGER is −9007199254740991 (−(2^53 − 1)).
    */
  val MIN_SAFE_INTEGER: Double = js.native
  /** The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. */
  val MIN_VALUE: Double = js.native
  /**
    * A value that is less than the largest negative number that can be represented in JavaScript.
    * JavaScript displays NEGATIVE_INFINITY values as -infinity.
    */
  val NEGATIVE_INFINITY: Double = js.native
  /**
    * A value that is not a number.
    * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
    */
  val NaN: Double = js.native
  /**
    * A value greater than the largest number that can be represented in JavaScript.
    * JavaScript displays POSITIVE_INFINITY values as infinity.
    */
  val POSITIVE_INFINITY: Double = js.native
  def apply(): Double = js.native
  def apply(value: js.Any): Double = js.native
  /**
    * Returns true if passed value is finite.
    * Unlike the global isFinite, Number.isFinite doesn't forcibly convert the parameter to a
    * number. Only finite values of the type number, result in true.
    * @param number A numeric value.
    */
  def isFinite(number: js.Any): scala.Boolean = js.native
  /**
    * Returns true if the value passed is an integer, false otherwise.
    * @param number A numeric value.
    */
  def isInteger(number: js.Any): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a
    * number). Unlike the global isNaN(), Number.isNaN() doesn't forcefully convert the parameter
    * to a number. Only values of the type number, that are also NaN, result in true.
    * @param number A numeric value.
    */
  def isNaN(number: js.Any): scala.Boolean = js.native
  /**
    * Returns true if the value passed is a safe integer.
    * @param number A numeric value.
    */
  def isSafeInteger(number: js.Any): scala.Boolean = js.native
  /**
    * Converts a string to a floating-point number.
    * @param string A string that contains a floating-point number.
    */
  def parseFloat(string: java.lang.String): Double = js.native
  /**
    * Converts A string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def parseInt(string: java.lang.String): Double = js.native
  def parseInt(string: java.lang.String, radix: Double): Double = js.native
}

