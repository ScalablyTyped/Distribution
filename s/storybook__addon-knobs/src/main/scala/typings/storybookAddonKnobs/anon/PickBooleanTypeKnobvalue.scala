package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.BooleanTypeKnob, 'value'> */
@js.native
trait PickBooleanTypeKnobvalue extends StObject {
  
  var value: BooleanTypeKnobValue = js.native
}
object PickBooleanTypeKnobvalue {
  
  @scala.inline
  def apply(value: BooleanTypeKnobValue): PickBooleanTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBooleanTypeKnobvalue]
  }
  
  @scala.inline
  implicit class PickBooleanTypeKnobvalueMutableBuilder[Self <: PickBooleanTypeKnobvalue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: BooleanTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
