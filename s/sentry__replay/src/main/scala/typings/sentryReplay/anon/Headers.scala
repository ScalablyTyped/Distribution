package typings.sentryReplay.anon

import typings.sentryTypes.typesReplayMod.ReplayRecordingData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: Record[String, Any]
  
  var recordingData: ReplayRecordingData
}
object Headers {
  
  inline def apply(headers: Record[String, Any], recordingData: ReplayRecordingData): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], recordingData = recordingData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRecordingData(value: ReplayRecordingData): Self = StObject.set(x, "recordingData", value.asInstanceOf[js.Any])
  }
}
