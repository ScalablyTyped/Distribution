package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedPluralRulesOptions extends js.Object {
  var locale: String = js.native
  var maximumFractionDigits: Double = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: Double = js.native
  var minimumIntegerDigits: Double = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var pluralCategories: js.Array[LDMLPluralRule] = js.native
  var `type`: PluralRuleType = js.native
}

object ResolvedPluralRulesOptions {
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    pluralCategories: js.Array[LDMLPluralRule],
    `type`: PluralRuleType
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], pluralCategories = pluralCategories.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
  @scala.inline
  implicit class ResolvedPluralRulesOptionsOps[Self <: ResolvedPluralRulesOptions] (val x: Self) extends AnyVal {
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluralCategoriesVarargs(value: LDMLPluralRule*): Self = this.set("pluralCategories", js.Array(value :_*))
    @scala.inline
    def setPluralCategories(value: js.Array[LDMLPluralRule]): Self = this.set("pluralCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PluralRuleType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
  }
  
}

