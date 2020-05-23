package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedPluralRulesOptions extends js.Object {
  var locale: String
  var maximumFractionDigits: Double
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: Double
  var minimumIntegerDigits: Double
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  var pluralCategories: js.Array[LDMLPluralRule]
  var `type`: PluralRuleType
}

object ResolvedPluralRulesOptions {
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    pluralCategories: js.Array[LDMLPluralRule],
    `type`: PluralRuleType,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], pluralCategories = pluralCategories.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
}

