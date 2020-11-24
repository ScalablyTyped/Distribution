package typings.screeps.anon

import typings.screeps.MarketResourceConstant
import typings.screeps.ORDER_BUY
import typings.screeps.ORDER_SELL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Price extends js.Object {
  
  var price: Double = js.native
  
  var resourceType: MarketResourceConstant = js.native
  
  var roomName: js.UndefOr[String] = js.native
  
  var totalAmount: Double = js.native
  
  var `type`: ORDER_BUY | ORDER_SELL = js.native
}
object Price {
  
  @scala.inline
  def apply(
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
  implicit class PriceOps[Self <: Price] (val x: Self) extends AnyVal {
    
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
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAmount(value: Double): Self = this.set("totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ORDER_BUY | ORDER_SELL): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomName(value: String): Self = this.set("roomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomName: Self = this.set("roomName", js.undefined)
  }
}
