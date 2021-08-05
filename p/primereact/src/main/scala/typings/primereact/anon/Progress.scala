package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var originalEvent: typings.std.Event
  
  var progress: js.Any
}
object Progress {
  
  inline def apply(originalEvent: typings.std.Event, progress: js.Any): Progress = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: js.Any): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
