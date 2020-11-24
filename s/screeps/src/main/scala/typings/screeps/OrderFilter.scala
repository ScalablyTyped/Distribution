package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderFilter extends js.Object {
  
  var amount: js.UndefOr[Double] = js.native
  
  var created: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var price: js.UndefOr[Double] = js.native
  
  var remainingAmount: js.UndefOr[Double] = js.native
  
  var resourceType: js.UndefOr[MarketResourceConstant] = js.native
  
  var roomName: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object OrderFilter {
  
  @scala.inline
  def apply(): OrderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderFilter]
  }
  
  @scala.inline
  implicit class OrderFilterOps[Self <: OrderFilter] (val x: Self) extends AnyVal {
    
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
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setRemainingAmount(value: Double): Self = this.set("remainingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingAmount: Self = this.set("remainingAmount", js.undefined)
    
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setRoomName(value: String): Self = this.set("roomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomName: Self = this.set("roomName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
