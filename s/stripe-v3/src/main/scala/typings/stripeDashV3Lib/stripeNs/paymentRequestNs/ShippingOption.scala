package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingOption extends js.Object {
  var amount: scala.Double
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var label: java.lang.String
}

object ShippingOption {
  @scala.inline
  def apply(
    amount: scala.Double,
    id: java.lang.String,
    label: java.lang.String,
    detail: java.lang.String = null
  ): ShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount, id = id, label = label)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    __obj.asInstanceOf[ShippingOption]
  }
}

