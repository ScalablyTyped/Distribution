package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnobOnChange extends StObject {
  
  var knob: Validator[KnobControlConfig[Double]] = js.native
  
  var onChange: Validator[js.Function1[/* value */ Double, Double]] = js.native
}
object KnobOnChange {
  
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[Double]],
    onChange: Validator[js.Function1[/* value */ Double, Double]]
  ): KnobOnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobOnChange]
  }
  
  @scala.inline
  implicit class KnobOnChangeMutableBuilder[Self <: KnobOnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[KnobControlConfig[Double]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ Double, Double]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
