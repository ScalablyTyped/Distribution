package typings.reactMdForm.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderRangeOptions extends js.Object {
  
  /**
    * Boolean if the slider is disabled and the values cannot be changed.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The max value for the slider.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The min value for the slider.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Boolean if the slider is rendered vertically instead of horizontally.
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object SliderRangeOptions {
  
  @scala.inline
  def apply(): SliderRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderRangeOptions]
  }
  
  @scala.inline
  implicit class SliderRangeOptionsOps[Self <: SliderRangeOptions] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
