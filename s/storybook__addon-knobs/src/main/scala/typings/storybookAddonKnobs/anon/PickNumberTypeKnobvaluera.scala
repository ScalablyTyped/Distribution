package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.numberMod.NumberTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.NumberTypeKnob, 'value' | 'range' | 'min' | 'max' | 'step'> */
trait PickNumberTypeKnobvaluera extends StObject {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[NumberTypeKnobValue] = js.undefined
}
object PickNumberTypeKnobvaluera {
  
  inline def apply(): PickNumberTypeKnobvaluera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNumberTypeKnobvaluera]
  }
  
  extension [Self <: PickNumberTypeKnobvaluera](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setValue(value: NumberTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
