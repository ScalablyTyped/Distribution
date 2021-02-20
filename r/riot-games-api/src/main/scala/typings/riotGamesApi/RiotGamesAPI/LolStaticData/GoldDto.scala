package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoldDto extends StObject {
  
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
  implicit class GoldDtoMutableBuilder[Self <: GoldDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchasable(value: Boolean): Self = StObject.set(x, "purchasable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSell(value: Double): Self = StObject.set(x, "sell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
