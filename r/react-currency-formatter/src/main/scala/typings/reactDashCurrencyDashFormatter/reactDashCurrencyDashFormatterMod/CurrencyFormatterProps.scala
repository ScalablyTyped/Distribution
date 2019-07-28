package typings.reactDashCurrencyDashFormatter.reactDashCurrencyDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyFormatterProps extends js.Object {
  var currency: js.UndefOr[String] = js.undefined
  var decimal: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var quantity: Double
  var symbol: js.UndefOr[String] = js.undefined
}

object CurrencyFormatterProps {
  @scala.inline
  def apply(
    quantity: Double,
    currency: String = null,
    decimal: String = null,
    group: String = null,
    locale: String = null,
    pattern: String = null,
    symbol: String = null
  ): CurrencyFormatterProps = {
    val __obj = js.Dynamic.literal(quantity = quantity)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (group != null) __obj.updateDynamic("group")(group)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[CurrencyFormatterProps]
  }
}

