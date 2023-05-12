package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutCreateInput extends StObject {
  
  var allowPartialAddresses: js.UndefOr[Boolean] = js.undefined
  
  var buyerIdentity: js.UndefOr[CheckoutBuyerIdentityInput] = js.undefined
  
  var customAttributes: js.UndefOr[js.Array[AttributeInput]] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var lineItems: js.UndefOr[js.Array[CheckoutLineItemInput]] = js.undefined
  
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var presentmentCurrencyCode: js.UndefOr[CurrencyCode] = js.undefined
  
  var shippingAddress: js.UndefOr[MailingAddressInput] = js.undefined
}
object CheckoutCreateInput {
  
  inline def apply(): CheckoutCreateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckoutCreateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutCreateInput] (val x: Self) extends AnyVal {
    
    inline def setAllowPartialAddresses(value: Boolean): Self = StObject.set(x, "allowPartialAddresses", value.asInstanceOf[js.Any])
    
    inline def setAllowPartialAddressesUndefined: Self = StObject.set(x, "allowPartialAddresses", js.undefined)
    
    inline def setBuyerIdentity(value: CheckoutBuyerIdentityInput): Self = StObject.set(x, "buyerIdentity", value.asInstanceOf[js.Any])
    
    inline def setBuyerIdentityUndefined: Self = StObject.set(x, "buyerIdentity", js.undefined)
    
    inline def setCustomAttributes(value: js.Array[AttributeInput]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: AttributeInput*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLineItems(value: js.Array[CheckoutLineItemInput]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: CheckoutLineItemInput*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPresentmentCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "presentmentCurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setPresentmentCurrencyCodeUndefined: Self = StObject.set(x, "presentmentCurrencyCode", js.undefined)
    
    inline def setShippingAddress(value: MailingAddressInput): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
  }
}
