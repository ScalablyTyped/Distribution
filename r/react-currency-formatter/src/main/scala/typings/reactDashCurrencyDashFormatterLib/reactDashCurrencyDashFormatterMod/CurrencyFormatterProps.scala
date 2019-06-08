package typings
package reactDashCurrencyDashFormatterLib.reactDashCurrencyDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyFormatterProps extends js.Object {
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var quantity: scala.Double
  var symbol: js.UndefOr[java.lang.String] = js.undefined
}

object CurrencyFormatterProps {
  @scala.inline
  def apply(
    quantity: scala.Double,
    currency: java.lang.String = null,
    decimal: java.lang.String = null,
    group: java.lang.String = null,
    locale: java.lang.String = null,
    pattern: java.lang.String = null,
    symbol: java.lang.String = null
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

