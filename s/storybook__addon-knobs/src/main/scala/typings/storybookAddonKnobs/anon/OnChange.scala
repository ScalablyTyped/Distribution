package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChange extends StObject {
  
  var knob: Validator[KnobControlConfig[String]] = js.native
  
  var onChange: Validator[js.Function1[/* value */ String, String]] = js.native
}
object OnChange {
  
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[String]],
    onChange: Validator[js.Function1[/* value */ String, String]]
  ): OnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit class OnChangeMutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[KnobControlConfig[String]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ String, String]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
