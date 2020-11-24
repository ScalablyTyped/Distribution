package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends js.Object {
  
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
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingAmount(value: Double): Self = this.set("remainingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setRoomName(value: String): Self = this.set("roomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomName: Self = this.set("roomName", js.undefined)
    
    @scala.inline
    def setTotalAmount(value: Double): Self = this.set("totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalAmount: Self = this.set("totalAmount", js.undefined)
  }
}
