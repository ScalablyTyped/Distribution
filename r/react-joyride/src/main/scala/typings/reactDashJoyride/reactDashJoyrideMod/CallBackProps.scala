package typings.reactDashJoyride.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallBackProps extends js.Object {
  var action: String
  var controlled: Boolean
  var index: Double
  var lifecycle: String
  var size: Double
  var status: valueof[typings.reactDashJoyride.reactDashJoyrideMod.status]
  var step: Step
  var `type`: String
}

object CallBackProps {
  @scala.inline
  def apply(
    action: String,
    controlled: Boolean,
    index: Double,
    lifecycle: String,
    size: Double,
    status: valueof[status],
    step: Step,
    `type`: String
  ): CallBackProps = {
    val __obj = js.Dynamic.literal(action = action, controlled = controlled, index = index, lifecycle = lifecycle, size = size, status = status, step = step)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallBackProps]
  }
}

