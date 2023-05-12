package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayPaymentRequest extends StObject {
  
  /**
    * Billing contact information for the user.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * A set of line items that explain recurring payments and additional charges and discounts.
    */
  var lineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  /**
    * A property that requests a subscription.
    */
  var recurringPaymentRequest: js.UndefOr[ApplePayRecurringPaymentRequest] = js.undefined
  
  /**
    * The fields of shipping information the user must provide to fulfill the order.
    */
  var requiredShippingContactFields: js.UndefOr[js.Array[ApplePayContactField]] = js.undefined
  
  /**
    * Shipping contact information for the user.
    */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * The payment networks the merchant supports. Only selects those networks that intersect with the merchant's
    * payment gateways configured in Recurly.
    */
  var supportedNetworks: js.UndefOr[String] = js.undefined
  
  /**
    * Total cost to display in the Apple Pay payment sheet. Required if `options.pricing` is not provided.
    */
  var total: ApplePayLineItem
}
object ApplePayPaymentRequest {
  
  inline def apply(total: ApplePayLineItem): ApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    inline def setLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setRecurringPaymentRequest(value: ApplePayRecurringPaymentRequest): Self = StObject.set(x, "recurringPaymentRequest", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentRequestUndefined: Self = StObject.set(x, "recurringPaymentRequest", js.undefined)
    
    inline def setRequiredShippingContactFields(value: js.Array[ApplePayContactField]): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
    
    inline def setRequiredShippingContactFieldsVarargs(value: ApplePayContactField*): Self = StObject.set(x, "requiredShippingContactFields", js.Array(value*))
    
    inline def setShippingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    inline def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    inline def setSupportedNetworks(value: String): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworksUndefined: Self = StObject.set(x, "supportedNetworks", js.undefined)
    
    inline def setTotal(value: ApplePayLineItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
