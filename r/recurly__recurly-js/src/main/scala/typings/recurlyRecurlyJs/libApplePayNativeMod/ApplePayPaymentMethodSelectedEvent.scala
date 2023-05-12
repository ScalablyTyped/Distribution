package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayPaymentMethodSelectedEvent extends StObject {
  
  /**
    * The card used to complete a payment.
    */
  var paymentMethod: ApplePayPaymentMethod
}
object ApplePayPaymentMethodSelectedEvent {
  
  inline def apply(paymentMethod: ApplePayPaymentMethod): ApplePayPaymentMethodSelectedEvent = {
    val __obj = js.Dynamic.literal(paymentMethod = paymentMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethodSelectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentMethodSelectedEvent] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethod(value: ApplePayPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
  }
}
