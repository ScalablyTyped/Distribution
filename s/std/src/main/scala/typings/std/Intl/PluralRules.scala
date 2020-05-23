package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralRules extends js.Object {
  def resolvedOptions(): ResolvedPluralRulesOptions
  def select(n: Double): LDMLPluralRule
}

object PluralRules {
  @scala.inline
  def apply(resolvedOptions: () => ResolvedPluralRulesOptions, select: Double => LDMLPluralRule): PluralRules = {
    val __obj = js.Dynamic.literal(resolvedOptions = js.Any.fromFunction0(resolvedOptions), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PluralRules]
  }
}

