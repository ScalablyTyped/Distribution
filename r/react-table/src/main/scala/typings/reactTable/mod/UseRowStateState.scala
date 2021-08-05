package typings.reactTable.mod

import typings.reactTable.anon.CellState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowStateState[D /* <: js.Object */] extends StObject {
  
  var rowState: Record[String, CellState[D]]
}
object UseRowStateState {
  
  inline def apply[D /* <: js.Object */](rowState: Record[String, CellState[D]]): UseRowStateState[D] = {
    val __obj = js.Dynamic.literal(rowState = rowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateState[D]]
  }
  
  extension [Self <: UseRowStateState[?], D /* <: js.Object */](x: Self & UseRowStateState[D]) {
    
    inline def setRowState(value: Record[String, CellState[D]]): Self = StObject.set(x, "rowState", value.asInstanceOf[js.Any])
  }
}
