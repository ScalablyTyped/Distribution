package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventTargetEventMap extends StObject {
  
  var abort: ProgressEvent
  
  var error: ProgressEvent
  
  var load: ProgressEvent
  
  var loadend: ProgressEvent
  
  var loadstart: ProgressEvent
  
  var progress: ProgressEvent
  
  var timeout: ProgressEvent
}
object XMLHttpRequestEventTargetEventMap {
  
  inline def apply(
    abort: ProgressEvent,
    error: ProgressEvent,
    load: ProgressEvent,
    loadend: ProgressEvent,
    loadstart: ProgressEvent,
    progress: ProgressEvent,
    timeout: ProgressEvent
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
  
  extension [Self <: XMLHttpRequestEventTargetEventMap](x: Self) {
    
    inline def setAbort(value: ProgressEvent): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setError(value: ProgressEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: ProgressEvent): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadend(value: ProgressEvent): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    inline def setLoadstart(value: ProgressEvent): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: ProgressEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: ProgressEvent): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
