package typings.primereact.datatableDatatableMod

import typings.react.mod.DragEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowReorderParams extends StObject {
  
  var dragIndex: Double
  
  var dropIndex: Double
  
  var originalEvent: DragEvent[HTMLElement]
  
  var value: Any
}
object DataTableRowReorderParams {
  
  inline def apply(dragIndex: Double, dropIndex: Double, originalEvent: DragEvent[HTMLElement], value: Any): DataTableRowReorderParams = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowReorderParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowReorderParams] (val x: Self) extends AnyVal {
    
    inline def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: DragEvent[HTMLElement]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
