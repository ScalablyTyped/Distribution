package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@react-md/form.@react-md/form/types/slider/types.SliderValueOptions, 'step'> */
/* Inlined parent @react-md/form.@react-md/form/types/slider/types.SliderPresentation */
/* Inlined parent @react-md/form.@react-md/form/types/slider/types.SliderThumbPresentation */
trait SliderThumbOptions extends StObject {
  
  /**
    * The duration that it takes for the slider animation to complete for a new
    * value. This is just used to help make things look smoother while dragging
    * compared to jumping to new values.
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Boolean if the slider is disabled and the values cannot be changed.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
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
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Boolean if the slider is rendered vertically instead of horizontally.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object SliderThumbOptions {
  
  inline def apply(): SliderThumbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderThumbOptions]
  }
  
  extension [Self <: SliderThumbOptions](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDiscrete(value: Boolean): Self = StObject.set(x, "discrete", value.asInstanceOf[js.Any])
    
    inline def setDiscreteUndefined: Self = StObject.set(x, "discrete", js.undefined)
    
    inline def setGetValueText(value: /* value */ Double => String): Self = StObject.set(x, "getValueText", js.Any.fromFunction1(value))
    
    inline def setGetValueTextUndefined: Self = StObject.set(x, "getValueText", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
