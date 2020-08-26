package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptions
import typings.storybookAddonKnobs.optionsMod.OptionsTypeOptionsProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.OptionsTypeKnob<any>, 'options' | 'value' | 'optionsObj'> */
@js.native
trait PickOptionsTypeKnobanyopt extends js.Object {
  var options: OptionsTypeOptionsProp[_] = js.native
  var optionsObj: OptionsKnobOptions = js.native
  var value: js.Any = js.native
}

object PickOptionsTypeKnobanyopt {
  @scala.inline
  def apply(options: OptionsTypeOptionsProp[_], optionsObj: OptionsKnobOptions, value: js.Any): PickOptionsTypeKnobanyopt = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickOptionsTypeKnobanyopt]
  }
  @scala.inline
  implicit class PickOptionsTypeKnobanyoptOps[Self <: PickOptionsTypeKnobanyopt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOptions(value: OptionsTypeOptionsProp[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsObj(value: OptionsKnobOptions): Self = this.set("optionsObj", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

