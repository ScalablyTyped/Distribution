package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBufferEventMap extends StObject {
  
  /* standard dom */
  var abort: Event
  
  /* standard dom */
  var error: Event
  
  /* standard dom */
  var update: Event
  
  /* standard dom */
  var updateend: Event
  
  /* standard dom */
  var updatestart: Event
}
object SourceBufferEventMap {
  
  inline def apply(abort: Event, error: Event, update: Event, updateend: Event, updatestart: Event): SourceBufferEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateend = updateend.asInstanceOf[js.Any], updatestart = updatestart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferEventMap]
  }
  
  extension [Self <: SourceBufferEventMap](x: Self) {
    
    inline def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Event): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateend(value: Event): Self = StObject.set(x, "updateend", value.asInstanceOf[js.Any])
    
    inline def setUpdatestart(value: Event): Self = StObject.set(x, "updatestart", value.asInstanceOf[js.Any])
  }
}
