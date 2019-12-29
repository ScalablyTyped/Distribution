package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.PluralRules")
@js.native
class PluralRulesCls () extends PluralRules {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: PluralRulesOptions) = this()
  def this(locales: js.Array[String], options: PluralRulesOptions) = this()
  /* CompleteClass */
  override def resolvedOptions(): ResolvedPluralRulesOptions = js.native
  /* CompleteClass */
  override def select(n: Double): String = js.native
}

