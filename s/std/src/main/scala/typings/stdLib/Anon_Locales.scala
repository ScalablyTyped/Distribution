package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Locales
  extends ScalablyTyped.runtime.Instantiable1[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      stdLib.IntlNs.PluralRules
    ]
     with ScalablyTyped.runtime.Instantiable2[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      /* options */ stdLib.IntlNs.PluralRulesOptions, 
      stdLib.IntlNs.PluralRules
    ]
     with ScalablyTyped.runtime.Instantiable0[stdLib.IntlNs.PluralRules] {
  def apply(): stdLib.IntlNs.PluralRules = js.native
  def apply(locales: java.lang.String): stdLib.IntlNs.PluralRules = js.native
  def apply(locales: java.lang.String, options: stdLib.IntlNs.PluralRulesOptions): stdLib.IntlNs.PluralRules = js.native
  def apply(locales: js.Array[java.lang.String]): stdLib.IntlNs.PluralRules = js.native
  def apply(locales: js.Array[java.lang.String], options: stdLib.IntlNs.PluralRulesOptions): stdLib.IntlNs.PluralRules = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: stdLib.IntlNs.PluralRulesOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: stdLib.IntlNs.PluralRulesOptions): js.Array[java.lang.String] = js.native
}

