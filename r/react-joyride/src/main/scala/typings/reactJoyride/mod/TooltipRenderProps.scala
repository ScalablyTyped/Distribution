package typings.reactJoyride.mod

import typings.reactJoyride.AnonArialabel
import typings.reactJoyride.AnonAriamodal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipRenderProps extends BeaconRenderProps {
  var backProps: AnonArialabel
  var closeProps: AnonArialabel
  var primaryProps: AnonArialabel
  var skipProps: AnonArialabel
  var tooltipProps: AnonAriamodal
}

object TooltipRenderProps {
  @scala.inline
  def apply(
    backProps: AnonArialabel,
    closeProps: AnonArialabel,
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    primaryProps: AnonArialabel,
    setTooltipRef: () => Unit,
    size: Double,
    skipProps: AnonArialabel,
    step: Step,
    tooltipProps: AnonAriamodal
  ): TooltipRenderProps = {
    val __obj = js.Dynamic.literal(backProps = backProps.asInstanceOf[js.Any], closeProps = closeProps.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isLastStep = isLastStep.asInstanceOf[js.Any], primaryProps = primaryProps.asInstanceOf[js.Any], setTooltipRef = js.Any.fromFunction0(setTooltipRef), size = size.asInstanceOf[js.Any], skipProps = skipProps.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TooltipRenderProps]
  }
}

