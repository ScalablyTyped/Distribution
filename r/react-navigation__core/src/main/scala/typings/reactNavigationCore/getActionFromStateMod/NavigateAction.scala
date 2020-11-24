package typings.reactNavigationCore.getActionFromStateMod

import typings.reactNavigationCore.anon.Name
import typings.reactNavigationCore.reactNavigationCoreStrings.NAVIGATE
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateAction[State /* <: NavigationState[ParamListBase] */] extends js.Object {
  
  var payload: Name[State] = js.native
  
  var `type`: NAVIGATE = js.native
}
object NavigateAction {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](payload: Name[State], `type`: NAVIGATE): NavigateAction[State] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateAction[State]]
  }
  
  @scala.inline
  implicit class NavigateActionOps[Self <: NavigateAction[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with NavigateAction[State]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPayload(value: Name[State]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NAVIGATE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
