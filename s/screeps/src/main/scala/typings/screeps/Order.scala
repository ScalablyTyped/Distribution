package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends StObject {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var amount: Double = js.native
  
  var created: Double = js.native
  
  var id: String = js.native
  
  var price: Double = js.native
  
  var remainingAmount: Double = js.native
  
  var resourceType: MarketResourceConstant = js.native
  
  var roomName: js.UndefOr[String] = js.native
  
  var totalAmount: js.UndefOr[Double] = js.native
  
  var `type`: String = js.native
}
object Order {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingAmount(value: Double): Self = StObject.set(x, "remainingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    @scala.inline
    def setTotalAmount(value: Double): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAmountUndefined: Self = StObject.set(x, "totalAmount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
