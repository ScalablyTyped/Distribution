package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ArrayTypeKnob, 'value' | 'separator'> */
trait PickArrayTypeKnobvaluesep extends StObject {
  
  var separator: String
  
  var value: ArrayTypeKnobValue
}
object PickArrayTypeKnobvaluesep {
  
  inline def apply(separator: String, value: ArrayTypeKnobValue): PickArrayTypeKnobvaluesep = {
    val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickArrayTypeKnobvaluesep]
  }
  
  extension [Self <: PickArrayTypeKnobvaluesep](x: Self) {
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ArrayTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
