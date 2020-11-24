package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoldDto extends js.Object {
  
  var base: Double = js.native
  
  var purchasable: Boolean = js.native
  
  var sell: Double = js.native
  
  var total: Double = js.native
}
object GoldDto {
  
  @scala.inline
  def apply(base: Double, purchasable: Boolean, sell: Double, total: Double): GoldDto = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], purchasable = purchasable.asInstanceOf[js.Any], sell = sell.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoldDto]
  }
  
  @scala.inline
  implicit class GoldDtoOps[Self <: GoldDto] (val x: Self) extends AnyVal {
    
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
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchasable(value: Boolean): Self = this.set("purchasable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSell(value: Double): Self = this.set("sell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
