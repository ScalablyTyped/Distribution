package typings.stripeDashV3.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddress extends js.Object {
  var addressLine: js.Array[String]
  var city: String
  var country: String
  var dependentLocality: js.UndefOr[String] = js.undefined
  var phone: String
  var postalCode: String
  var recipient: String
  var region: String
  var sortingCode: js.UndefOr[String] = js.undefined
}

object ShippingAddress {
  @scala.inline
  def apply(
    addressLine: js.Array[String],
    city: String,
    country: String,
    phone: String,
    postalCode: String,
    recipient: String,
    region: String,
    dependentLocality: String = null,
    sortingCode: String = null
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine, city = city, country = country, phone = phone, postalCode = postalCode, recipient = recipient, region = region)
    if (dependentLocality != null) __obj.updateDynamic("dependentLocality")(dependentLocality)
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode)
    __obj.asInstanceOf[ShippingAddress]
  }
}

