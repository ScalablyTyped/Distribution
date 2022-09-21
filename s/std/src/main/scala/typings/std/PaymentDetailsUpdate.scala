package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsUpdate
  extends StObject
     with PaymentDetailsBase {
  
  /* standard dom */
  var paymentMethodErrors: js.UndefOr[Any] = js.undefined
  
  /* standard dom */
  var total: js.UndefOr[PaymentItem] = js.undefined
}
object PaymentDetailsUpdate {
  
  inline def apply(): PaymentDetailsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsUpdate]
  }
  
  extension [Self <: PaymentDetailsUpdate](x: Self) {
    
    inline def setPaymentMethodErrors(value: Any): Self = StObject.set(x, "paymentMethodErrors", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodErrorsUndefined: Self = StObject.set(x, "paymentMethodErrors", js.undefined)
    
    inline def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
