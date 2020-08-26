package typings.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallBackProps extends js.Object {
  var action: String = js.native
  var controlled: Boolean = js.native
  var index: Double = js.native
  var lifecycle: String = js.native
  var size: Double = js.native
  var status: valueof[typings.reactJoyride.mod.status] = js.native
  var step: Step = js.native
  var `type`: String = js.native
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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallBackProps]
  }
  @scala.inline
  implicit class CallBackPropsOps[Self <: CallBackProps] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlled(value: Boolean): Self = this.set("controlled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecycle(value: String): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: valueof[status]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

