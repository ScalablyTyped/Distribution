package typings.std.Intl

import typings.std.stdStrings.cardinal
import typings.std.stdStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedPluralRulesOptions extends js.Object {
  var locale: java.lang.String
  var maximumFractionDigits: Double
  var maximumSignificantDigits: Double
  var minimumFractionDigits: Double
  var minimumIntegerDigits: Double
  var minimumSignificantDigits: Double
  var pluralCategories: js.Array[java.lang.String]
  var `type`: cardinal | ordinal
}

object ResolvedPluralRulesOptions {
  @scala.inline
  def apply(
    locale: java.lang.String,
    maximumFractionDigits: Double,
    maximumSignificantDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    minimumSignificantDigits: Double,
    pluralCategories: js.Array[java.lang.String],
    `type`: cardinal | ordinal
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], maximumSignificantDigits = maximumSignificantDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], minimumSignificantDigits = minimumSignificantDigits.asInstanceOf[js.Any], pluralCategories = pluralCategories.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
}

