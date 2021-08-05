package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var amount: Double
  
  var created: Double
  
  var id: String
  
  var price: Double
  
  var remainingAmount: Double
  
  var resourceType: MarketResourceConstant
  
  var roomName: js.UndefOr[String] = js.undefined
  
  var totalAmount: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object Order {
  
  inline def apply(
    amount: Double,
    created: Double,
    id: String,
    price: Double,
    remainingAmount: Double,
    resourceType: MarketResourceConstant,
    `type`: String
  ): Order = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], remainingAmount = remainingAmount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setRemainingAmount(value: Double): Self = StObject.set(x, "remainingAmount", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    inline def setTotalAmount(value: Double): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountUndefined: Self = StObject.set(x, "totalAmount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
