package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderEventMap extends StObject {
  
  /* standard dom */
  var dataavailable: BlobEvent
  
  /* standard dom */
  var error: Event
  
  /* standard dom */
  var pause: Event
  
  /* standard dom */
  var resume: Event
  
  /* standard dom */
  var start: Event
  
  /* standard dom */
  var stop: Event
}
object MediaRecorderEventMap {
  
  inline def apply(dataavailable: BlobEvent, error: Event, pause: Event, resume: Event, start: Event, stop: Event): MediaRecorderEventMap = {
    val __obj = js.Dynamic.literal(dataavailable = dataavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaRecorderEventMap] (val x: Self) extends AnyVal {
    
    inline def setDataavailable(value: BlobEvent): Self = StObject.set(x, "dataavailable", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Event): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setResume(value: Event): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Event): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Event): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
