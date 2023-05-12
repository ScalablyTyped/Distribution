package typings.recurlyRecurlyJs.libApplePayNativeMod

import typings.recurlyRecurlyJs.libTokenMod.TokenPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayPaymentAuthorizedEvent extends StObject {
  
  var gatewayToken: js.UndefOr[String] = js.undefined
  
  /**
    * The authorized payment information for this transaction.
    */
  var payment: ApplePayPayment
  
  var recurlyToken: TokenPayload
}
object ApplePayPaymentAuthorizedEvent {
  
  inline def apply(payment: ApplePayPayment, recurlyToken: TokenPayload): ApplePayPaymentAuthorizedEvent = {
    val __obj = js.Dynamic.literal(payment = payment.asInstanceOf[js.Any], recurlyToken = recurlyToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentAuthorizedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentAuthorizedEvent] (val x: Self) extends AnyVal {
    
    inline def setGatewayToken(value: String): Self = StObject.set(x, "gatewayToken", value.asInstanceOf[js.Any])
    
    inline def setGatewayTokenUndefined: Self = StObject.set(x, "gatewayToken", js.undefined)
    
    inline def setPayment(value: ApplePayPayment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setRecurlyToken(value: TokenPayload): Self = StObject.set(x, "recurlyToken", value.asInstanceOf[js.Any])
  }
}
