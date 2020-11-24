package typings.reactMdForm.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderStateOptions extends SliderRangeOptions {
  
  /**
    * Boolean if the dense spec has been applied.
    */
  var dense: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the transition should be disabled. This should not really be
    * touched since this is normally handled by the `useSlider` hook.
    */
  var disableTransition: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the slider is currently being dragged. This is mostly used to
    * disable the easing animation while being dragged.
    */
  var dragging: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that is used to help with accessibility by creating a better
    * value string if just a number isn't representative enough of your range.
    */
  var getValueText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
}
object SliderStateOptions {
  
  @scala.inline
  def apply(): SliderStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStateOptions]
  }
  
  @scala.inline
  implicit class SliderStateOptionsOps[Self <: SliderStateOptions] (val x: Self) extends AnyVal {
    
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
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setDisableTransition(value: Boolean): Self = this.set("disableTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTransition: Self = this.set("disableTransition", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setGetValueText(value: /* value */ Double => String): Self = this.set("getValueText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetValueText: Self = this.set("getValueText", js.undefined)
  }
}
