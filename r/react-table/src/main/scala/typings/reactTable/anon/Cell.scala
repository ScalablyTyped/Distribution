package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell[D /* <: js.Object */] extends StObject {
  
  var cell: typings.reactTable.mod.Cell[D, _] = js.native
}
object Cell {
  
  @scala.inline
  def apply[D /* <: js.Object */](cell: typings.reactTable.mod.Cell[D, _]): Cell[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell[D]]
  }
  
  @scala.inline
  implicit class CellMutableBuilder[Self <: Cell[_], D /* <: js.Object */] (val x: Self with Cell[D]) extends AnyVal {
    
    @scala.inline
    def setCell(value: typings.reactTable.mod.Cell[D, _]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
  }
}
