package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeApplePayPaymentRequest extends StObject {
  
  var billingContact: StripeApplePayPaymentContact = js.native
  
  var countryCode: String = js.native
  
  var currencyCode: String = js.native
  
  var lineItems: js.UndefOr[js.Array[StripeApplePayLineItem]] = js.native
  
  var requiredBillingContactFields: js.UndefOr[js.Array[StripeApplePayBillingContactField]] = js.native
  
  var requiredShippingContactFields: js.UndefOr[js.Array[StripeApplePayShippingContactField]] = js.native
  
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.native
  
  var shippingMethods: js.UndefOr[js.Array[StripeApplePayShippingMethod]] = js.native
  
  var shippingType: js.UndefOr[js.Array[StripeApplePayShipping]] = js.native
  
  var total: StripeApplePayLineItem = js.native
}
object StripeApplePayPaymentRequest {
  
  @scala.inline
  def apply(
    billingContact: StripeApplePayPaymentContact,
    countryCode: String,
    currencyCode: String,
    total: StripeApplePayLineItem
  ): StripeApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(billingContact = billingContact.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayPaymentRequest]
  }
  
  @scala.inline
  implicit class StripeApplePayPaymentRequestMutableBuilder[Self <: StripeApplePayPaymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingContact(value: StripeApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItems(value: js.Array[StripeApplePayLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: StripeApplePayLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setRequiredBillingContactFields(value: js.Array[StripeApplePayBillingContactField]): Self = StObject.set(x, "requiredBillingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredBillingContactFieldsUndefined: Self = StObject.set(x, "requiredBillingContactFields", js.undefined)
    
    @scala.inline
    def setRequiredBillingContactFieldsVarargs(value: StripeApplePayBillingContactField*): Self = StObject.set(x, "requiredBillingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setRequiredShippingContactFields(value: js.Array[StripeApplePayShippingContactField]): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
    
    @scala.inline
    def setRequiredShippingContactFieldsVarargs(value: StripeApplePayShippingContactField*): Self = StObject.set(x, "requiredShippingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setShippingContact(value: StripeApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    @scala.inline
    def setShippingMethods(value: js.Array[StripeApplePayShippingMethod]): Self = StObject.set(x, "shippingMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingMethodsUndefined: Self = StObject.set(x, "shippingMethods", js.undefined)
    
    @scala.inline
    def setShippingMethodsVarargs(value: StripeApplePayShippingMethod*): Self = StObject.set(x, "shippingMethods", js.Array(value :_*))
    
    @scala.inline
    def setShippingType(value: js.Array[StripeApplePayShipping]): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
    
    @scala.inline
    def setShippingTypeVarargs(value: StripeApplePayShipping*): Self = StObject.set(x, "shippingType", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: StripeApplePayLineItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
