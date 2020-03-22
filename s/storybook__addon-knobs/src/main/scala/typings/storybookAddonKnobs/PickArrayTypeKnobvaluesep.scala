package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ArrayTypeKnob, 'value' | 'separator'> */
trait PickArrayTypeKnobvaluesep extends js.Object {
  var separator: String
  var value: ArrayTypeKnobValue
}

object PickArrayTypeKnobvaluesep {
  @scala.inline
  def apply(separator: String, value: ArrayTypeKnobValue): PickArrayTypeKnobvaluesep = {
    val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickArrayTypeKnobvaluesep]
  }
}

