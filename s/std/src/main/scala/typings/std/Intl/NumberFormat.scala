package typings.std.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends js.Object {
  def format(value: Double): java.lang.String = js.native
  def formatToParts(): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: Double): js.Array[NumberFormatPart] = js.native
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[NumberFormat]
     with Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ]
     with Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      NumberFormat
    ] {
  def apply(): NumberFormat = js.native
  def apply(locales: java.lang.String): NumberFormat = js.native
  def apply(locales: java.lang.String, options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: js.Array[java.lang.String]): NumberFormat = js.native
  def apply(locales: js.Array[java.lang.String], options: NumberFormatOptions): NumberFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: NumberFormatOptions): js.Array[java.lang.String] = js.native
}

