package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.BooleanTypeKnob, 'value'> */
trait PickBooleanTypeKnobvalue extends StObject {
  
  var value: BooleanTypeKnobValue
}
object PickBooleanTypeKnobvalue {
  
  inline def apply(value: BooleanTypeKnobValue): PickBooleanTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBooleanTypeKnobvalue]
  }
  
  extension [Self <: PickBooleanTypeKnobvalue](x: Self) {
    
    inline def setValue(value: BooleanTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
