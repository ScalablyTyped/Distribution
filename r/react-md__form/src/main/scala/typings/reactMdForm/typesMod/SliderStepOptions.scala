package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderStepOptions
  extends StObject
     with SliderRangeOptions {
  
  /**
    * A positive number representing the value to "jump" while incrementing or
    * decrementing the slider's value. This should normally stay as the default
    * value of `1`, but can also be decimal values if needed.
    */
  var step: js.UndefOr[Double] = js.undefined
}
object SliderStepOptions {
  
  inline def apply(): SliderStepOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStepOptions]
  }
  
  extension [Self <: SliderStepOptions](x: Self) {
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
