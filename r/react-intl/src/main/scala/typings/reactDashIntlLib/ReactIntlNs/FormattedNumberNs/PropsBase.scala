package typings
package reactDashIntlLib.ReactIntlNs.FormattedNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsBase
  extends stdLib.IntlNs.NumberFormatOptions {
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object PropsBase {
  @scala.inline
  def apply(
    currency: java.lang.String = null,
    currencyDisplay: java.lang.String = null,
    format: java.lang.String = null,
    localeMatcher: java.lang.String = null,
    maximumFractionDigits: scala.Int | scala.Double = null,
    maximumSignificantDigits: scala.Int | scala.Double = null,
    minimumFractionDigits: scala.Int | scala.Double = null,
    minimumIntegerDigits: scala.Int | scala.Double = null,
    minimumSignificantDigits: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  ): PropsBase = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay)
    if (format != null) __obj.updateDynamic("format")(format)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[PropsBase]
  }
}

