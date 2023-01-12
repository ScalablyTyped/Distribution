package typings.primereact.datatableDatatableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCellClickEventParams extends StObject {
  
  var cellIndex: Double
  
  var field: String
  
  var originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  
  var rowData: Any
  
  var rowIndex: Double
  
  var selected: Boolean
  
  var value: Any
}
object DataTableCellClickEventParams {
  
  inline def apply(
    cellIndex: Double,
    field: String,
    originalEvent: MouseEvent[HTMLElement, NativeMouseEvent],
    rowData: Any,
    rowIndex: Double,
    selected: Boolean,
    value: Any
  ): DataTableCellClickEventParams = {
    val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellClickEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCellClickEventParams] (val x: Self) extends AnyVal {
    
    inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
