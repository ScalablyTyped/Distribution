package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestEventMap extends StObject {
  
  var shippingaddresschange: Event
  
  var shippingoptionchange: Event
}
object PaymentRequestEventMap {
  
  inline def apply(shippingaddresschange: Event, shippingoptionchange: Event): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(shippingaddresschange = shippingaddresschange.asInstanceOf[js.Any], shippingoptionchange = shippingoptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
  
  extension [Self <: PaymentRequestEventMap](x: Self) {
    
    inline def setShippingaddresschange(value: Event): Self = StObject.set(x, "shippingaddresschange", value.asInstanceOf[js.Any])
    
    inline def setShippingoptionchange(value: Event): Self = StObject.set(x, "shippingoptionchange", value.asInstanceOf[js.Any])
  }
}
