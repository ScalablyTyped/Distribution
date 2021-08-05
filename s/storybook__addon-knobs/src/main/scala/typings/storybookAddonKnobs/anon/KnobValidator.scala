package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.numberMod.NumberTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnobValidator extends StObject {
  
  var knob: Validator[NumberTypeKnob]
  
  var onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
}
object KnobValidator {
  
  inline def apply(
    knob: Validator[NumberTypeKnob],
    onChange: Validator[js.Function1[/* value */ Double | Null, Double | Null]]
  ): KnobValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobValidator]
  }
  
  extension [Self <: KnobValidator](x: Self) {
    
    inline def setKnob(value: Validator[NumberTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* value */ Double | Null, Double | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
