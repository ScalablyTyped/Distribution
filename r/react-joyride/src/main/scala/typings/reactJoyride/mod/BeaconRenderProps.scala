package typings.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconRenderProps extends js.Object {
  var continuous: Boolean = js.native
  var index: Double = js.native
  var isLastStep: Boolean = js.native
  var size: Double = js.native
  var step: Step = js.native
  def setTooltipRef(): Unit = js.native
}

object BeaconRenderProps {
  @scala.inline
  def apply(
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    setTooltipRef: () => Unit,
    size: Double,
    step: Step
  ): BeaconRenderProps = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], setTooltipRef = js.Any.fromFunction0(setTooltipRef), size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeaconRenderProps]
  }
  @scala.inline
  implicit class BeaconRenderPropsOps[Self <: BeaconRenderProps] (val x: Self) extends AnyVal {
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
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLastStep(value: Boolean): Self = this.set("isLastStep", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetTooltipRef(value: () => Unit): Self = this.set("setTooltipRef", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Step): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

