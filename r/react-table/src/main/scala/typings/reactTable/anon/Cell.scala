package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell[D /* <: js.Object */] extends StObject {
  
  var cell: typings.reactTable.mod.Cell[D, js.Any]
}
object Cell {
  
  @scala.inline
  def apply[D /* <: js.Object */](cell: typings.reactTable.mod.Cell[D, js.Any]): Cell[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell[D]]
  }
  
  @scala.inline
  implicit class CellMutableBuilder[Self <: Cell[?], D /* <: js.Object */] (val x: Self & Cell[D]) extends AnyVal {
    
    @scala.inline
    def setCell(value: typings.reactTable.mod.Cell[D, js.Any]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
  }
}
