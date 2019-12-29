package typings.std.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends js.Object {
  def format(value: Double): String = js.native
  def formatToParts(): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: Double): js.Array[NumberFormatPart] = js.native
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[NumberFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), NumberFormat]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ] {
  def apply(): NumberFormat = js.native
  def apply(locales: String): NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: js.Array[String]): NumberFormat = js.native
  def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
}

