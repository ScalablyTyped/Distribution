package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.dateMod.DateTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.DateTypeKnob, 'value'> */
@js.native
trait PickDateTypeKnobvalue extends StObject {
  
  var value: DateTypeKnobValue = js.native
}
object PickDateTypeKnobvalue {
  
  @scala.inline
  def apply(value: DateTypeKnobValue): PickDateTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDateTypeKnobvalue]
  }
  
  @scala.inline
  implicit class PickDateTypeKnobvalueMutableBuilder[Self <: PickDateTypeKnobvalue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: DateTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
