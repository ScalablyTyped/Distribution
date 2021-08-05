package typings.reactNative

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLHttpRequestEventMap
  extends StObject
     with XMLHttpRequestEventTargetEventMap {
  
  var readystatechange: Event
}
object XMLHttpRequestEventMap {
  
  inline def apply(
    abort: ProgressEvent,
    error: ProgressEvent,
    load: ProgressEvent,
    loadend: ProgressEvent,
    loadstart: ProgressEvent,
    progress: ProgressEvent,
    readystatechange: Event,
    timeout: ProgressEvent
  ): XMLHttpRequestEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventMap]
  }
  
  extension [Self <: XMLHttpRequestEventMap](x: Self) {
    
    inline def setReadystatechange(value: Event): Self = StObject.set(x, "readystatechange", value.asInstanceOf[js.Any])
  }
}
