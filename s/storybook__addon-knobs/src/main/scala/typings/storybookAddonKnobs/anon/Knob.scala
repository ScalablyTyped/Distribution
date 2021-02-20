package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Knob extends StObject {
  
  var knob: Validator[ArrayTypeKnob] = js.native
  
  var onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]] = js.native
}
object Knob {
  
  @scala.inline
  def apply(
    knob: Validator[ArrayTypeKnob],
    onChange: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]
  ): Knob = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knob]
  }
  
  @scala.inline
  implicit class KnobMutableBuilder[Self <: Knob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[ArrayTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
