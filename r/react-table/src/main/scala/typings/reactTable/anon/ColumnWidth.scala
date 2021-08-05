package typings.reactTable.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnWidth extends StObject {
  
  var columnWidth: Double
  
  var columnWidths: js.Any
  
  var headerIdWidths: Record[String, Double]
  
  var isResizingColumn: js.UndefOr[String] = js.undefined
  
  var startX: js.UndefOr[Double] = js.undefined
}
object ColumnWidth {
  
  inline def apply(columnWidth: Double, columnWidths: js.Any, headerIdWidths: Record[String, Double]): ColumnWidth = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], headerIdWidths = headerIdWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnWidth]
  }
  
  extension [Self <: ColumnWidth](x: Self) {
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidths(value: js.Any): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
    
    inline def setHeaderIdWidths(value: Record[String, Double]): Self = StObject.set(x, "headerIdWidths", value.asInstanceOf[js.Any])
    
    inline def setIsResizingColumn(value: String): Self = StObject.set(x, "isResizingColumn", value.asInstanceOf[js.Any])
    
    inline def setIsResizingColumnUndefined: Self = StObject.set(x, "isResizingColumn", js.undefined)
    
    inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
  }
}
