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

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends org.scalablytyped.runtime.Instantiable0[DateTimeFormat]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      DateTimeFormat
    ] {
  def apply(): stdLib.IntlNs.DateTimeFormat = js.native
  def apply(locales: java.lang.String): stdLib.IntlNs.DateTimeFormat = js.native
  def apply(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): stdLib.IntlNs.DateTimeFormat = js.native
  def apply(locales: js.Array[java.lang.String]): stdLib.IntlNs.DateTimeFormat = js.native
  def apply(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): stdLib.IntlNs.DateTimeFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions): js.Array[java.lang.String] = js.native
}

