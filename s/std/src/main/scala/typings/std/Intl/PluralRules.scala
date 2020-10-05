package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralRules extends js.Object {
  def resolvedOptions(): ResolvedPluralRulesOptions = js.native
  def select(n: Double): LDMLPluralRule = js.native
}

object PluralRules {
  @scala.inline
  def apply(resolvedOptions: () => ResolvedPluralRulesOptions, select: Double => LDMLPluralRule): PluralRules = {
    val __obj = js.Dynamic.literal(resolvedOptions = js.Any.fromFunction0(resolvedOptions), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PluralRules]
  }
  @scala.inline
  implicit class PluralRulesOps[Self <: PluralRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolvedOptions(value: () => ResolvedPluralRulesOptions): Self = this.set("resolvedOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setSelect(value: Double => LDMLPluralRule): Self = this.set("select", js.Any.fromFunction1(value))
  }
  
}

