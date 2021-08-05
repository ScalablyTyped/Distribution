package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeApplePaySessionResult extends StObject {
  
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.undefined
  
  var shippingMethod: js.UndefOr[StripeApplePayShippingMethod] = js.undefined
  
  var token: StripeCardTokenResponse
}
object StripeApplePaySessionResult {
  
  inline def apply(token: StripeCardTokenResponse): StripeApplePaySessionResult = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePaySessionResult]
  }
  
  extension [Self <: StripeApplePaySessionResult](x: Self) {
    
    inline def setShippingContact(value: StripeApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    inline def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    inline def setShippingMethod(value: StripeApplePayShippingMethod): Self = StObject.set(x, "shippingMethod", value.asInstanceOf[js.Any])
    
    inline def setShippingMethodUndefined: Self = StObject.set(x, "shippingMethod", js.undefined)
    
    inline def setToken(value: StripeCardTokenResponse): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
