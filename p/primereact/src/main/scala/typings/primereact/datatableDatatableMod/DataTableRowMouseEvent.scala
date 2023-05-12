package typings.primereact.datatableDatatableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom row mouse event.
  * @see {@link DataTableProps.onRowMouseEnter}, {@link DataTableProps.onRowMouseLeave}
  * @extends DataTableRowEvent
  */
/* Inlined parent std.Omit<primereact.primereact/datatable/datatable.DataTableRowEvent, 'originalEvent'> */
trait DataTableRowMouseEvent extends StObject {
  
  var data: DataTableValue
  
  /**
    * Clicked row data index
    */
  var index: Double
  
  /**
    * Browser event.
    */
  var originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
}
object DataTableRowMouseEvent {
  
  inline def apply(data: DataTableValue, index: Double, originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]): DataTableRowMouseEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowMouseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowMouseEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: DataTableValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
