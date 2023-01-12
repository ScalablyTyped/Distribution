package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToState[State /* <: js.Object */] extends StObject {
  
  var to: State
}
object ToState {
  
  inline def apply[State /* <: js.Object */](to: State): ToState[State] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToState[State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToState[?], State /* <: js.Object */] (val x: Self & ToState[State]) extends AnyVal {
    
    inline def setTo(value: State): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
