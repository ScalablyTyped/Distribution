package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  /** The mathematical constant e. This is Euler's number, the base of natural logarithms. */
  val E: scala.Double
  /** The natural logarithm of 10. */
  val LN10: scala.Double
  /** The natural logarithm of 2. */
  val LN2: scala.Double
  /** The base-10 logarithm of e. */
  val LOG10E: scala.Double
  /** The base-2 logarithm of e. */
  val LOG2E: scala.Double
  /** Pi. This is the ratio of the circumference of a circle to its diameter. */
  val PI: scala.Double
  /** The square root of 0.5, or, equivalently, one divided by the square root of 2. */
  val SQRT1_2: scala.Double
  /** The square root of 2. */
  val SQRT2: scala.Double
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: java.lang.String
  /**
    * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
    * For example, the absolute value of -5 is the same as the absolute value of 5.
    * @param x A numeric expression for which the absolute value is needed.
    */
  def abs(x: scala.Double): scala.Double
  /**
    * Returns the arc cosine (or inverse cosine) of a number.
    * @param x A numeric expression.
    */
  def acos(x: scala.Double): scala.Double
  /**
    * Returns the inverse hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def acosh(x: scala.Double): scala.Double
  /**
    * Returns the arcsine of a number.
    * @param x A numeric expression.
    */
  def asin(x: scala.Double): scala.Double
  /**
    * Returns the inverse hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def asinh(x: scala.Double): scala.Double
  /**
    * Returns the arctangent of a number.
    * @param x A numeric expression for which the arctangent is needed.
    */
  def atan(x: scala.Double): scala.Double
  /**
    * Returns the angle (in radians) from the X axis to a point.
    * @param y A numeric expression representing the cartesian y-coordinate.
    * @param x A numeric expression representing the cartesian x-coordinate.
    */
  def atan2(y: scala.Double, x: scala.Double): scala.Double
  /**
    * Returns the inverse hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def atanh(x: scala.Double): scala.Double
  /**
    * Returns an implementation-dependent approximation to the cube root of number.
    * @param x A numeric expression.
    */
  def cbrt(x: scala.Double): scala.Double
  /**
    * Returns the smallest integer greater than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def ceil(x: scala.Double): scala.Double
  /**
    * Returns the number of leading zero bits in the 32-bit binary representation of a number.
    * @param x A numeric expression.
    */
  def clz32(x: scala.Double): scala.Double
  /**
    * Returns the cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cos(x: scala.Double): scala.Double
  /**
    * Returns the hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cosh(x: scala.Double): scala.Double
  /**
    * Returns e (the base of natural logarithms) raised to a power.
    * @param x A numeric expression representing the power of e.
    */
  def exp(x: scala.Double): scala.Double
  /**
    * Returns the result of (e^x - 1), which is an implementation-dependent approximation to
    * subtracting 1 from the exponential function of x (e raised to the power of x, where e
    * is the base of the natural logarithms).
    * @param x A numeric expression.
    */
  def expm1(x: scala.Double): scala.Double
  /**
    * Returns the greatest integer less than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  def floor(x: scala.Double): scala.Double
  /**
    * Returns the nearest single precision float representation of a number.
    * @param x A numeric expression.
    */
  def fround(x: scala.Double): scala.Double
  /**
    * Returns the square root of the sum of squares of its arguments.
    * @param values Values to compute the square root for.
    *     If no arguments are passed, the result is +0.
    *     If there is only one argument, the result is the absolute value.
    *     If any argument is +Infinity or -Infinity, the result is +Infinity.
    *     If any argument is NaN, the result is NaN.
    *     If all arguments are either +0 or −0, the result is +0.
    */
  def hypot(values: scala.Double*): scala.Double
  /**
    * Returns the result of 32-bit multiplication of two numbers.
    * @param x First number
    * @param y Second number
    */
  def imul(x: scala.Double, y: scala.Double): scala.Double
  /**
    * Returns the natural logarithm (base e) of a number.
    * @param x A numeric expression.
    */
  def log(x: scala.Double): scala.Double
  /**
    * Returns the base 10 logarithm of a number.
    * @param x A numeric expression.
    */
  def log10(x: scala.Double): scala.Double
  /**
    * Returns the natural logarithm of 1 + x.
    * @param x A numeric expression.
    */
  def log1p(x: scala.Double): scala.Double
  /**
    * Returns the base 2 logarithm of a number.
    * @param x A numeric expression.
    */
  def log2(x: scala.Double): scala.Double
  /**
    * Returns the larger of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def max(values: scala.Double*): scala.Double
  /**
    * Returns the smaller of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  def min(values: scala.Double*): scala.Double
  /**
    * Returns the value of a base expression taken to a specified power.
    * @param x The base value of the expression.
    * @param y The exponent value of the expression.
    */
  def pow(x: scala.Double, y: scala.Double): scala.Double
  /** Returns a pseudorandom number between 0 and 1. */
  def random(): scala.Double
  /**
    * Returns a supplied numeric expression rounded to the nearest number.
    * @param x The value to be rounded to the nearest number.
    */
  def round(x: scala.Double): scala.Double
  /**
    * Returns the sign of the x, indicating whether x is positive, negative or zero.
    * @param x The numeric expression to test
    */
  def sign(x: scala.Double): scala.Double
  /**
    * Returns the sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sin(x: scala.Double): scala.Double
  /**
    * Returns the hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sinh(x: scala.Double): scala.Double
  /**
    * Returns the square root of a number.
    * @param x A numeric expression.
    */
  def sqrt(x: scala.Double): scala.Double
  /**
    * Returns the tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tan(x: scala.Double): scala.Double
  /**
    * Returns the hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tanh(x: scala.Double): scala.Double
  /**
    * Returns the integral part of the a numeric expression, x, removing any fractional digits.
    * If x is already an integer, the result is x.
    * @param x A numeric expression.
    */
  def trunc(x: scala.Double): scala.Double
}

