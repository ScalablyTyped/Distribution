package typings
package stdLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends js.Object {
  def format(value: scala.Double): java.lang.String = js.native
  def formatToParts(): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: scala.Double): js.Array[NumberFormatPart] = js.native
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

@JSGlobal("Intl.NumberFormat")
@js.native
class NumberFormatCls () extends NumberFormat {
  def this(locales: java.lang.String) = this()
  def this(locales: js.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: NumberFormatOptions) = this()
  def this(locales: js.Array[java.lang.String], options: NumberFormatOptions) = this()
}

