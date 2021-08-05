package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragIndex extends StObject {
  
  var dragIndex: Double
  
  var dropIndex: Double
  
  var originalEvent: typings.std.Event
  
  var value: js.Any
}
object DragIndex {
  
  inline def apply(dragIndex: Double, dropIndex: Double, originalEvent: typings.std.Event, value: js.Any): DragIndex = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragIndex]
  }
  
  extension [Self <: DragIndex](x: Self) {
    
    inline def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
