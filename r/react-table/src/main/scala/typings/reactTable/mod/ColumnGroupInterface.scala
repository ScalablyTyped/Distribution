package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnGroupInterface[D /* <: js.Object */] extends StObject {
  
  var columns: js.Array[Column[D]]
}
object ColumnGroupInterface {
  
  inline def apply[D /* <: js.Object */](columns: js.Array[Column[D]]): ColumnGroupInterface[D] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupInterface[D]]
  }
  
  extension [Self <: ColumnGroupInterface[?], D /* <: js.Object */](x: Self & ColumnGroupInterface[D]) {
    
    inline def setColumns(value: js.Array[Column[D]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Column[D]*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
