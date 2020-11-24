package typings.recurlyRecurlyJs.addressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
  /**
    * First line of a street address
    */
  var address1: js.UndefOr[String] = js.native
  
  /**
    * Second line of a street address
    */
  var address2: js.UndefOr[String] = js.native
  
  /**
    * Town or locality
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * {@link http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2| [ISO 3166-1 alpha-2]} country code
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * Cardholder first name
    */
  var first_name: String = js.native
  
  /**
    * Cardholder last name
    */
  var last_name: String = js.native
  
  /**
    * Phone number
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * Postal code
    */
  var postal_code: js.UndefOr[String] = js.native
  
  /**
    * Province or region
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Customer VAT number. Used for VAT exclusion
    */
  var vat_number: js.UndefOr[String] = js.native
}
object Address {
  
  @scala.inline
  def apply(first_name: String, last_name: String): Address = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
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
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
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
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPostal_code(value: String): Self = this.set("postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostal_code: Self = this.set("postal_code", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setVat_number(value: String): Self = this.set("vat_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVat_number: Self = this.set("vat_number", js.undefined)
  }
}
