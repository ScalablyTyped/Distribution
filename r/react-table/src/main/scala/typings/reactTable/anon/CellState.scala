package typings.reactTable.anon

import typings.reactTable.mod.UseRowStateLocalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellState[D /* <: js.Object */] extends StObject {
  
  var cellState: UseRowStateLocalState[D, Any]
}
object CellState {
  
  inline def apply[D /* <: js.Object */](cellState: UseRowStateLocalState[D, Any]): CellState[D] = {
    val __obj = js.Dynamic.literal(cellState = cellState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellState[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellState[?], D /* <: js.Object */] (val x: Self & CellState[D]) extends AnyVal {
    
    inline def setCellState(value: UseRowStateLocalState[D, Any]): Self = StObject.set(x, "cellState", value.asInstanceOf[js.Any])
  }
}
