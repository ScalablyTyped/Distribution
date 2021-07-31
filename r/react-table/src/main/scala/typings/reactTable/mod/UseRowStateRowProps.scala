package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowStateRowProps[D /* <: js.Object */] extends StObject {
  
  def setState(updater: UseRowUpdater[js.Any]): Unit
  
  var state: UseRowStateLocalState[D, js.Any]
}
object UseRowStateRowProps {
  
  @scala.inline
  def apply[D /* <: js.Object */](setState: UseRowUpdater[js.Any] => Unit, state: UseRowStateLocalState[D, js.Any]): UseRowStateRowProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateRowProps[D]]
  }
  
  @scala.inline
  implicit class UseRowStateRowPropsMutableBuilder[Self <: UseRowStateRowProps[?], D /* <: js.Object */] (val x: Self & UseRowStateRowProps[D]) extends AnyVal {
    
    @scala.inline
    def setSetState(value: UseRowUpdater[js.Any] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: UseRowStateLocalState[D, js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
