package typings
package strftimeLib.strftimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strftime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Format a local time/date according to locale settings
    * @param {string} format A format.
    * @return {string} Returns a string formatted.
    */
  def apply(format: java.lang.String): java.lang.String = js.native
  /**
    * Format a local time/date according to locale settings
    * @param {string} format A format.
    * @param {Date}   date   A date.
    * @return {string} Returns a string formatted according format using the given date or the current local time.
    */
  def apply(format: java.lang.String, date: stdLib.Date): java.lang.String = js.native
  def localize(locale: strftimeLib.strftimeMod.strftimeNs.Locale): strftimeLib.strftimeMod.strftimeFunction = js.native
  def timezone(offset: java.lang.String): strftimeLib.strftimeMod.strftimeFunction = js.native
  def timezone(offset: scala.Double): strftimeLib.strftimeMod.strftimeFunction = js.native
}

