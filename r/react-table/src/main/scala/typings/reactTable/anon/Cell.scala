package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell[D /* <: js.Object */] extends StObject {
  
  var cell: typings.reactTable.mod.Cell[D, Any]
}
object Cell {
  
  inline def apply[D /* <: js.Object */](cell: typings.reactTable.mod.Cell[D, Any]): Cell[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cell[?], D /* <: js.Object */] (val x: Self & Cell[D]) extends AnyVal {
    
    inline def setCell(value: typings.reactTable.mod.Cell[D, Any]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
  }
}
