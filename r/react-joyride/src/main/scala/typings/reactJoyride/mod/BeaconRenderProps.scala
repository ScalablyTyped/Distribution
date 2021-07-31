package typings.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeaconRenderProps extends StObject {
  
  var continuous: Boolean
  
  var index: Double
  
  var isLastStep: Boolean
  
  def setTooltipRef(): Unit
  
  var size: Double
  
  var step: Step
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
  implicit class BeaconRenderPropsMutableBuilder[Self <: BeaconRenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastStep(value: Boolean): Self = StObject.set(x, "isLastStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTooltipRef(value: () => Unit): Self = StObject.set(x, "setTooltipRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Step): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
