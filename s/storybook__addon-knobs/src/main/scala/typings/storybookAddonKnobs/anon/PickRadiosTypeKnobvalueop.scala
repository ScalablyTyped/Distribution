package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typings.storybookAddonKnobs.radioMod.RadiosTypeOptionsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.RadiosTypeKnob, 'value' | 'options'> */
trait PickRadiosTypeKnobvalueop extends StObject {
  
  var options: RadiosTypeOptionsProp[RadiosTypeKnobValue]
  
  var value: RadiosTypeKnobValue
}
object PickRadiosTypeKnobvalueop {
  
  @scala.inline
  def apply(options: RadiosTypeOptionsProp[RadiosTypeKnobValue]): PickRadiosTypeKnobvalueop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRadiosTypeKnobvalueop]
  }
  
  @scala.inline
  implicit class PickRadiosTypeKnobvalueopMutableBuilder[Self <: PickRadiosTypeKnobvalueop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: RadiosTypeOptionsProp[RadiosTypeKnobValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: RadiosTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
