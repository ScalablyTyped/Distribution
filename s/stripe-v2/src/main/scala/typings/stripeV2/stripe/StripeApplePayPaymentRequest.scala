package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeApplePayPaymentRequest extends StObject {
  
  var billingContact: StripeApplePayPaymentContact
  
  var countryCode: String
  
  var currencyCode: String
  
  var lineItems: js.UndefOr[js.Array[StripeApplePayLineItem]] = js.undefined
  
  var requiredBillingContactFields: js.UndefOr[js.Array[StripeApplePayBillingContactField]] = js.undefined
  
  var requiredShippingContactFields: js.UndefOr[js.Array[StripeApplePayShippingContactField]] = js.undefined
  
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.undefined
  
  var shippingMethods: js.UndefOr[js.Array[StripeApplePayShippingMethod]] = js.undefined
  
  var shippingType: js.UndefOr[js.Array[StripeApplePayShipping]] = js.undefined
  
  var total: StripeApplePayLineItem
}
object StripeApplePayPaymentRequest {
  
  inline def apply(
    billingContact: StripeApplePayPaymentContact,
    countryCode: String,
    currencyCode: String,
    total: StripeApplePayLineItem
  ): StripeApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(billingContact = billingContact.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayPaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeApplePayPaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setBillingContact(value: StripeApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setLineItems(value: js.Array[StripeApplePayLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: StripeApplePayLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setRequiredBillingContactFields(value: js.Array[StripeApplePayBillingContactField]): Self = StObject.set(x, "requiredBillingContactFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredBillingContactFieldsUndefined: Self = StObject.set(x, "requiredBillingContactFields", js.undefined)
    
    inline def setRequiredBillingContactFieldsVarargs(value: StripeApplePayBillingContactField*): Self = StObject.set(x, "requiredBillingContactFields", js.Array(value*))
    
    inline def setRequiredShippingContactFields(value: js.Array[StripeApplePayShippingContactField]): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
    
    inline def setRequiredShippingContactFieldsVarargs(value: StripeApplePayShippingContactField*): Self = StObject.set(x, "requiredShippingContactFields", js.Array(value*))
    
    inline def setShippingContact(value: StripeApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    inline def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    inline def setShippingMethods(value: js.Array[StripeApplePayShippingMethod]): Self = StObject.set(x, "shippingMethods", value.asInstanceOf[js.Any])
    
    inline def setShippingMethodsUndefined: Self = StObject.set(x, "shippingMethods", js.undefined)
    
    inline def setShippingMethodsVarargs(value: StripeApplePayShippingMethod*): Self = StObject.set(x, "shippingMethods", js.Array(value*))
    
    inline def setShippingType(value: js.Array[StripeApplePayShipping]): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
    
    inline def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
    
    inline def setShippingTypeVarargs(value: StripeApplePayShipping*): Self = StObject.set(x, "shippingType", js.Array(value*))
    
    inline def setTotal(value: StripeApplePayLineItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
