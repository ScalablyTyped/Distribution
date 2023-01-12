package typings.qlik.mod

import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertySlider
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: slider
  
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CustomPropertySlider: number
}
object CustomPropertySlider {
  
  inline def apply(): CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = "slider")
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[CustomPropertySlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPropertySlider] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: slider): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
