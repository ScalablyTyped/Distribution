package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideLocale")
@js.native
class GlideLocale () extends js.Object {
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
  def getDecimalSeparator(): java.lang.String = js.native
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
  def getGroupingSeparator(): java.lang.String = js.native
}

/* static members */
@JSGlobal("GlideLocale")
@js.native
object GlideLocale extends js.Object {
  /**
    * Returns the GlideLocale object.
    *
    * @returns The GlideLocale object.
    * @example
    *
    * var locale = GlideLocale.get();
    */
  def get(): servicenowDashLondonLib.GlideLocale = js.native
}

