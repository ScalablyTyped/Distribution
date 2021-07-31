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
  
  @scala.inline
  def apply(columnWidth: Double, columnWidths: js.Any, headerIdWidths: Record[String, Double]): ColumnWidth = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], headerIdWidths = headerIdWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnWidth]
  }
  
  @scala.inline
  implicit class ColumnWidthMutableBuilder[Self <: ColumnWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidths(value: js.Any): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIdWidths(value: Record[String, Double]): Self = StObject.set(x, "headerIdWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizingColumn(value: String): Self = StObject.set(x, "isResizingColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizingColumnUndefined: Self = StObject.set(x, "isResizingColumn", js.undefined)
    
    @scala.inline
    def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
  }
}
