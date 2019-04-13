package typings
package stdLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralRules extends js.Object {
  def resolvedOptions(): ResolvedPluralRulesOptions
  def select(n: scala.Double): java.lang.String
}

@JSGlobal("Intl.PluralRules")
@js.native
class PluralRulesCls () extends PluralRules {
  def this(locales: java.lang.String) = this()
  def this(locales: js.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: PluralRulesOptions) = this()
  def this(locales: js.Array[java.lang.String], options: PluralRulesOptions) = this()
  /* CompleteClass */
  override def resolvedOptions(): ResolvedPluralRulesOptions = js.native
  /* CompleteClass */
  override def select(n: scala.Double): java.lang.String = js.native
}

@JSGlobal("Intl.PluralRules")
@js.native
object PluralRules
  extends org.scalablytyped.runtime.Instantiable0[PluralRules]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ PluralRulesOptions, 
      PluralRules
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      PluralRules
    ] {
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

