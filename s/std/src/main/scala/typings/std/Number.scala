package typings.std

import typings.std.Intl.LocalesArgument
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends StObject {
  
  /**
    * Returns a string containing a number represented in exponential notation.
    * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
    */
  /* standard es5 */
  def toExponential(): java.lang.String = js.native
  def toExponential(fractionDigits: Double): java.lang.String = js.native
  
  /**
    * Returns a string representing a number in fixed-point notation.
    * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
    */
  /* standard es5 */
  def toFixed(): java.lang.String = js.native
  def toFixed(fractionDigits: Double): java.lang.String = js.native
  
  def toLocaleString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String, options: NumberFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  def toLocaleString(locales: js.Array[java.lang.String], options: NumberFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: Unit, options: NumberFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: LocalesArgument): java.lang.String = js.native
  def toLocaleString(locales: LocalesArgument, options: NumberFormatOptions): java.lang.String = js.native
  
  /**
    * Returns a string containing a number represented either in exponential or fixed-point notation with a specified number of digits.
    * @param precision Number of significant digits. Must be in the range 1 - 21, inclusive.
    */
  /* standard es5 */
  def toPrecision(): java.lang.String = js.native
  def toPrecision(precision: Double): java.lang.String = js.native
  
  def toString(radix: Double): java.lang.String = js.native
}
