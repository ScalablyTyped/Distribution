package typings.reactDashJoyride.reactDashJoyrideMod

import typings.reactDashJoyride.Anon_Arialabel
import typings.reactDashJoyride.Anon_Ariamodal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipRenderProps extends BeaconRenderProps {
  var backProps: Anon_Arialabel
  var closeProps: Anon_Arialabel
  var primaryProps: Anon_Arialabel
  var skipProps: Anon_Arialabel
  var tooltipProps: Anon_Ariamodal
}

object TooltipRenderProps {
  @scala.inline
  def apply(
    backProps: Anon_Arialabel,
    closeProps: Anon_Arialabel,
    continuous: Boolean,
    index: Double,
    isLastStep: Boolean,
    primaryProps: Anon_Arialabel,
    setTooltipRef: () => Unit,
    size: Double,
    skipProps: Anon_Arialabel,
    step: Step,
    tooltipProps: Anon_Ariamodal
  ): TooltipRenderProps = {
    val __obj = js.Dynamic.literal(backProps = backProps, closeProps = closeProps, continuous = continuous, index = index, isLastStep = isLastStep, primaryProps = primaryProps, setTooltipRef = js.Any.fromFunction0(setTooltipRef), size = size, skipProps = skipProps, step = step, tooltipProps = tooltipProps)
  
    __obj.asInstanceOf[TooltipRenderProps]
  }
}

