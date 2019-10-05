package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address1: String
  var address2: String
  var city: String
  var company: String
  var country: String
  var firstName: String
  var lastName: String
  var phone: String
  var province: String
  var zip: String
}

object Address {
  @scala.inline
  def apply(
    address1: String,
    address2: String,
    city: String,
    company: String,
    country: String,
    firstName: String,
    lastName: String,
    phone: String,
    province: String,
    zip: String
  ): Address = {
    val __obj = js.Dynamic.literal(address1 = address1, address2 = address2, city = city, company = company, country = country, firstName = firstName, lastName = lastName, phone = phone, province = province, zip = zip)
  
    __obj.asInstanceOf[Address]
  }
}

