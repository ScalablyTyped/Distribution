package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeCard extends js.Object {
  
  var address_city: js.UndefOr[String] = js.native
  
  var address_country: js.UndefOr[String] = js.native
  
  var address_line1: js.UndefOr[String] = js.native
  
  var address_line2: js.UndefOr[String] = js.native
  
  var address_state: js.UndefOr[String] = js.native
  
  var address_zip: js.UndefOr[String] = js.native
  
  var brand: js.UndefOr[StripeCardDataBrand] = js.native
  
  var country: js.UndefOr[String] = js.native
  
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit = js.native
  
  var exp_month: Double = js.native
  
  var exp_year: Double = js.native
  
  var funding: js.UndefOr[StripeCardDataFunding] = js.native
  
  var last4: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `object`: String = js.native
  
  def validateCVC(cardCVC: String): Boolean = js.native
  
  def validateCardNumber(cardNumber: String): Boolean = js.native
  
  def validateExpiry(month: String, year: String): Boolean = js.native
}
object StripeCard {
  
  @scala.inline
  def apply(
    createToken: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit,
    exp_month: Double,
    exp_year: Double,
    last4: String,
    `object`: String,
    validateCVC: String => Boolean,
    validateCardNumber: String => Boolean,
    validateExpiry: (String, String) => Boolean
  ): StripeCard = {
    val __obj = js.Dynamic.literal(createToken = js.Any.fromFunction2(createToken), exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], validateCVC = js.Any.fromFunction1(validateCVC), validateCardNumber = js.Any.fromFunction1(validateCardNumber), validateExpiry = js.Any.fromFunction2(validateExpiry))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCard]
  }
  
  @scala.inline
  implicit class StripeCardOps[Self <: StripeCard] (val x: Self) extends AnyVal {
    
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
    def setCreateToken(
      value: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit
    ): Self = this.set("createToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateCVC(value: String => Boolean): Self = this.set("validateCVC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCardNumber(value: String => Boolean): Self = this.set("validateCardNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateExpiry(value: (String, String) => Boolean): Self = this.set("validateExpiry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddress_city(value: String): Self = this.set("address_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_city: Self = this.set("address_city", js.undefined)
    
    @scala.inline
    def setAddress_country(value: String): Self = this.set("address_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_country: Self = this.set("address_country", js.undefined)
    
    @scala.inline
    def setAddress_line1(value: String): Self = this.set("address_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_line1: Self = this.set("address_line1", js.undefined)
    
    @scala.inline
    def setAddress_line2(value: String): Self = this.set("address_line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_line2: Self = this.set("address_line2", js.undefined)
    
    @scala.inline
    def setAddress_state(value: String): Self = this.set("address_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_state: Self = this.set("address_state", js.undefined)
    
    @scala.inline
    def setAddress_zip(value: String): Self = this.set("address_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_zip: Self = this.set("address_zip", js.undefined)
    
    @scala.inline
    def setBrand(value: StripeCardDataBrand): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setFunding(value: StripeCardDataFunding): Self = this.set("funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunding: Self = this.set("funding", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
