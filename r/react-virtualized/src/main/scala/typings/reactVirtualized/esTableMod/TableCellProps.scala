package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellProps extends StObject {
  
  var cellData: js.UndefOr[js.Any] = js.undefined
  
  var columnData: js.UndefOr[js.Any] = js.undefined
  
  var columnIndex: Double
  
  var dataKey: String
  
  var isScrolling: Boolean
  
  var parent: js.UndefOr[js.Any] = js.undefined
  
  var rowData: js.Any
  
  var rowIndex: Double
}
object TableCellProps {
  
  inline def apply(columnIndex: Double, dataKey: String, isScrolling: Boolean, rowData: js.Any, rowIndex: Double): TableCellProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
  
  extension [Self <: TableCellProps](x: Self) {
    
    inline def setCellData(value: js.Any): Self = StObject.set(x, "cellData", value.asInstanceOf[js.Any])
    
    inline def setCellDataUndefined: Self = StObject.set(x, "cellData", js.undefined)
    
    inline def setColumnData(value: js.Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    inline def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
