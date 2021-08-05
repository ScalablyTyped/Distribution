package typings.storybookAddonKnobs.anon

import typings.std.PropertyKey
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typings.storybookAddonKnobs.selectMod.SelectTypeOptionsProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.SelectTypeKnob<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>, 'value' | 'options'> & {  selectV2 :true} */
trait PickSelectTypeKnobSelectT extends StObject {
  
  var options: SelectTypeOptionsProp[SelectTypeKnobValue]
  
  var selectV2: `true`
  
  var value: SelectTypeKnobValue
}
object PickSelectTypeKnobSelectT {
  
  inline def apply(options: SelectTypeOptionsProp[SelectTypeKnobValue]): PickSelectTypeKnobSelectT = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], selectV2 = true)
    __obj.asInstanceOf[PickSelectTypeKnobSelectT]
  }
  
  extension [Self <: PickSelectTypeKnobSelectT](x: Self) {
    
    inline def setOptions(value: SelectTypeOptionsProp[SelectTypeKnobValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: SelectTypeKnobValue*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setSelectV2(value: `true`): Self = StObject.set(x, "selectV2", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SelectTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: PropertyKey*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
