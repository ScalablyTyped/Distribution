package typings.reactTable.anon

import typings.reactTable.mod.UseRowStateLocalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellState[D /* <: js.Object */] extends StObject {
  
  var cellState: UseRowStateLocalState[D, js.Any]
}
object CellState {
  
  inline def apply[D /* <: js.Object */](cellState: UseRowStateLocalState[D, js.Any]): CellState[D] = {
    val __obj = js.Dynamic.literal(cellState = cellState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellState[D]]
  }
  
  extension [Self <: CellState[?], D /* <: js.Object */](x: Self & CellState[D]) {
    
    inline def setCellState(value: UseRowStateLocalState[D, js.Any]): Self = StObject.set(x, "cellState", value.asInstanceOf[js.Any])
  }
}
