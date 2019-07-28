package typings.stripeDashV3.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingOption extends js.Object {
  var amount: Double
  var detail: js.UndefOr[String] = js.undefined
  var id: String
  var label: String
}

object ShippingOption {
  @scala.inline
  def apply(amount: Double, id: String, label: String, detail: String = null): ShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount, id = id, label = label)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    __obj.asInstanceOf[ShippingOption]
  }
}

