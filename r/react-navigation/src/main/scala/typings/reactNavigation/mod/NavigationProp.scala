package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationProp[S] extends StObject {
  
  var dispatch: NavigationDispatch = js.native
  
  var state: S = js.native
}
object NavigationProp {
  
  @scala.inline
  def apply[S](dispatch: /* action */ NavigationAction => Boolean, state: S): NavigationProp[S] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProp[S]]
  }
  
  @scala.inline
  implicit class NavigationPropMutableBuilder[Self <: NavigationProp[_], S] (val x: Self with NavigationProp[S]) extends AnyVal {
    
    @scala.inline
    def setDispatch(value: /* action */ NavigationAction => Boolean): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
