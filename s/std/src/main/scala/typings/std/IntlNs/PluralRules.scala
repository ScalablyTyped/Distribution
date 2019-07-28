package typings.std.IntlNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralRules extends js.Object {
  def resolvedOptions(): ResolvedPluralRulesOptions
  def select(n: Double): java.lang.String
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
  override def select(n: Double): java.lang.String = js.native
}

@JSGlobal("Intl.PluralRules")
@js.native
object PluralRules
  extends Instantiable0[PluralRules]
     with Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ PluralRulesOptions, 
      PluralRules
    ]
     with Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      PluralRules
    ] {
  def apply(): PluralRules = js.native
  def apply(locales: java.lang.String): PluralRules = js.native
  def apply(locales: java.lang.String, options: PluralRulesOptions): PluralRules = js.native
  def apply(locales: js.Array[java.lang.String]): PluralRules = js.native
  def apply(locales: js.Array[java.lang.String], options: PluralRulesOptions): PluralRules = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: PluralRulesOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: PluralRulesOptions): js.Array[java.lang.String] = js.native
}

