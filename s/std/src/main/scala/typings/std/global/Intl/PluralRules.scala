package typings.std.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Intl.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.PluralRules")
@js.native
object PluralRules
  extends Instantiable0[typings.std.Intl.PluralRules]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typings.std.Intl.PluralRules
    ]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ PluralRulesOptions, 
      typings.std.Intl.PluralRules
    ] {
  def apply(): typings.std.Intl.PluralRules = js.native
  def apply(locales: String): typings.std.Intl.PluralRules = js.native
  def apply(locales: String, options: PluralRulesOptions): typings.std.Intl.PluralRules = js.native
  def apply(locales: js.Array[String]): typings.std.Intl.PluralRules = js.native
  def apply(locales: js.Array[String], options: PluralRulesOptions): typings.std.Intl.PluralRules = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
}

