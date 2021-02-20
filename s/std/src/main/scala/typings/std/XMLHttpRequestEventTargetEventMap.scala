package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequestEventTargetEventMap extends StObject {
  
  var abort: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var error: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var load: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var loadend: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var loadstart: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var progress: ProgressEvent[XMLHttpRequestEventTarget] = js.native
  
  var timeout: ProgressEvent[XMLHttpRequestEventTarget] = js.native
}
object XMLHttpRequestEventTargetEventMap {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class XMLHttpRequestEventTargetEventMapMutableBuilder[Self <: XMLHttpRequestEventTargetEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadend(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "loadend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadstart(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
