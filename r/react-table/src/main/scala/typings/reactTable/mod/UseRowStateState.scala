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
  
  @scala.inline
  def apply[D /* <: js.Object */](rowState: Record[String, CellState[D]]): UseRowStateState[D] = {
    val __obj = js.Dynamic.literal(rowState = rowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateState[D]]
  }
  
  @scala.inline
  implicit class UseRowStateStateMutableBuilder[Self <: UseRowStateState[?], D /* <: js.Object */] (val x: Self & UseRowStateState[D]) extends AnyVal {
    
    @scala.inline
    def setRowState(value: Record[String, CellState[D]]): Self = StObject.set(x, "rowState", value.asInstanceOf[js.Any])
  }
}
