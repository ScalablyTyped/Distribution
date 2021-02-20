package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initial[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var initial: js.UndefOr[scala.Nothing] = js.native
  
  var params: js.UndefOr[scala.Nothing] = js.native
  
  var screen: js.UndefOr[scala.Nothing] = js.native
  
  var state: js.UndefOr[PartialState[State] | State] = js.native
}
object Initial {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](): Initial[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initial[State]]
  }
  
  @scala.inline
  implicit class InitialMutableBuilder[Self <: Initial[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with Initial[State]) extends AnyVal {
    
    @scala.inline
    def setState(value: PartialState[State] | State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
