package typings.primereact.datatableDatatableMod

import typings.react.mod.DragEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom column reorder event.
  * @see {@link DataTableProps.onRowReorder}
  * @event
  */
trait DataTableRowReorderEvent[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * Index of the dragged row.
    */
  var dragIndex: Double
  
  /**
    * Index of the drop location.
    */
  var dropIndex: Double
  
  /**
    * Browser event.
    */
  var originalEvent: DragEvent[HTMLElement]
  
  /**
    * New value after reorder.
    */
  var value: DataTableRowDataArray[TValue]
}
object DataTableRowReorderEvent {
  
  inline def apply[TValue /* <: DataTableValueArray */](
    dragIndex: Double,
    dropIndex: Double,
    originalEvent: DragEvent[HTMLElement],
    value: DataTableRowDataArray[TValue]
  ): DataTableRowReorderEvent[TValue] = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowReorderEvent[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowReorderEvent[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableRowReorderEvent[TValue]) extends AnyVal {
    
    inline def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    inline def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: DragEvent[HTMLElement]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DataTableRowDataArray[TValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: DataTableRowData[TValue]*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
