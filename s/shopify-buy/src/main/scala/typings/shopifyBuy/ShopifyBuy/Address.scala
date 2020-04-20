package typings.shopifyBuy.ShopifyBuy

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
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

