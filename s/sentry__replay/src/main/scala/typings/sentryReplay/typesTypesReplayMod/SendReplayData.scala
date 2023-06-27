package typings.sentryReplay.typesTypesReplayMod

import typings.sentryTypes.typesReplayMod.ReplayRecordingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendReplayData extends StObject {
  
  var eventContext: PopEventContext
  
  var options: ReplayPluginOptions
  
  var recordingData: ReplayRecordingData
  
  var replayId: String
  
  var segmentId: Double
  
  var session: Session
  
  var timestamp: Double
}
object SendReplayData {
  
  inline def apply(
    eventContext: PopEventContext,
    options: ReplayPluginOptions,
    recordingData: ReplayRecordingData,
    replayId: String,
    segmentId: Double,
    session: Session,
    timestamp: Double
  ): SendReplayData = {
    val __obj = js.Dynamic.literal(eventContext = eventContext.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], recordingData = recordingData.asInstanceOf[js.Any], replayId = replayId.asInstanceOf[js.Any], segmentId = segmentId.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendReplayData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendReplayData] (val x: Self) extends AnyVal {
    
    inline def setEventContext(value: PopEventContext): Self = StObject.set(x, "eventContext", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ReplayPluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRecordingData(value: ReplayRecordingData): Self = StObject.set(x, "recordingData", value.asInstanceOf[js.Any])
    
    inline def setReplayId(value: String): Self = StObject.set(x, "replayId", value.asInstanceOf[js.Any])
    
    inline def setSegmentId(value: Double): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
