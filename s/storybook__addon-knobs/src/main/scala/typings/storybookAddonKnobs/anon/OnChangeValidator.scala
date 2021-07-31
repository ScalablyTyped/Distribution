package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChangeValidator extends StObject {
  
  var knob: Validator[KnobControlConfig[js.Any]]
  
  var onChange: Validator[js.Function1[/* value */ js.Any, js.Any]]
}
object OnChangeValidator {
  
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[js.Any]],
    onChange: Validator[js.Function1[/* value */ js.Any, js.Any]]
  ): OnChangeValidator = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeValidator]
  }
  
  @scala.inline
  implicit class OnChangeValidatorMutableBuilder[Self <: OnChangeValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[KnobControlConfig[js.Any]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ js.Any, js.Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
