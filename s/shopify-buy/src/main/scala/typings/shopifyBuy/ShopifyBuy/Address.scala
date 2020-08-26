package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address1: String = js.native
  var address2: String = js.native
  var city: String = js.native
  var company: String = js.native
  var country: String = js.native
  var firstName: String = js.native
  var lastName: String = js.native
  var phone: String = js.native
  var province: String = js.native
  var zip: String = js.native
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
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress1(value: String): Self = this.set("address1", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress2(value: String): Self = this.set("address2", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
  }
  
}

