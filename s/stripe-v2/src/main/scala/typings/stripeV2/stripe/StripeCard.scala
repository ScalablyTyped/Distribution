package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeCard extends StObject {
  
  var address_city: js.UndefOr[String] = js.undefined
  
  var address_country: js.UndefOr[String] = js.undefined
  
  var address_line1: js.UndefOr[String] = js.undefined
  
  var address_line2: js.UndefOr[String] = js.undefined
  
  var address_state: js.UndefOr[String] = js.undefined
  
  var address_zip: js.UndefOr[String] = js.undefined
  
  var brand: js.UndefOr[StripeCardDataBrand] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit
  
  var exp_month: Double
  
  var exp_year: Double
  
  var funding: js.UndefOr[StripeCardDataFunding] = js.undefined
  
  var last4: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var `object`: String
  
  def validateCVC(cardCVC: String): Boolean
  
  def validateCardNumber(cardNumber: String): Boolean
  
  def validateExpiry(month: String, year: String): Boolean
}
object StripeCard {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: StripeCard] (val x: Self) extends AnyVal {
    
    inline def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
    
    inline def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
    
    inline def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
    
    inline def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
    
    inline def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
    
    inline def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
    
    inline def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
    
    inline def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
    
    inline def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
    
    inline def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
    
    inline def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
    
    inline def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
    
    inline def setBrand(value: StripeCardDataBrand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCreateToken(
      value: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Unit
    ): Self = StObject.set(x, "createToken", js.Any.fromFunction2(value))
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setFunding(value: StripeCardDataFunding): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    inline def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setValidateCVC(value: String => Boolean): Self = StObject.set(x, "validateCVC", js.Any.fromFunction1(value))
    
    inline def setValidateCardNumber(value: String => Boolean): Self = StObject.set(x, "validateCardNumber", js.Any.fromFunction1(value))
    
    inline def setValidateExpiry(value: (String, String) => Boolean): Self = StObject.set(x, "validateExpiry", js.Any.fromFunction2(value))
  }
}
