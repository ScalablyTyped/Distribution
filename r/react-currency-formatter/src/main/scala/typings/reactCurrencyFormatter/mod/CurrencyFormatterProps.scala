package typings.reactCurrencyFormatter.mod

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
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyFormatterProps]
  }
}

