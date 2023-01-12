package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTime extends StObject {
  
  var createTime: Double
  
  var direction: String
  
  var events: String
  
  var node: String
  
  var sendBufferAllocated: Double
  
  var sendBufferUsed: Double
}
object CreateTime {
  
  inline def apply(
    createTime: Double,
    direction: String,
    events: String,
    node: String,
    sendBufferAllocated: Double,
    sendBufferUsed: Double
  ): CreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], sendBufferAllocated = sendBufferAllocated.asInstanceOf[js.Any], sendBufferUsed = sendBufferUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTime] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSendBufferAllocated(value: Double): Self = StObject.set(x, "sendBufferAllocated", value.asInstanceOf[js.Any])
    
    inline def setSendBufferUsed(value: Double): Self = StObject.set(x, "sendBufferUsed", value.asInstanceOf[js.Any])
  }
}
