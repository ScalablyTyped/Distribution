package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderStateOptions
  extends StObject
     with SliderRangeOptions {
  
  /**
    * Boolean if the dense spec has been applied.
    */
  var dense: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the transition should be disabled. This should not really be
    * touched since this is normally handled by the `useSlider` hook.
    */
  var disableTransition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the slider is currently being dragged. This is mostly used to
    * disable the easing animation while being dragged.
    */
  var dragging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is used to help with accessibility by creating a better
    * value string if just a number isn't representative enough of your range.
    */
  var getValueText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
}
object SliderStateOptions {
  
  @scala.inline
  def apply(): SliderStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStateOptions]
  }
  
  @scala.inline
  implicit class SliderStateOptionsMutableBuilder[Self <: SliderStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    @scala.inline
    def setGetValueText(value: /* value */ Double => String): Self = StObject.set(x, "getValueText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueTextUndefined: Self = StObject.set(x, "getValueText", js.undefined)
  }
}
