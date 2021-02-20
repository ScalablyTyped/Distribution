package typings.reactTable.anon

import typings.reactTable.mod.UseRowStateLocalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellState[D /* <: js.Object */] extends StObject {
  
  var cellState: UseRowStateLocalState[D, _] = js.native
}
object CellState {
  
  @scala.inline
  def apply[D /* <: js.Object */](cellState: UseRowStateLocalState[D, _]): CellState[D] = {
    val __obj = js.Dynamic.literal(cellState = cellState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellState[D]]
  }
  
  @scala.inline
  implicit class CellStateMutableBuilder[Self <: CellState[_], D /* <: js.Object */] (val x: Self with CellState[D]) extends AnyVal {
    
    @scala.inline
    def setCellState(value: UseRowStateLocalState[D, _]): Self = StObject.set(x, "cellState", value.asInstanceOf[js.Any])
  }
}
