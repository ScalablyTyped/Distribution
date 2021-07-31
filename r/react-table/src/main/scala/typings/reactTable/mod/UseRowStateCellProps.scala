package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowStateCellProps[D /* <: js.Object */] extends StObject {
  
  def setState(updater: UseRowUpdater[js.Any]): Unit
  
  var state: UseRowStateLocalState[D, js.Any]
}
object UseRowStateCellProps {
  
  @scala.inline
  def apply[D /* <: js.Object */](setState: UseRowUpdater[js.Any] => Unit, state: UseRowStateLocalState[D, js.Any]): UseRowStateCellProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateCellProps[D]]
  }
  
  @scala.inline
  implicit class UseRowStateCellPropsMutableBuilder[Self <: UseRowStateCellProps[?], D /* <: js.Object */] (val x: Self & UseRowStateCellProps[D]) extends AnyVal {
    
    @scala.inline
    def setSetState(value: UseRowUpdater[js.Any] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: UseRowStateLocalState[D, js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
