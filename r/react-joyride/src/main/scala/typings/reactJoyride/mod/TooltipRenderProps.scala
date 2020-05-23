package typings.reactJoyride.mod

import typings.reactJoyride.anon.Arialabel
import typings.reactJoyride.anon.Ariamodal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipRenderProps extends BeaconRenderProps {
  var backProps: Arialabel
  var closeProps: Arialabel
  var primaryProps: Arialabel
  var skipProps: Arialabel
  var tooltipProps: Ariamodal
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
}

