package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var deliveriesCounter: Double
  
  var id: RedisCommandArgument
  
  var millisecondsSinceLastDelivery: Double
  
  var owner: RedisCommandArgument
}
object Id {
  
  inline def apply(
    deliveriesCounter: Double,
    id: RedisCommandArgument,
    millisecondsSinceLastDelivery: Double,
    owner: RedisCommandArgument
  ): Id = {
    val __obj = js.Dynamic.literal(deliveriesCounter = deliveriesCounter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], millisecondsSinceLastDelivery = millisecondsSinceLastDelivery.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setDeliveriesCounter(value: Double): Self = StObject.set(x, "deliveriesCounter", value.asInstanceOf[js.Any])
    
    inline def setId(value: RedisCommandArgument): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMillisecondsSinceLastDelivery(value: Double): Self = StObject.set(x, "millisecondsSinceLastDelivery", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: RedisCommandArgument): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
