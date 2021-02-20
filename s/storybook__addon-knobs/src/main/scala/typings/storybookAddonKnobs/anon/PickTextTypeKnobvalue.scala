package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.textMod.TextTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.TextTypeKnob, 'value'> */
@js.native
trait PickTextTypeKnobvalue extends StObject {
  
  var value: TextTypeKnobValue = js.native
}
object PickTextTypeKnobvalue {
  
  @scala.inline
  def apply(value: TextTypeKnobValue): PickTextTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTextTypeKnobvalue]
  }
  
  @scala.inline
  implicit class PickTextTypeKnobvalueMutableBuilder[Self <: PickTextTypeKnobvalue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: TextTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
