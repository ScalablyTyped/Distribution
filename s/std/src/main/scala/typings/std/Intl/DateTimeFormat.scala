package typings.std.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): String = js.native
  def format(date: Double): String = js.native
  def format(date: Date): String = js.native
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Double): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Date): js.Array[DateTimeFormatPart] = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[DateTimeFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), DateTimeFormat]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ] {
  def apply(): DateTimeFormat = js.native
  def apply(locales: String): DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: js.Array[String]): DateTimeFormat = js.native
  def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
}

