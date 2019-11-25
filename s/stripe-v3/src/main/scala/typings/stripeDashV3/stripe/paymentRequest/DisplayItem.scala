package typings.stripeDashV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayItem extends js.Object {
  var amount: Double
  var label: String
  var pending: js.UndefOr[Boolean] = js.undefined
}

object DisplayItem {
  @scala.inline
  def apply(amount: Double, label: String, pending: js.UndefOr[Boolean] = js.undefined): DisplayItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayItem]
  }
}

