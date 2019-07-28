package typings.stripeDashV3.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingDetails extends js.Object {
  var address: ShippingDetailsAddress
  var carrier: String | Null
  var name: String | Null
  var phone: String | Null
  var tracking_number: String | Null
}

object ShippingDetails {
  @scala.inline
  def apply(
    address: ShippingDetailsAddress,
    carrier: String = null,
    name: String = null,
    phone: String = null,
    tracking_number: String = null
  ): ShippingDetails = {
    val __obj = js.Dynamic.literal(address = address)
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (tracking_number != null) __obj.updateDynamic("tracking_number")(tracking_number)
    __obj.asInstanceOf[ShippingDetails]
  }
}

