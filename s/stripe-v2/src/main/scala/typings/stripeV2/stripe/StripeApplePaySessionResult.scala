package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeApplePaySessionResult extends js.Object {
  
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
  implicit class StripeApplePaySessionResultOps[Self <: StripeApplePaySessionResult] (val x: Self) extends AnyVal {
    
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
    def setToken(value: StripeCardTokenResponse): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingContact(value: StripeApplePayPaymentContact): Self = this.set("shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingContact: Self = this.set("shippingContact", js.undefined)
    
    @scala.inline
    def setShippingMethod(value: StripeApplePayShippingMethod): Self = this.set("shippingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingMethod: Self = this.set("shippingMethod", js.undefined)
  }
}
