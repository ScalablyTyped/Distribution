package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartDeliveryGroup
  extends StObject
     with Node {
  
  var cartLines: CartLine
  
  var deliveryAddress: MailingAddress
  
  var deliveryOptions: js.Array[CartDeliveryOption]
  
  var selectedDeliveryOption: js.UndefOr[CartDeliveryOption] = js.undefined
}
object CartDeliveryGroup {
  
  inline def apply(
    cartLines: CartLine,
    deliveryAddress: MailingAddress,
    deliveryOptions: js.Array[CartDeliveryOption],
    id: ID
  ): CartDeliveryGroup = {
    val __obj = js.Dynamic.literal(cartLines = cartLines.asInstanceOf[js.Any], deliveryAddress = deliveryAddress.asInstanceOf[js.Any], deliveryOptions = deliveryOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartDeliveryGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartDeliveryGroup] (val x: Self) extends AnyVal {
    
    inline def setCartLines(value: CartLine): Self = StObject.set(x, "cartLines", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddress(value: MailingAddress): Self = StObject.set(x, "deliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptions(value: js.Array[CartDeliveryOption]): Self = StObject.set(x, "deliveryOptions", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptionsVarargs(value: CartDeliveryOption*): Self = StObject.set(x, "deliveryOptions", js.Array(value*))
    
    inline def setSelectedDeliveryOption(value: CartDeliveryOption): Self = StObject.set(x, "selectedDeliveryOption", value.asInstanceOf[js.Any])
    
    inline def setSelectedDeliveryOptionUndefined: Self = StObject.set(x, "selectedDeliveryOption", js.undefined)
  }
}
