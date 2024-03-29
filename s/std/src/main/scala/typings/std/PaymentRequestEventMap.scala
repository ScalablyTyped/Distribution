package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestEventMap extends StObject {
  
  /* standard dom */
  var paymentmethodchange: Event
}
object PaymentRequestEventMap {
  
  inline def apply(paymentmethodchange: Event): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(paymentmethodchange = paymentmethodchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentRequestEventMap] (val x: Self) extends AnyVal {
    
    inline def setPaymentmethodchange(value: Event): Self = StObject.set(x, "paymentmethodchange", value.asInstanceOf[js.Any])
  }
}
