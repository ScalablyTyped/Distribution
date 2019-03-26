package typings
package stdLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): java.lang.String = js.native
  def format(date: scala.Double): java.lang.String = js.native
  def format(date: stdLib.Date): java.lang.String = js.native
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: scala.Double): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: stdLib.Date): js.Array[DateTimeFormatPart] = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSGlobal("Intl.DateTimeFormat")
@js.native
class DateTimeFormatCls () extends DateTimeFormat {
  def this(locales: java.lang.String) = this()
  def this(locales: js.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
  def this(locales: js.Array[java.lang.String], options: DateTimeFormatOptions) = this()
}

