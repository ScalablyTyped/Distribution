package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consumers extends StObject {
  
  var consumers: Double
  
  var lastDeliveredId: RedisCommandArgument
  
  var name: RedisCommandArgument
  
  var pending: Double
}
object Consumers {
  
  inline def apply(
    consumers: Double,
    lastDeliveredId: RedisCommandArgument,
    name: RedisCommandArgument,
    pending: Double
  ): Consumers = {
    val __obj = js.Dynamic.literal(consumers = consumers.asInstanceOf[js.Any], lastDeliveredId = lastDeliveredId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Consumers] (val x: Self) extends AnyVal {
    
    inline def setConsumers(value: Double): Self = StObject.set(x, "consumers", value.asInstanceOf[js.Any])
    
    inline def setLastDeliveredId(value: RedisCommandArgument): Self = StObject.set(x, "lastDeliveredId", value.asInstanceOf[js.Any])
    
    inline def setName(value: RedisCommandArgument): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
  }
}
