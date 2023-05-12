package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartSelectedDeliveryOptionInput extends StObject {
  
  var deliveryGroupId: ID
  
  var deliveryOptionHandle: String
}
object CartSelectedDeliveryOptionInput {
  
  inline def apply(deliveryGroupId: ID, deliveryOptionHandle: String): CartSelectedDeliveryOptionInput = {
    val __obj = js.Dynamic.literal(deliveryGroupId = deliveryGroupId.asInstanceOf[js.Any], deliveryOptionHandle = deliveryOptionHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartSelectedDeliveryOptionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartSelectedDeliveryOptionInput] (val x: Self) extends AnyVal {
    
    inline def setDeliveryGroupId(value: ID): Self = StObject.set(x, "deliveryGroupId", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptionHandle(value: String): Self = StObject.set(x, "deliveryOptionHandle", value.asInstanceOf[js.Any])
  }
}
