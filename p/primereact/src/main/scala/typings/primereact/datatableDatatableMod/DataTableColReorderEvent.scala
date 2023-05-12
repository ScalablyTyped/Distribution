package typings.primereact.datatableDatatableMod

import typings.react.mod.DragEvent
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom column reorder event.
  * @see {@link DataTableProps.onColReorder}
  * @event
  */
trait DataTableColReorderEvent extends StObject {
  
  /**
    * Columns array after reorder.
    */
  var columns: ReactElement
  
  /**
    * Index of the dragged column.
    */
  var dragIndex: Double
  
  /**
    * Index of the dropped column.
    */
  var dropIndex: Double
  
  /**
    * Browser event.
    */
  var originalEvent: DragEvent[HTMLElement]
}
object DataTableColReorderEvent {
  
  inline def apply(columns: ReactElement, dragIndex: Double, dropIndex: Double, originalEvent: DragEvent[HTMLElement]): DataTableColReorderEvent = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableColReorderEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableColReorderEvent] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: ReactElement): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: DragEvent[HTMLElement]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
