package typings.signalfx.mod

import typings.signalfx.anon.IncidentId
import typings.signalfx.anon.JobId
import typings.signalfx.anon.TsId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.signalfx.mod.MetadataMessage
  - typings.signalfx.mod.EventMessage
  - typings.signalfx.mod.ControlMessage
  - typings.signalfx.mod.DataMessage
*/
trait StreamMessage extends StObject
object StreamMessage {
  
  inline def ControlMessage(event: String, logicalTimestampMs: Double): typings.signalfx.mod.ControlMessage = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("control-message")
    __obj.asInstanceOf[typings.signalfx.mod.ControlMessage]
  }
  
  inline def DataMessage(channel: String, data: js.Array[TsId], logicalTimestampMs: Double): typings.signalfx.mod.DataMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data")
    __obj.asInstanceOf[typings.signalfx.mod.DataMessage]
  }
  
  inline def EventMessage(channel: String, logicalTimestampMs: Double, properties: IncidentId, tsId: String): typings.signalfx.mod.EventMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tsId = tsId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[typings.signalfx.mod.EventMessage]
  }
  
  inline def MetadataMessage(channel: String, properties: JobId, tsId: String): typings.signalfx.mod.MetadataMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tsId = tsId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("metadata")
    __obj.asInstanceOf[typings.signalfx.mod.MetadataMessage]
  }
}
