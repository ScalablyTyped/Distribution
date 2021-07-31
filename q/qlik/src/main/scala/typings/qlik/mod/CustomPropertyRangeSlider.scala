package typings.qlik.mod

import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyRangeSlider
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: slider
  
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyRangeSlider: array
}
object CustomPropertyRangeSlider {
  
  @scala.inline
  def apply(): CustomPropertyRangeSlider = {
    val __obj = js.Dynamic.literal(component = "slider")
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[CustomPropertyRangeSlider]
  }
  
  @scala.inline
  implicit class CustomPropertyRangeSliderMutableBuilder[Self <: CustomPropertyRangeSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: slider): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
