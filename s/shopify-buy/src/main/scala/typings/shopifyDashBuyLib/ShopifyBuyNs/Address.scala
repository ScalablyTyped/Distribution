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
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, city = city, company = company, country = country, firstName = firstName, lastName = lastName, phone = phone, province = province, zip = zip)
  
    __obj.asInstanceOf[Address]
  }
}

