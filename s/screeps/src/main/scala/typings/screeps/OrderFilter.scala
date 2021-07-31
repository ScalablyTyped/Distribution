package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderFilter extends StObject {
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var created: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var price: js.UndefOr[Double] = js.undefined
  
  var remainingAmount: js.UndefOr[Double] = js.undefined
  
  var resourceType: js.UndefOr[MarketResourceConstant] = js.undefined
  
  var roomName: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object OrderFilter {
  
  @scala.inline
  def apply(): OrderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderFilter]
  }
  
  @scala.inline
  implicit class OrderFilterMutableBuilder[Self <: OrderFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setRemainingAmount(value: Double): Self = StObject.set(x, "remainingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingAmountUndefined: Self = StObject.set(x, "remainingAmount", js.undefined)
    
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
