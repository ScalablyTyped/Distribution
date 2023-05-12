package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCellSelection[TValue /* <: DataTableValueArray */]
  extends StObject
     with _DataTableSelection[TValue] {
  
  /**
    * Index of the cell.
    */
  var cellIndex: Double
  
  /**
    * Column element of the datatable.
    */
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  /**
    * Column field.
    */
  var field: String
  
  /**
    * Properties of the column.
    */
  var props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnProps */ Any
  
  /**
    * Data of the row.
    */
  var rowData: DataTableRowData[TValue]
  
  /**
    * Index of the row.
    */
  var rowIndex: Double
  
  /**
    * Whether the row is selected or not.
    */
  var selected: Boolean
  
  /**
    * Value of the cell.
    */
  var value: /* import warning: importer.ImportType#apply Failed type conversion: TValue[number][keyof TValue[number]] */ js.Any
}
object DataTableCellSelection {
  
  inline def apply[TValue /* <: DataTableValueArray */](
    cellIndex: Double,
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    field: String,
    props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnProps */ Any,
    rowData: DataTableRowData[TValue],
    rowIndex: Double,
    selected: Boolean,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TValue[number][keyof TValue[number]] */ js.Any
  ): DataTableCellSelection[TValue] = {
    val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellSelection[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCellSelection[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableCellSelection[TValue]) extends AnyVal {
    
    inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnProps */ Any
    ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: DataTableRowData[TValue]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TValue[number][keyof TValue[number]] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
