package typings.reactNativeWindows

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventTargetEventMap extends StObject {
  
  var abort: ProgressEvent[EventTarget]
  
  var error: ProgressEvent[EventTarget]
  
  var load: ProgressEvent[EventTarget]
  
  var loadend: ProgressEvent[EventTarget]
  
  var loadstart: ProgressEvent[EventTarget]
  
  var progress: ProgressEvent[EventTarget]
  
  var timeout: ProgressEvent[EventTarget]
}
object XMLHttpRequestEventTargetEventMap {
  
  inline def apply(
    abort: ProgressEvent[EventTarget],
    error: ProgressEvent[EventTarget],
    load: ProgressEvent[EventTarget],
    loadend: ProgressEvent[EventTarget],
    loadstart: ProgressEvent[EventTarget],
    progress: ProgressEvent[EventTarget],
    timeout: ProgressEvent[EventTarget]
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMLHttpRequestEventTargetEventMap] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setError(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadend(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    inline def setLoadstart(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: ProgressEvent[EventTarget]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
