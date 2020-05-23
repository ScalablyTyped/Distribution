package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typings.storybookAddonKnobs.radioMod.RadiosTypeOptionsProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.RadiosTypeKnob, 'value' | 'options'> */
trait PickRadiosTypeKnobvalueop extends js.Object {
  var options: RadiosTypeOptionsProp[RadiosTypeKnobValue]
  var value: RadiosTypeKnobValue
}

object PickRadiosTypeKnobvalueop {
  @scala.inline
  def apply(
    options: RadiosTypeOptionsProp[RadiosTypeKnobValue],
    value: js.UndefOr[Null | RadiosTypeKnobValue] = js.undefined
  ): PickRadiosTypeKnobvalueop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRadiosTypeKnobvalueop]
  }
}

