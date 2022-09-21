package typings.signalfx.mod

import typings.signalfx.anon.IncidentId
import typings.signalfx.signalfxStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMessage
  extends StObject
     with StreamMessage {
  
  var channel: String
  
  var logicalTimestampMs: Double
  
  var properties: IncidentId
  
  var tsId: String
  
  var `type`: event
}
object EventMessage {
  
  inline def apply(channel: String, logicalTimestampMs: Double, properties: IncidentId, tsId: String): EventMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tsId = tsId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[EventMessage]
  }
  
  extension [Self <: EventMessage](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setLogicalTimestampMs(value: Double): Self = StObject.set(x, "logicalTimestampMs", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IncidentId): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setTsId(value: String): Self = StObject.set(x, "tsId", value.asInstanceOf[js.Any])
    
    inline def setType(value: event): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
