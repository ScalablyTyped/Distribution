package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptions
import typings.storybookAddonKnobs.optionsMod.OptionsTypeOptionsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.OptionsTypeKnob<any>, 'options' | 'value' | 'optionsObj'> */
trait PickOptionsTypeKnobanyopt extends StObject {
  
  var options: OptionsTypeOptionsProp[js.Any]
  
  var optionsObj: OptionsKnobOptions
  
  var value: js.Any
}
object PickOptionsTypeKnobanyopt {
  
  @scala.inline
  def apply(options: OptionsTypeOptionsProp[js.Any], optionsObj: OptionsKnobOptions, value: js.Any): PickOptionsTypeKnobanyopt = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickOptionsTypeKnobanyopt]
  }
  
  @scala.inline
  implicit class PickOptionsTypeKnobanyoptMutableBuilder[Self <: PickOptionsTypeKnobanyopt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: OptionsTypeOptionsProp[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsObj(value: OptionsKnobOptions): Self = StObject.set(x, "optionsObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
