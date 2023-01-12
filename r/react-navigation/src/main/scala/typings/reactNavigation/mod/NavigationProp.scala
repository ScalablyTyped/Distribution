package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationProp[S] extends StObject {
  
  var dispatch: NavigationDispatch
  
  var state: S
}
object NavigationProp {
  
  inline def apply[S](dispatch: /* action */ NavigationAction => Boolean, state: S): NavigationProp[S] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProp[S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationProp[?], S] (val x: Self & NavigationProp[S]) extends AnyVal {
    
    inline def setDispatch(value: /* action */ NavigationAction => Boolean): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
