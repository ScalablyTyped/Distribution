package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentItem extends js.Object {
  var amount: PaymentCurrencyAmount
  var label: java.lang.String
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}

object PaymentItem {
  @scala.inline
  def apply(
    amount: PaymentCurrencyAmount,
    label: java.lang.String,
    pending: js.UndefOr[scala.Boolean] = js.undefined
  ): PaymentItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentItem]
  }
}

