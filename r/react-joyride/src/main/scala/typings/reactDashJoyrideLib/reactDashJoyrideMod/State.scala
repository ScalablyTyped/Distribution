package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var action: Action
  var controlled: scala.Boolean
  var index: scala.Double
  var lifecycle: Lifecycle
  var size: scala.Double
  var status: Status
  /**
    * The current step.
    */
  var step: Step
  var `type`: EventType
}

object State {
  @scala.inline
  def apply(
    action: Action,
    controlled: scala.Boolean,
    index: scala.Double,
    lifecycle: Lifecycle,
    size: scala.Double,
    status: Status,
    step: Step,
    `type`: EventType
  ): State = {
    val __obj = js.Dynamic.literal(action = action, controlled = controlled, index = index, lifecycle = lifecycle, size = size, status = status, step = step)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[State]
  }
}

