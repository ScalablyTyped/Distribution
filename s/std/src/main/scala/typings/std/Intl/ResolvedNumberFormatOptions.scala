package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedNumberFormatOptions extends js.Object {
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var currencyDisplay: js.UndefOr[java.lang.String] = js.undefined
  var locale: java.lang.String
  var maximumFractionDigits: Double
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: Double
  var minimumIntegerDigits: Double
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  var numberingSystem: java.lang.String
  var style: java.lang.String
  var useGrouping: scala.Boolean
}

object ResolvedNumberFormatOptions {
  @scala.inline
  def apply(
    locale: java.lang.String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    numberingSystem: java.lang.String,
    style: java.lang.String,
    useGrouping: scala.Boolean,
    currency: java.lang.String = null,
    currencyDisplay: java.lang.String = null,
    maximumSignificantDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale, maximumFractionDigits = maximumFractionDigits, minimumFractionDigits = minimumFractionDigits, minimumIntegerDigits = minimumIntegerDigits, numberingSystem = numberingSystem, style = style, useGrouping = useGrouping)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay)
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
}

