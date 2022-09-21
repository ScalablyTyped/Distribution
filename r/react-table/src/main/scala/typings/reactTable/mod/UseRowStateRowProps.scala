package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowStateRowProps[D /* <: js.Object */] extends StObject {
  
  def setState(updater: UseRowUpdater[Any]): Unit
  
  var state: UseRowStateLocalState[D, Any]
}
object UseRowStateRowProps {
  
  inline def apply[D /* <: js.Object */](setState: UseRowUpdater[Any] => Unit, state: UseRowStateLocalState[D, Any]): UseRowStateRowProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateRowProps[D]]
  }
  
  extension [Self <: UseRowStateRowProps[?], D /* <: js.Object */](x: Self & UseRowStateRowProps[D]) {
    
    inline def setSetState(value: UseRowUpdater[Any] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    inline def setState(value: UseRowStateLocalState[D, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
