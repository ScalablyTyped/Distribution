package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingRate extends StObject {
  
  var handle: String
  
  var price: MoneyV2
  
  /**
    * @deprecated
    */
  var priceV2: MoneyV2
  
  var title: String
}
object ShippingRate {
  
  inline def apply(handle: String, price: MoneyV2, priceV2: MoneyV2, title: String): ShippingRate = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceV2 = priceV2.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingRate] (val x: Self) extends AnyVal {
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: MoneyV2): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceV2(value: MoneyV2): Self = StObject.set(x, "priceV2", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
