package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableShippingRates extends StObject {
  
  var ready: Boolean
  
  var shippingRates: Null | js.Array[ShippingRate]
}
object AvailableShippingRates {
  
  inline def apply(ready: Boolean): AvailableShippingRates = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any], shippingRates = null)
    __obj.asInstanceOf[AvailableShippingRates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailableShippingRates] (val x: Self) extends AnyVal {
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setShippingRates(value: js.Array[ShippingRate]): Self = StObject.set(x, "shippingRates", value.asInstanceOf[js.Any])
    
    inline def setShippingRatesNull: Self = StObject.set(x, "shippingRates", null)
    
    inline def setShippingRatesVarargs(value: ShippingRate*): Self = StObject.set(x, "shippingRates", js.Array(value*))
  }
}
