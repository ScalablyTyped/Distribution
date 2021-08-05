package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoldDto extends StObject {
  
  var base: Double
  
  var purchasable: Boolean
  
  var sell: Double
  
  var total: Double
}
object GoldDto {
  
  inline def apply(base: Double, purchasable: Boolean, sell: Double, total: Double): GoldDto = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], purchasable = purchasable.asInstanceOf[js.Any], sell = sell.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoldDto]
  }
  
  extension [Self <: GoldDto](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setPurchasable(value: Boolean): Self = StObject.set(x, "purchasable", value.asInstanceOf[js.Any])
    
    inline def setSell(value: Double): Self = StObject.set(x, "sell", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
