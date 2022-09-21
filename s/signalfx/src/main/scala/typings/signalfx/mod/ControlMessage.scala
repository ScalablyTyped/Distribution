package typings.signalfx.mod

import typings.signalfx.anon.SfjobabortReason
import typings.signalfx.signalfxStrings.`control-message`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlMessage
  extends StObject
     with StreamMessage {
  
  var abortInfo: js.UndefOr[SfjobabortReason] = js.undefined
  
  var channel: js.UndefOr[String] = js.undefined
  
  // TODO: this is really a fixed set with different values
  var event: String
  
  var handle: js.UndefOr[String] = js.undefined
  
  var logicalTimestampMs: Double
  
  var progress: js.UndefOr[Double] = js.undefined
  
  var `type`: `control-message`
}
object ControlMessage {
  
  inline def apply(event: String, logicalTimestampMs: Double): ControlMessage = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("control-message")
    __obj.asInstanceOf[ControlMessage]
  }
  
  extension [Self <: ControlMessage](x: Self) {
    
    inline def setAbortInfo(value: SfjobabortReason): Self = StObject.set(x, "abortInfo", value.asInstanceOf[js.Any])
    
    inline def setAbortInfoUndefined: Self = StObject.set(x, "abortInfo", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setLogicalTimestampMs(value: Double): Self = StObject.set(x, "logicalTimestampMs", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setType(value: `control-message`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
