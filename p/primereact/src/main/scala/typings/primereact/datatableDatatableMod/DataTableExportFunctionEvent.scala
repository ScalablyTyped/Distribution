package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom export function event.
  * @see {@link DataTableProps.exportFunction}
  * @event
  */
trait DataTableExportFunctionEvent[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * Column.
    */
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  /**
    * Field data.
    */
  var data: DataTableRowDataArray[TValue]
  
  /**
    * Column field.
    */
  var field: String
  
  /**
    * Data of the row.
    */
  var rowData: DataTableRowData[TValue]
}
object DataTableExportFunctionEvent {
  
  inline def apply[TValue /* <: DataTableValueArray */](
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    data: DataTableRowDataArray[TValue],
    field: String,
    rowData: DataTableRowData[TValue]
  ): DataTableExportFunctionEvent[TValue] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableExportFunctionEvent[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableExportFunctionEvent[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableExportFunctionEvent[TValue]) extends AnyVal {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setData(value: DataTableRowDataArray[TValue]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: DataTableRowData[TValue]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: DataTableRowData[TValue]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
