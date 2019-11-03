package typings.reactDashJoyride.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconRenderProps extends js.Object {
  var continuous: Boolean
  var index: Double
  var isLastStep: Boolean
  var size: Double
  var step: Step
  def setTooltipRef(): Unit
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
    val __obj = js.Dynamic.literal(continuous = continuous, index = index, isLastStep = isLastStep, setTooltipRef = js.Any.fromFunction0(setTooltipRef), size = size, step = step)
  
    __obj.asInstanceOf[BeaconRenderProps]
  }
}

