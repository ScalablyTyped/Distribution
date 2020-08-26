package typings.shopifyPrime.locationMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends ShopifyObject {
  /**
    * The first line of the address.
    */
  var address1: js.UndefOr[String] = js.native
  /**
    * The second line of the address.
    */
  var address2: js.UndefOr[String] = js.native
  /**
    * The city the location is in.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The country the location is in.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The two-letter code (ISO 3166-1 alpha-2 format) corresponding to country the location is in.
    */
  var country_code: js.UndefOr[String] = js.native
  /**
    * The date and time (ISO 8601 format) when the location was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Whether this is a fulfillment service location. If true, then the location is a fulfillment service location.
    * If false, then the location was created by the merchant and isn't tied to a fulfillment service.
    */
  var legacy: js.UndefOr[String] = js.native
  /**
    * The name of the location.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The phone number of the location. This value can contain special characters like - and +.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The province the location is in.
    */
  var province: js.UndefOr[String] = js.native
  /**
    * The two-letter code corresponding to province or state the location is in.
    */
  var province_code: js.UndefOr[String] = js.native
  /**
    * The date and time (ISO 8601 format) when the location was last updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * The zip or postal code.
    */
  var zip: js.UndefOr[String] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry_code: Self = this.set("country_code", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setLegacy(value: String): Self = this.set("legacy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacy: Self = this.set("legacy", js.undefined)
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
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
  
}

