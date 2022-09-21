package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventTargetEventMap extends StObject {
  
  /* standard dom */
  var abort: ProgressEvent[XMLHttpRequestEventTarget]
  
  /* standard dom */
  var error: ProgressEvent[XMLHttpRequestEventTarget]
  
  /* standard dom */
  var load: ProgressEvent[XMLHttpRequestEventTarget]
  
  /* standard dom */
  var loadend: ProgressEvent[XMLHttpRequestEventTarget]
  
  /* standard dom */
  var loadstart: ProgressEvent[XMLHttpRequestEventTarget]
  
  /* standard dom */
  var progress: ProgressEvent[XMLHttpRequestEventTarget]
  
  /* standard dom */
  var timeout: ProgressEvent[XMLHttpRequestEventTarget]
}
object XMLHttpRequestEventTargetEventMap {
  
  inline def apply(
    abort: ProgressEvent[XMLHttpRequestEventTarget],
    error: ProgressEvent[XMLHttpRequestEventTarget],
    load: ProgressEvent[XMLHttpRequestEventTarget],
    loadend: ProgressEvent[XMLHttpRequestEventTarget],
    loadstart: ProgressEvent[XMLHttpRequestEventTarget],
    progress: ProgressEvent[XMLHttpRequestEventTarget],
    timeout: ProgressEvent[XMLHttpRequestEventTarget]
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
  
  extension [Self <: XMLHttpRequestEventTargetEventMap](x: Self) {
    
    inline def setAbort(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setError(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadend(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    inline def setLoadstart(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
