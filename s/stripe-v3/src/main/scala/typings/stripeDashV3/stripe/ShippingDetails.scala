package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingDetails extends js.Object {
  /** Shipping address. */
  var address: ShippingDetailsAddress
  /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
  var carrier: js.UndefOr[String] = js.undefined
  /** Recipient name. */
  var name: String
  /** Recipient phone (including extension). */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * The tracking number for a physical product, obtained from the delivery service.
    * If multiple tracking numbers were generated for this purchase, please separate them with commas.
    */
  var tracking_number: js.UndefOr[String] = js.undefined
}

object ShippingDetails {
  @scala.inline
  def apply(
    address: ShippingDetailsAddress,
    name: String,
    carrier: String = null,
    phone: String = null,
    tracking_number: String = null
  ): ShippingDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (tracking_number != null) __obj.updateDynamic("tracking_number")(tracking_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingDetails]
  }
}

