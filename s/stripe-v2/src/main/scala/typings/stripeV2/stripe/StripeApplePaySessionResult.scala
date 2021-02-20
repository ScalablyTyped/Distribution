package typings.stripeV2.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeApplePaySessionResult extends StObject {
  
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.native
  
  var shippingMethod: js.UndefOr[StripeApplePayShippingMethod] = js.native
  
  var token: StripeCardTokenResponse = js.native
}
object StripeApplePaySessionResult {
  
  @scala.inline
  def apply(token: StripeCardTokenResponse): StripeApplePaySessionResult = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePaySessionResult]
  }
  
  @scala.inline
  implicit class StripeApplePaySessionResultMutableBuilder[Self <: StripeApplePaySessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShippingContact(value: StripeApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    @scala.inline
    def setShippingMethod(value: StripeApplePayShippingMethod): Self = StObject.set(x, "shippingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingMethodUndefined: Self = StObject.set(x, "shippingMethod", js.undefined)
    
    @scala.inline
    def setToken(value: StripeCardTokenResponse): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
