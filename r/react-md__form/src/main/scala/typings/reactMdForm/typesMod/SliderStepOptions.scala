package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderStepOptions extends SliderRangeOptions {
  
  /**
    * A positive number representing the value to "jump" while incrementing or
    * decrementing the slider's value. This should normally stay as the default
    * value of `1`, but can also be decimal values if needed.
    */
  var step: js.UndefOr[Double] = js.native
}
object SliderStepOptions {
  
  @scala.inline
  def apply(): SliderStepOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStepOptions]
  }
  
  @scala.inline
  implicit class SliderStepOptionsMutableBuilder[Self <: SliderStepOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
