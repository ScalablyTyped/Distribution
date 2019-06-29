package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingDetails extends js.Object {
  var address: ShippingDetailsAddress
  var carrier: java.lang.String | scala.Null
  var name: java.lang.String | scala.Null
  var phone: java.lang.String | scala.Null
  var tracking_number: java.lang.String | scala.Null
}

object ShippingDetails {
  @scala.inline
  def apply(
    address: ShippingDetailsAddress,
    carrier: java.lang.String = null,
    name: java.lang.String = null,
    phone: java.lang.String = null,
    tracking_number: java.lang.String = null
  ): ShippingDetails = {
    val __obj = js.Dynamic.literal(address = address)
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (tracking_number != null) __obj.updateDynamic("tracking_number")(tracking_number)
    __obj.asInstanceOf[ShippingDetails]
  }
}

