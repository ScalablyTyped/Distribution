package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventPayload extends js.Object {
  var action: NavigationAction
  var lastState: js.UndefOr[NavigationState | scala.Null]
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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("state")(state)
    if (lastState != null) __obj.updateDynamic("lastState")(lastState)
    __obj.asInstanceOf[NavigationEventPayload]
  }
}

