package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartDeliveryOption extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var deliveryMethodType: DeliveryMethodType
  
  var description: js.UndefOr[String] = js.undefined
  
  var estimatedCost: MoneyV2
  
  var handle: String
  
  var title: js.UndefOr[String] = js.undefined
}
object CartDeliveryOption {
  
  inline def apply(deliveryMethodType: DeliveryMethodType, estimatedCost: MoneyV2, handle: String): CartDeliveryOption = {
    val __obj = js.Dynamic.literal(deliveryMethodType = deliveryMethodType.asInstanceOf[js.Any], estimatedCost = estimatedCost.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartDeliveryOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartDeliveryOption] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDeliveryMethodType(value: DeliveryMethodType): Self = StObject.set(x, "deliveryMethodType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEstimatedCost(value: MoneyV2): Self = StObject.set(x, "estimatedCost", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
