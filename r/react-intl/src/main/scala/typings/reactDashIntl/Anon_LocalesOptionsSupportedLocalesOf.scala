package typings.reactDashIntl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.IntlNs.PluralRules
import typings.std.IntlNs.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LocalesOptionsSupportedLocalesOf
  extends Instantiable0[PluralRules]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ PluralRulesOptions, 
      PluralRules
    ]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), PluralRules] {
  def apply(): PluralRules = js.native
  def apply(locales: String): PluralRules = js.native
  def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
  def apply(locales: js.Array[String]): PluralRules = js.native
  def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
}

