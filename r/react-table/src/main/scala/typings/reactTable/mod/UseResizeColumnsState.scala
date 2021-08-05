package typings.reactTable.mod

import typings.reactTable.anon.ColumnWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseResizeColumnsState[D /* <: js.Object */] extends StObject {
  
  var columnResizing: ColumnWidth
}
object UseResizeColumnsState {
  
  inline def apply[D /* <: js.Object */](columnResizing: ColumnWidth): UseResizeColumnsState[D] = {
    val __obj = js.Dynamic.literal(columnResizing = columnResizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseResizeColumnsState[D]]
  }
  
  extension [Self <: UseResizeColumnsState[?], D /* <: js.Object */](x: Self & UseResizeColumnsState[D]) {
    
    inline def setColumnResizing(value: ColumnWidth): Self = StObject.set(x, "columnResizing", value.asInstanceOf[js.Any])
  }
}
