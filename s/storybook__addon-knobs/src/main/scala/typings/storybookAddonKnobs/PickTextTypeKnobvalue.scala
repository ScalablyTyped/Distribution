package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.textMod.TextTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.TextTypeKnob, 'value'> */
trait PickTextTypeKnobvalue extends js.Object {
  var value: TextTypeKnobValue
}

object PickTextTypeKnobvalue {
  @scala.inline
  def apply(value: TextTypeKnobValue): PickTextTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTextTypeKnobvalue]
  }
}

