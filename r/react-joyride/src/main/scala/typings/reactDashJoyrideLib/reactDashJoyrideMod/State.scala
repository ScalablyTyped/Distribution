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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("controlled")(controlled)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("lifecycle")(lifecycle)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[State]
  }
}

