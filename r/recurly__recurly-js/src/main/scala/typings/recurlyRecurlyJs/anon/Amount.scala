package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount extends StObject {
  
  var amount: js.UndefOr[String] = js.undefined
  
  var billingAgreementDescription: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var enableShippingAddress: js.UndefOr[Boolean] = js.undefined
  
  var landingPageType: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var shippingAddressEditable: js.UndefOr[Boolean] = js.undefined
  
  var shippingAddressOverride: js.UndefOr[Any] = js.undefined
}
object Amount {
  
  inline def apply(): Amount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBillingAgreementDescription(value: String): Self = StObject.set(x, "billingAgreementDescription", value.asInstanceOf[js.Any])
    
    inline def setBillingAgreementDescriptionUndefined: Self = StObject.set(x, "billingAgreementDescription", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableShippingAddress(value: Boolean): Self = StObject.set(x, "enableShippingAddress", value.asInstanceOf[js.Any])
    
    inline def setEnableShippingAddressUndefined: Self = StObject.set(x, "enableShippingAddress", js.undefined)
    
    inline def setLandingPageType(value: String): Self = StObject.set(x, "landingPageType", value.asInstanceOf[js.Any])
    
    inline def setLandingPageTypeUndefined: Self = StObject.set(x, "landingPageType", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setShippingAddressEditable(value: Boolean): Self = StObject.set(x, "shippingAddressEditable", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressEditableUndefined: Self = StObject.set(x, "shippingAddressEditable", js.undefined)
    
    inline def setShippingAddressOverride(value: Any): Self = StObject.set(x, "shippingAddressOverride", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressOverrideUndefined: Self = StObject.set(x, "shippingAddressOverride", js.undefined)
  }
}
