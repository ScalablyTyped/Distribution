package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartBuyerIdentityInput extends StObject {
  
  var countryCode: js.UndefOr[CountryCode] = js.undefined
  
  var customerAccessToken: js.UndefOr[String] = js.undefined
  
  var deliveryAddressPreferences: DeliveryAddressInput
  
  var email: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
}
object CartBuyerIdentityInput {
  
  inline def apply(deliveryAddressPreferences: DeliveryAddressInput): CartBuyerIdentityInput = {
    val __obj = js.Dynamic.literal(deliveryAddressPreferences = deliveryAddressPreferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartBuyerIdentityInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartBuyerIdentityInput] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCustomerAccessToken(value: String): Self = StObject.set(x, "customerAccessToken", value.asInstanceOf[js.Any])
    
    inline def setCustomerAccessTokenUndefined: Self = StObject.set(x, "customerAccessToken", js.undefined)
    
    inline def setDeliveryAddressPreferences(value: DeliveryAddressInput): Self = StObject.set(x, "deliveryAddressPreferences", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
