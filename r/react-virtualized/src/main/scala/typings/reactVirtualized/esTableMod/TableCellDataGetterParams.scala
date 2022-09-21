package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellDataGetterParams extends StObject {
  
  var columnData: js.UndefOr[Any] = js.undefined
  
  var dataKey: String
  
  var rowData: Any
}
object TableCellDataGetterParams {
  
  inline def apply(dataKey: String, rowData: Any): TableCellDataGetterParams = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellDataGetterParams]
  }
  
  extension [Self <: TableCellDataGetterParams](x: Self) {
    
    inline def setColumnData(value: Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    inline def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
    
    inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
  }
}
