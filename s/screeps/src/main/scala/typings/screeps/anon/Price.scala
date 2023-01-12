package typings.screeps.anon

import typings.screeps.MarketResourceConstant
import typings.screeps.ORDER_BUY
import typings.screeps.ORDER_SELL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  var price: Double
  
  var resourceType: MarketResourceConstant
  
  var roomName: js.UndefOr[String] = js.undefined
  
  var totalAmount: Double
  
  var `type`: ORDER_BUY | ORDER_SELL
}
object Price {
  
  inline def apply(
    price: Double,
    resourceType: MarketResourceConstant,
    totalAmount: Double,
    `type`: ORDER_BUY | ORDER_SELL
  ): Price = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Price] (val x: Self) extends AnyVal {
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    inline def setTotalAmount(value: Double): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    inline def setType(value: ORDER_BUY | ORDER_SELL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
