package typings.sentryTypes

import typings.sentryTypes.typesEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplayMod {
  
  trait ReplayEvent
    extends StObject
       with Event {
    
    var error_ids: js.Array[String]
    
    var replay_id: String
    
    var replay_start_timestamp: js.UndefOr[Double] = js.undefined
    
    var replay_type: ReplayRecordingMode
    
    var segment_id: Double
    
    var trace_ids: js.Array[String]
    
    var urls: js.Array[String]
  }
  object ReplayEvent {
    
    inline def apply(
      error_ids: js.Array[String],
      replay_id: String,
      replay_type: ReplayRecordingMode,
      segment_id: Double,
      trace_ids: js.Array[String],
      urls: js.Array[String]
    ): ReplayEvent = {
      val __obj = js.Dynamic.literal(error_ids = error_ids.asInstanceOf[js.Any], replay_id = replay_id.asInstanceOf[js.Any], replay_type = replay_type.asInstanceOf[js.Any], segment_id = segment_id.asInstanceOf[js.Any], trace_ids = trace_ids.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplayEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplayEvent] (val x: Self) extends AnyVal {
      
      inline def setError_ids(value: js.Array[String]): Self = StObject.set(x, "error_ids", value.asInstanceOf[js.Any])
      
      inline def setError_idsVarargs(value: String*): Self = StObject.set(x, "error_ids", js.Array(value*))
      
      inline def setReplay_id(value: String): Self = StObject.set(x, "replay_id", value.asInstanceOf[js.Any])
      
      inline def setReplay_start_timestamp(value: Double): Self = StObject.set(x, "replay_start_timestamp", value.asInstanceOf[js.Any])
      
      inline def setReplay_start_timestampUndefined: Self = StObject.set(x, "replay_start_timestamp", js.undefined)
      
      inline def setReplay_type(value: ReplayRecordingMode): Self = StObject.set(x, "replay_type", value.asInstanceOf[js.Any])
      
      inline def setSegment_id(value: Double): Self = StObject.set(x, "segment_id", value.asInstanceOf[js.Any])
      
      inline def setTrace_ids(value: js.Array[String]): Self = StObject.set(x, "trace_ids", value.asInstanceOf[js.Any])
      
      inline def setTrace_idsVarargs(value: String*): Self = StObject.set(x, "trace_ids", js.Array(value*))
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  type ReplayRecordingData = String | js.typedarray.Uint8Array
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.session
    - typings.sentryTypes.sentryTypesStrings.buffer
  */
  trait ReplayRecordingMode extends StObject
  object ReplayRecordingMode {
    
    inline def buffer: typings.sentryTypes.sentryTypesStrings.buffer = "buffer".asInstanceOf[typings.sentryTypes.sentryTypesStrings.buffer]
    
    inline def session: typings.sentryTypes.sentryTypesStrings.session = "session".asInstanceOf[typings.sentryTypes.sentryTypesStrings.session]
  }
}
