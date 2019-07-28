package typings.reactDashIntl.ReactIntlNs.FormattedNumberNs

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends PropsBase {
  var children: js.UndefOr[js.Function1[/* formattedNumber */ String, ReactNode]] = js.undefined
  var value: Double
}

object Props {
  @scala.inline
  def apply(
    value: Double,
    children: /* formattedNumber */ String => ReactNode = null,
    currency: String = null,
    currencyDisplay: String = null,
    format: String = null,
    localeMatcher: String = null,
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumIntegerDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    style: String = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(value = value)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
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
    __obj.asInstanceOf[Props]
  }
}

