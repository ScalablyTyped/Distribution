package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeCard extends StObject {
  
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
  implicit class StripeCardMutableBuilder[Self <: StripeCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
    
    @scala.inline
    def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
    
    @scala.inline
    def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
    
    @scala.inline
    def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
    
    @scala.inline
    def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
    
    @scala.inline
    def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
    
    @scala.inline
    def setBrand(value: StripeCardDataBrand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCreateToken(
      value: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit
    ): Self = StObject.set(x, "createToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunding(value: StripeCardDataFunding): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateCVC(value: String => Boolean): Self = StObject.set(x, "validateCVC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateCardNumber(value: String => Boolean): Self = StObject.set(x, "validateCardNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateExpiry(value: (String, String) => Boolean): Self = StObject.set(x, "validateExpiry", js.Any.fromFunction2(value))
  }
}
