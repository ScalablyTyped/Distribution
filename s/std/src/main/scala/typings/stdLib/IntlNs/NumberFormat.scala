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

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends org.scalablytyped.runtime.Instantiable0[NumberFormat]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      NumberFormat
    ] {
  def apply(): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: java.lang.String): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: java.lang.String, options: stdLib.IntlNs.NumberFormatOptions): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: js.Array[java.lang.String]): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: js.Array[java.lang.String], options: stdLib.IntlNs.NumberFormatOptions): stdLib.IntlNs.NumberFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: stdLib.IntlNs.NumberFormatOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: stdLib.IntlNs.NumberFormatOptions): js.Array[java.lang.String] = js.native
}

