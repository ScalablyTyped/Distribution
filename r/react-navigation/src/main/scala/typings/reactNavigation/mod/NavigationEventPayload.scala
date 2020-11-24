package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEventPayload extends js.Object {
  
  var action: NavigationAction = js.native
  
  var lastState: js.UndefOr[NavigationState | Null] = js.native
  
  var state: NavigationState = js.native
  
  var `type`: EventType = js.native
}
object NavigationEventPayload {
  
  @scala.inline
  def apply(action: NavigationAction, state: NavigationState, `type`: EventType): NavigationEventPayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEventPayload]
  }
  
  @scala.inline
  implicit class NavigationEventPayloadOps[Self <: NavigationEventPayload] (val x: Self) extends AnyVal {
    
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
    def setAction(value: NavigationAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: NavigationState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastState(value: NavigationState): Self = this.set("lastState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastState: Self = this.set("lastState", js.undefined)
    
    @scala.inline
    def setLastStateNull: Self = this.set("lastState", null)
  }
}
