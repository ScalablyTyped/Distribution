package typings.primereact.columnColumnMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnEventParams extends StObject {
  
  var cellIndex: Double
  
  var column: Column
  
  var field: String
  
  var newRowData: Any
  
  var newValue: Any
  
  var originalEvent: SyntheticEvent[Element, Event]
  
  var rowData: Any
  
  var rowIndex: Double
  
  var selected: Boolean
  
  var value: Any
}
object ColumnEventParams {
  
  inline def apply(
    cellIndex: Double,
    column: Column,
    field: String,
    newRowData: Any,
    newValue: Any,
    originalEvent: SyntheticEvent[Element, Event],
    rowData: Any,
    rowIndex: Double,
    selected: Boolean,
    value: Any
  ): ColumnEventParams = {
    val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], newRowData = newRowData.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEventParams]
  }
  
  extension [Self <: ColumnEventParams](x: Self) {
    
    inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setNewRowData(value: Any): Self = StObject.set(x, "newRowData", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
