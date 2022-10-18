package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Knob extends StObject {
  
  var knob: Validator[ArrayTypeKnob]
  
  var onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
}
object Knob {
  
  inline def apply(
    knob: Validator[ArrayTypeKnob],
    onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
  ): Knob = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knob]
  }
  
  extension [Self <: Knob](x: Self) {
    
    inline def setKnob(value: Validator[ArrayTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
