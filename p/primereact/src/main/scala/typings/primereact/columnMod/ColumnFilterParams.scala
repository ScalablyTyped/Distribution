package typings.primereact.columnMod

import typings.primereact.anon.FilterField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterParams extends StObject {
  
  var column: FilterField
  
  var filters: ColumnFilterMeta
  
  var props: Any
  
  var rowData: Any
}
object ColumnFilterParams {
  
  inline def apply(column: FilterField, filters: ColumnFilterMeta, props: Any, rowData: Any): ColumnFilterParams = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterParams]
  }
  
  extension [Self <: ColumnFilterParams](x: Self) {
    
    inline def setColumn(value: FilterField): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: ColumnFilterMeta): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
