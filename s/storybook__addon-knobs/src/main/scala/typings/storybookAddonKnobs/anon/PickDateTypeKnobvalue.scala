package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.dateMod.DateTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.DateTypeKnob, 'value'> */
@js.native
trait PickDateTypeKnobvalue extends js.Object {
  var value: DateTypeKnobValue = js.native
}

object PickDateTypeKnobvalue {
  @scala.inline
  def apply(value: DateTypeKnobValue): PickDateTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDateTypeKnobvalue]
  }
  @scala.inline
  implicit class PickDateTypeKnobvalueOps[Self <: PickDateTypeKnobvalue] (val x: Self) extends AnyVal {
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
    def setValue(value: DateTypeKnobValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

