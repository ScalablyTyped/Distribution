package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeApplePayPaymentRequest extends js.Object {
  
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
  implicit class StripeApplePayPaymentRequestOps[Self <: StripeApplePayPaymentRequest] (val x: Self) extends AnyVal {
    
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
    def setBillingContact(value: StripeApplePayPaymentContact): Self = this.set("billingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: StripeApplePayLineItem): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsVarargs(value: StripeApplePayLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[StripeApplePayLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setRequiredBillingContactFieldsVarargs(value: StripeApplePayBillingContactField*): Self = this.set("requiredBillingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setRequiredBillingContactFields(value: js.Array[StripeApplePayBillingContactField]): Self = this.set("requiredBillingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredBillingContactFields: Self = this.set("requiredBillingContactFields", js.undefined)
    
    @scala.inline
    def setRequiredShippingContactFieldsVarargs(value: StripeApplePayShippingContactField*): Self = this.set("requiredShippingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setRequiredShippingContactFields(value: js.Array[StripeApplePayShippingContactField]): Self = this.set("requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredShippingContactFields: Self = this.set("requiredShippingContactFields", js.undefined)
    
    @scala.inline
    def setShippingContact(value: StripeApplePayPaymentContact): Self = this.set("shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingContact: Self = this.set("shippingContact", js.undefined)
    
    @scala.inline
    def setShippingMethodsVarargs(value: StripeApplePayShippingMethod*): Self = this.set("shippingMethods", js.Array(value :_*))
    
    @scala.inline
    def setShippingMethods(value: js.Array[StripeApplePayShippingMethod]): Self = this.set("shippingMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingMethods: Self = this.set("shippingMethods", js.undefined)
    
    @scala.inline
    def setShippingTypeVarargs(value: StripeApplePayShipping*): Self = this.set("shippingType", js.Array(value :_*))
    
    @scala.inline
    def setShippingType(value: js.Array[StripeApplePayShipping]): Self = this.set("shippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingType: Self = this.set("shippingType", js.undefined)
  }
}
