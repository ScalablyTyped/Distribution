package typings.reactJoyride.mod

import typings.reactJoyride.anon.Arialabel
import typings.reactJoyride.anon.Ariamodal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipRenderProps extends BeaconRenderProps {
  var backProps: Arialabel = js.native
  var closeProps: Arialabel = js.native
  var primaryProps: Arialabel = js.native
  var skipProps: Arialabel = js.native
  var tooltipProps: Ariamodal = js.native
}

object TooltipRenderProps {
  @scala.inline
  def apply(
    backProps: Arialabel,
    closeProps: Arialabel,
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    primaryProps: Arialabel,
    setTooltipRef: () => Unit,
    size: Double,
    skipProps: Arialabel,
    step: Step,
    tooltipProps: Ariamodal
  ): TooltipRenderProps = {
    val __obj = js.Dynamic.literal(backProps = backProps.asInstanceOf[js.Any], closeProps = closeProps.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], primaryProps = primaryProps.asInstanceOf[js.Any], setTooltipRef = js.Any.fromFunction0(setTooltipRef), size = size.asInstanceOf[js.Any], skipProps = skipProps.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipRenderProps]
  }
  @scala.inline
  implicit class TooltipRenderPropsOps[Self <: TooltipRenderProps] (val x: Self) extends AnyVal {
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
    def setBackProps(value: Arialabel): Self = this.set("backProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseProps(value: Arialabel): Self = this.set("closeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryProps(value: Arialabel): Self = this.set("primaryProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipProps(value: Arialabel): Self = this.set("skipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipProps(value: Ariamodal): Self = this.set("tooltipProps", value.asInstanceOf[js.Any])
  }
  
}

