package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingInformation extends js.Object {
  var address: stripeDashV3Lib.stripeNs.OwnerAddress
  var carrier: java.lang.String
  var name: java.lang.String
  var phone: java.lang.String
  var tracking_number: java.lang.String
}

object ShippingInformation {
  @scala.inline
  def apply(
    address: stripeDashV3Lib.stripeNs.OwnerAddress,
    carrier: java.lang.String,
    name: java.lang.String,
    phone: java.lang.String,
    tracking_number: java.lang.String
  ): ShippingInformation = {
    val __obj = js.Dynamic.literal(address = address, carrier = carrier, name = name, phone = phone, tracking_number = tracking_number)
  
    __obj.asInstanceOf[ShippingInformation]
  }
}

