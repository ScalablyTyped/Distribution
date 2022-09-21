package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderThumbPresentation extends StObject {
  
  /**
    * The duration that it takes for the slider animation to complete for a new
    * value. This is just used to help make things look smoother while dragging
    * compared to jumping to new values.
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Boolean if the slider should act as a discrete slider which will render a
    * tooltip above the thumb while dragging to visualize the current value for
    * the slider.
    */
  var discrete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is used to help with accessibility by creating a better
    * value string if just a number isn't representative enough of your range.
    *
    * Example:
    *
    * ```tsx
    * const [value, controls] = useSlider(0, {
    *   // format to be `$100`, etc
    *   getValueText: value => `$${value}`,
    * });
    *
    * return <Slider baseId="price-slider" label="Price" {...controls} />;
    * ```
    */
  var getValueText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
}
object SliderThumbPresentation {
  
  inline def apply(): SliderThumbPresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderThumbPresentation]
  }
  
  extension [Self <: SliderThumbPresentation](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setDiscrete(value: Boolean): Self = StObject.set(x, "discrete", value.asInstanceOf[js.Any])
    
    inline def setDiscreteUndefined: Self = StObject.set(x, "discrete", js.undefined)
    
    inline def setGetValueText(value: /* value */ Double => String): Self = StObject.set(x, "getValueText", js.Any.fromFunction1(value))
    
    inline def setGetValueTextUndefined: Self = StObject.set(x, "getValueText", js.undefined)
  }
}
