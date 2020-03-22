package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typings.storybookAddonKnobs.selectMod.SelectTypeOptionsProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.SelectTypeKnob<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>, 'value' | 'options'> & {  selectV2  :true} */
trait PickSelectTypeKnobSelectT extends js.Object {
  var options: SelectTypeOptionsProp[SelectTypeKnobValue]
  var selectV2: `true`
  var value: SelectTypeKnobValue
}

object PickSelectTypeKnobSelectT {
  @scala.inline
  def apply(
    options: SelectTypeOptionsProp[SelectTypeKnobValue],
    selectV2: `true`,
    value: SelectTypeKnobValue = null
  ): PickSelectTypeKnobSelectT = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], selectV2 = selectV2.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSelectTypeKnobSelectT]
  }
}

