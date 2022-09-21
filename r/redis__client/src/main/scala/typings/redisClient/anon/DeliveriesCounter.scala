package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveriesCounter extends StObject {
  
  var deliveriesCounter: Double
  
  var name: RedisCommandArgument
}
object DeliveriesCounter {
  
  inline def apply(deliveriesCounter: Double, name: RedisCommandArgument): DeliveriesCounter = {
    val __obj = js.Dynamic.literal(deliveriesCounter = deliveriesCounter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveriesCounter]
  }
  
  extension [Self <: DeliveriesCounter](x: Self) {
    
    inline def setDeliveriesCounter(value: Double): Self = StObject.set(x, "deliveriesCounter", value.asInstanceOf[js.Any])
    
    inline def setName(value: RedisCommandArgument): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
