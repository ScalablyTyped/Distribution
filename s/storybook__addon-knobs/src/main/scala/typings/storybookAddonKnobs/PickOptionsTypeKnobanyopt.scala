package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptions
import typings.storybookAddonKnobs.optionsMod.OptionsTypeOptionsProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.OptionsTypeKnob<any>, 'options' | 'value' | 'optionsObj'> */
trait PickOptionsTypeKnobanyopt extends js.Object {
  var options: OptionsTypeOptionsProp[_]
  var optionsObj: OptionsKnobOptions
  var value: js.Any
}

object PickOptionsTypeKnobanyopt {
  @scala.inline
  def apply(options: OptionsTypeOptionsProp[_], optionsObj: OptionsKnobOptions, value: js.Any): PickOptionsTypeKnobanyopt = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickOptionsTypeKnobanyopt]
  }
}

