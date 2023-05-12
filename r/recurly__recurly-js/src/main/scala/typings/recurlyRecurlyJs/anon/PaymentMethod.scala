package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.libApplePayNativeMod.ApplePayPaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethod extends StObject {
  
  /**
    * Information about the card used in the transaction.
    */
  var paymentMethod: ApplePayPaymentMethod
}
object PaymentMethod {
  
  inline def apply(paymentMethod: ApplePayPaymentMethod): PaymentMethod = {
    val __obj = js.Dynamic.literal(paymentMethod = paymentMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethod(value: ApplePayPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
  }
}
