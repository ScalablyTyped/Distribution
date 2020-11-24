package typings.reactMdForm.typesMod

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
  implicit class SliderStepOptionsOps[Self <: SliderStepOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
