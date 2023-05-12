package typings.primereact.datatableDatatableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom cell click event.
  * @see {@link DataTableProps.onCellClick}
  */
trait DataTableCellClickEvent[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * Index of the cell.
    */
  var cellIndex: Double
  
  /**
    * Column field.
    */
  var field: String
  
  /**
    * Browser event.
    */
  var originalEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  
  /**
    * Data of the row.
    */
  var rowData: DataTableRowData[TValue]
  
  /**
    * Index of the row.
    */
  var rowIndex: Double
  
  /**
    * Whether the cell is selected or not.
    */
  var selected: Boolean
  
  /**
    * Value of the cell.
    */
  var value: Any
}
object DataTableCellClickEvent {
  
  inline def apply[TValue /* <: DataTableValueArray */](
    cellIndex: Double,
    field: String,
    originalEvent: MouseEvent[HTMLElement, NativeMouseEvent],
    rowData: DataTableRowData[TValue],
    rowIndex: Double,
    selected: Boolean,
    value: Any
  ): DataTableCellClickEvent[TValue] = {
    val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellClickEvent[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCellClickEvent[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableCellClickEvent[TValue]) extends AnyVal {
    
    inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: DataTableRowData[TValue]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
