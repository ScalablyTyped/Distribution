package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address1: java.lang.String
  var address2: java.lang.String
  var city: java.lang.String
  var company: java.lang.String
  var country: java.lang.String
  var firstName: java.lang.String
  var lastName: java.lang.String
  var phone: java.lang.String
  var province: java.lang.String
  var zip: java.lang.String
}

object Address {
  @scala.inline
  def apply(
    address1: java.lang.String,
    address2: java.lang.String,
    city: java.lang.String,
    company: java.lang.String,
    country: java.lang.String,
    firstName: java.lang.String,
    lastName: java.lang.String,
    phone: java.lang.String,
    province: java.lang.String,
    zip: java.lang.String
  ): Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address1")(address1)
    __obj.updateDynamic("address2")(address2)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("firstName")(firstName)
    __obj.updateDynamic("lastName")(lastName)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("province")(province)
    __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[Address]
  }
}

