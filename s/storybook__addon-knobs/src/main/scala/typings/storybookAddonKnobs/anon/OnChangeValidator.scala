package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChangeValidator extends StObject {
  
  var knob: Validator[KnobControlConfig[Any]]
  
  var onChange: Validator[js.Function1[/* value */ Any, Any]]
}
object OnChangeValidator {
  
  inline def apply(knob: Validator[KnobControlConfig[Any]], onChange: Validator[js.Function1[/* value */ Any, Any]]): OnChangeValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeValidator]
  }
  
  extension [Self <: OnChangeValidator](x: Self) {
    
    inline def setKnob(value: Validator[KnobControlConfig[Any]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* value */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
