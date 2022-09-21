package typings.primereact.columnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSortParams extends StObject {
  
  var field: String
  
  var order: ColumnSortOrderType
  
  var rowData: Any
}
object ColumnSortParams {
  
  inline def apply(field: String, rowData: Any): ColumnSortParams = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSortParams]
  }
  
  extension [Self <: ColumnSortParams](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: ColumnSortOrderType): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
