package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBufferEventMap extends StObject {
  
  var abort: Event
  
  var error: Event
  
  var update: Event
  
  var updateend: Event
  
  var updatestart: Event
}
object SourceBufferEventMap {
  
  @scala.inline
  def apply(abort: Event, error: Event, update: Event, updateend: Event, updatestart: Event): SourceBufferEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateend = updateend.asInstanceOf[js.Any], updatestart = updatestart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferEventMap]
  }
  
  @scala.inline
  implicit class SourceBufferEventMapMutableBuilder[Self <: SourceBufferEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Event): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateend(value: Event): Self = StObject.set(x, "updateend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatestart(value: Event): Self = StObject.set(x, "updatestart", value.asInstanceOf[js.Any])
  }
}
