package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderRangeOptions extends StObject {
  
  /**
    * Boolean if the slider is disabled and the values cannot be changed.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The max value for the slider.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The min value for the slider.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Boolean if the slider is rendered vertically instead of horizontally.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object SliderRangeOptions {
  
  inline def apply(): SliderRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderRangeOptions]
  }
  
  extension [Self <: SliderRangeOptions](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
