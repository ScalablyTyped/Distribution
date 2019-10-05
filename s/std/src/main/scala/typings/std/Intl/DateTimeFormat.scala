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
  def format(): java.lang.String = js.native
  def format(date: Double): java.lang.String = js.native
  def format(date: Date): java.lang.String = js.native
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Double): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Date): js.Array[DateTimeFormatPart] = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[DateTimeFormat]
     with Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ]
     with Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      DateTimeFormat
    ] {
  def apply(): DateTimeFormat = js.native
  def apply(locales: java.lang.String): DateTimeFormat = js.native
  def apply(locales: java.lang.String, options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: js.Array[java.lang.String]): DateTimeFormat = js.native
  def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
}

