package typings.reactMdForm.typesSliderTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/form.@react-md/form/types/slider/types.SliderValueOptions> */
trait DefinedSliderValueOptions extends StObject {
  
  var max: Double
  
  var min: Double
  
  var step: Double
}
object DefinedSliderValueOptions {
  
  inline def apply(max: Double, min: Double, step: Double): DefinedSliderValueOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedSliderValueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinedSliderValueOptions] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
