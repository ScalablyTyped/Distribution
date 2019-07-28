package typings.reactDashJoyride.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var action: Action
  var controlled: Boolean
  var index: Double
  var lifecycle: Lifecycle
  var size: Double
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
    controlled: Boolean,
    index: Double,
    lifecycle: Lifecycle,
    size: Double,
    status: Status,
    step: Step,
    `type`: EventType
  ): State = {
    val __obj = js.Dynamic.literal(action = action, controlled = controlled, index = index, lifecycle = lifecycle, size = size, status = status, step = step)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[State]
  }
}

