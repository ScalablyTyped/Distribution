package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateState[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var state: State = js.native
}
object StateState {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](state: State): StateState[State] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateState[State]]
  }
  
  @scala.inline
  implicit class StateStateMutableBuilder[Self <: StateState[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with StateState[State]) extends AnyVal {
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
