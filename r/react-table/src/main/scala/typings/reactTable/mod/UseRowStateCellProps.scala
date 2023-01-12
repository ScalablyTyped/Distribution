package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowStateCellProps[D /* <: js.Object */] extends StObject {
  
  def setState(updater: UseRowUpdater[Any]): Unit
  
  var state: UseRowStateLocalState[D, Any]
}
object UseRowStateCellProps {
  
  inline def apply[D /* <: js.Object */](setState: UseRowUpdater[Any] => Unit, state: UseRowStateLocalState[D, Any]): UseRowStateCellProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateCellProps[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseRowStateCellProps[?], D /* <: js.Object */] (val x: Self & UseRowStateCellProps[D]) extends AnyVal {
    
    inline def setSetState(value: UseRowUpdater[Any] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    inline def setState(value: UseRowStateLocalState[D, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
