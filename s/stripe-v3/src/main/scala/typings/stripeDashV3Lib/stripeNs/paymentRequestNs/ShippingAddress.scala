package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingAddress extends js.Object {
  var addressLine: js.Array[java.lang.String]
  var city: java.lang.String
  var country: java.lang.String
  var dependentLocality: js.UndefOr[java.lang.String] = js.undefined
  var phone: java.lang.String
  var postalCode: java.lang.String
  var recipient: java.lang.String
  var region: java.lang.String
  var sortingCode: js.UndefOr[java.lang.String] = js.undefined
}

object ShippingAddress {
  @scala.inline
  def apply(
    addressLine: js.Array[java.lang.String],
    city: java.lang.String,
    country: java.lang.String,
    phone: java.lang.String,
    postalCode: java.lang.String,
    recipient: java.lang.String,
    region: java.lang.String,
    dependentLocality: java.lang.String = null,
    sortingCode: java.lang.String = null
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine, city = city, country = country, phone = phone, postalCode = postalCode, recipient = recipient, region = region)
    if (dependentLocality != null) __obj.updateDynamic("dependentLocality")(dependentLocality)
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode)
    __obj.asInstanceOf[ShippingAddress]
  }
}

