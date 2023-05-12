package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartBuyerIdentity extends StObject {
  
  var countryCode: js.UndefOr[CountryCode] = js.undefined
  
  var customer: js.UndefOr[Customer] = js.undefined
  
  var deliveryAddressPreferences: js.Array[DeliveryAddress]
  
  var email: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var purchasingCompany: js.UndefOr[PurchasingCompany] = js.undefined
}
object CartBuyerIdentity {
  
  inline def apply(deliveryAddressPreferences: js.Array[DeliveryAddress]): CartBuyerIdentity = {
    val __obj = js.Dynamic.literal(deliveryAddressPreferences = deliveryAddressPreferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartBuyerIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartBuyerIdentity] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCustomer(value: Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDeliveryAddressPreferences(value: js.Array[DeliveryAddress]): Self = StObject.set(x, "deliveryAddressPreferences", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddressPreferencesVarargs(value: DeliveryAddress*): Self = StObject.set(x, "deliveryAddressPreferences", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPurchasingCompany(value: PurchasingCompany): Self = StObject.set(x, "purchasingCompany", value.asInstanceOf[js.Any])
    
    inline def setPurchasingCompanyUndefined: Self = StObject.set(x, "purchasingCompany", js.undefined)
  }
}
