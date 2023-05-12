package typings.primereact.columnColumnMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom event.
  * @see {@link ColumnProps.cellEditValidator}, {@link ColumnProps.onBeforeCellEditHide}, {@link ColumnProps.onBeforeCellEditShow}, {@link ColumnProps.onCellEditCancel}, {@link ColumnProps.onCellEditComplete}, {@link ColumnProps.onCellEditInit}
  * @event
  */
trait ColumnEvent extends StObject {
  
  /**
    * Index of the selected cell.
    */
  var cellIndex: Double
  
  /**
    * Column of the element.
    */
  var column: Column
  
  /**
    * Field name of the column.
    */
  var field: String
  
  /**
    * New data of the row.
    */
  var newRowData: Any
  
  /**
    * New value of the element.
    */
  var newValue: Any
  
  /**
    * Original event triggered.
    */
  var originalEvent: SyntheticEvent[Element, Event]
  
  /**
    * Data of the selected row.
    */
  var rowData: Any
  
  /**
    * Index of the selected row.
    */
  var rowIndex: Double
  
  /**
    * Whether the element is selected or not.
    */
  var selected: Boolean
  
  /**
    * Value of the element.
    */
  var value: Any
}
object ColumnEvent {
  
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
  ): ColumnEvent = {
    val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], newRowData = newRowData.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnEvent] (val x: Self) extends AnyVal {
    
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
