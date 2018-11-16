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

