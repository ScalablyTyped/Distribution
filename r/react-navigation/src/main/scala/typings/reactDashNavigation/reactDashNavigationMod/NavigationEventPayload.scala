package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventPayload extends js.Object {
  var action: NavigationAction
  var lastState: js.UndefOr[NavigationState | Null] = js.undefined
  var state: NavigationState
  var `type`: EventType
}

object NavigationEventPayload {
  @scala.inline
  def apply(
    action: NavigationAction,
    state: NavigationState,
    `type`: EventType,
    lastState: NavigationState = null
  ): NavigationEventPayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastState != null) __obj.updateDynamic("lastState")(lastState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEventPayload]
  }
}

