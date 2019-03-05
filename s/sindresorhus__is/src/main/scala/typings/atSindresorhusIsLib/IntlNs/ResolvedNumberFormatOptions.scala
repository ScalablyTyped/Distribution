package typings
package atSindresorhusIsLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedNumberFormatOptions extends js.Object {
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var currencyDisplay: js.UndefOr[java.lang.String] = js.undefined
  var locale: java.lang.String
  var maximumFractionDigits: scala.Double
  var maximumSignificantDigits: js.UndefOr[scala.Double] = js.undefined
  var minimumFractionDigits: scala.Double
  var minimumIntegerDigits: scala.Double
  var minimumSignificantDigits: js.UndefOr[scala.Double] = js.undefined
  var numberingSystem: java.lang.String
  var style: java.lang.String
  var useGrouping: scala.Boolean
}

object ResolvedNumberFormatOptions {
  @scala.inline
  def apply(
    locale: java.lang.String,
    maximumFractionDigits: scala.Double,
    minimumFractionDigits: scala.Double,
    minimumIntegerDigits: scala.Double,
    numberingSystem: java.lang.String,
    style: java.lang.String,
    useGrouping: scala.Boolean,
    currency: java.lang.String = null,
    currencyDisplay: java.lang.String = null,
    maximumSignificantDigits: scala.Int | scala.Double = null,
    minimumSignificantDigits: scala.Int | scala.Double = null
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale, maximumFractionDigits = maximumFractionDigits, minimumFractionDigits = minimumFractionDigits, minimumIntegerDigits = minimumIntegerDigits, numberingSystem = numberingSystem, style = style, useGrouping = useGrouping)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay)
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
}

