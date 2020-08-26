package typings.shopifyPrime.addressMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends ShopifyObject {
  /**
    * The mailing address.
    */
  var address1: js.UndefOr[String] = js.native
  /**
    * An additional field for the mailing address.
    */
  var address2: js.UndefOr[String] = js.native
  /**
    * The city.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The company.
    */
  var company: js.UndefOr[String] = js.native
  /**
    * The country.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The two-letter country code corresponding to the country.
    */
  var country_code: js.UndefOr[String] = js.native
  /**
    * The normalized country name.
    */
  var country_name: js.UndefOr[String] = js.native
  /**
    * Indicates whether this address is the default address.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * The first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The phone number.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The province or state name
    */
  var province: js.UndefOr[String] = js.native
  /**
    * The two-letter province or state code.
    */
  var province_code: js.UndefOr[String] = js.native
  /**
    * The ZIP or postal code.
    */
  var zip: js.UndefOr[String] = js.native
}

object Address {
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
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
    def deleteAddress1: Self = this.set("address1", js.undefined)
    @scala.inline
    def setAddress2(value: String): Self = this.set("address2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress2: Self = this.set("address2", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry_code: Self = this.set("country_code", js.undefined)
    @scala.inline
    def setCountry_name(value: String): Self = this.set("country_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry_name: Self = this.set("country_name", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
    @scala.inline
    def setProvince_code(value: String): Self = this.set("province_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvince_code: Self = this.set("province_code", js.undefined)
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
  
}

