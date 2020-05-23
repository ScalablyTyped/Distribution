package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideLocale extends js.Object {
  /**
    * Returns the decimal separator.
    *
    * @returns The decimal separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var decimalSeparator = locale.getDecimalSeparator();
    * gs.info( "The decimal separator is " + decimalSeparator);
    * // The decimal separator is .
    */
  def getDecimalSeparator(): String
  /**
    * Returns the grouping separator.
    *
    * @returns The grouping separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var groupingSeparator = locale.getGroupingSeparator();
    * gs.info( "The grouping separator is " + groupingSeparator);
    */
  def getGroupingSeparator(): String
}

object GlideLocale {
  @scala.inline
  def apply(getDecimalSeparator: () => String, getGroupingSeparator: () => String): GlideLocale = {
    val __obj = js.Dynamic.literal(getDecimalSeparator = js.Any.fromFunction0(getDecimalSeparator), getGroupingSeparator = js.Any.fromFunction0(getGroupingSeparator))
    __obj.asInstanceOf[GlideLocale]
  }
}

