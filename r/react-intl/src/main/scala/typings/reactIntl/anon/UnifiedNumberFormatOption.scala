package typings.reactIntl.anon

import typings.formatjsIntlUnifiedNumberformat.mod.Unit
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCompactDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencyDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsCurrencySign
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsLocaleMatcher
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsNotation
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsSignDisplay
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsStyle
import typings.formatjsIntlUtils.unifiedNumberformatTypesMod.UnifiedNumberFormatOptionsUnitDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions & react-intl.react-intl.CustomFormatConfig & {  value  :number} */
trait UnifiedNumberFormatOption extends js.Object {
  var compactDisplay: js.UndefOr[UnifiedNumberFormatOptionsCompactDisplay] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: js.UndefOr[String with UnifiedNumberFormatOptionsCurrencyDisplay] = js.undefined
  var currencySign: js.UndefOr[UnifiedNumberFormatOptionsCurrencySign] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var localeMatcher: js.UndefOr[String with UnifiedNumberFormatOptionsLocaleMatcher] = js.undefined
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  var notation: js.UndefOr[UnifiedNumberFormatOptionsNotation] = js.undefined
  var signDisplay: js.UndefOr[UnifiedNumberFormatOptionsSignDisplay] = js.undefined
  var style: js.UndefOr[String with UnifiedNumberFormatOptionsStyle] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var unitDisplay: js.UndefOr[UnifiedNumberFormatOptionsUnitDisplay] = js.undefined
  var useGrouping: js.UndefOr[Boolean] = js.undefined
  var value: Double
}

object UnifiedNumberFormatOption {
  @scala.inline
  def apply(
    value: Double,
    compactDisplay: UnifiedNumberFormatOptionsCompactDisplay = null,
    currency: String = null,
    currencyDisplay: String with UnifiedNumberFormatOptionsCurrencyDisplay = null,
    currencySign: UnifiedNumberFormatOptionsCurrencySign = null,
    format: String = null,
    localeMatcher: String with UnifiedNumberFormatOptionsLocaleMatcher = null,
    maximumFractionDigits: js.UndefOr[Double] = js.undefined,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumFractionDigits: js.UndefOr[Double] = js.undefined,
    minimumIntegerDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
    notation: UnifiedNumberFormatOptionsNotation = null,
    signDisplay: UnifiedNumberFormatOptionsSignDisplay = null,
    style: String with UnifiedNumberFormatOptionsStyle = null,
    unit: Unit = null,
    unitDisplay: UnifiedNumberFormatOptionsUnitDisplay = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): UnifiedNumberFormatOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumIntegerDigits)) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatOption]
  }
}

