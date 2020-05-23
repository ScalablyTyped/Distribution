package typings.std.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[typings.std.Intl.DateTimeFormat]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typings.std.Intl.DateTimeFormat
    ]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ DateTimeFormatOptions, 
      typings.std.Intl.DateTimeFormat
    ] {
  def apply(): typings.std.Intl.DateTimeFormat = js.native
  def apply(locales: String): typings.std.Intl.DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.Array[String]): typings.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.Array[String], options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
}

