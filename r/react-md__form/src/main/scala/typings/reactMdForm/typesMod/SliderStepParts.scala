package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<@react-md/form.@react-md/form/types/slider/types.SliderStepOptions, 'min' | 'max' | 'step'>> */
@js.native
trait SliderStepParts extends StObject {
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var step: Double = js.native
}
object SliderStepParts {
  
  @scala.inline
  def apply(max: Double, min: Double, step: Double): SliderStepParts = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStepParts]
  }
  
  @scala.inline
  implicit class SliderStepPartsMutableBuilder[Self <: SliderStepParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
