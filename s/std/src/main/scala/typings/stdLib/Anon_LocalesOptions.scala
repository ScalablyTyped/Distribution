package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LocalesOptions
  extends org.scalablytyped.runtime.Instantiable0[stdLib.IntlNs.DateTimeFormat]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      /* options */ stdLib.IntlNs.DateTimeFormatOptions, 
      stdLib.IntlNs.DateTimeFormat
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      stdLib.IntlNs.DateTimeFormat
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

