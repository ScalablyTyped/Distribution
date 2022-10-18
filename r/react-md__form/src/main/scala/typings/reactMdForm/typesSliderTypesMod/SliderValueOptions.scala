package typings.reactMdForm.typesSliderTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderValueOptions extends StObject {
  
  /**
    * The max value for the slider.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The min value for the slider.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * A positive number representing the value to "jump" while incrementing or
    * decrementing the slider's value. This should normally stay as the default
    * value of `1`, but can also be decimal values if needed.
    */
  var step: js.UndefOr[Double] = js.undefined
}
object SliderValueOptions {
  
  inline def apply(): SliderValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderValueOptions]
  }
  
  extension [Self <: SliderValueOptions](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
