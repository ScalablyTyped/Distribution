package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfillmentLineItem extends StObject {
  
  var lineItem: OrderLineItem
  
  var quantity: Double
}
object FulfillmentLineItem {
  
  inline def apply(lineItem: OrderLineItem, quantity: Double): FulfillmentLineItem = {
    val __obj = js.Dynamic.literal(lineItem = lineItem.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FulfillmentLineItem] (val x: Self) extends AnyVal {
    
    inline def setLineItem(value: OrderLineItem): Self = StObject.set(x, "lineItem", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
