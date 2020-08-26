package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.colorMod.ColorTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ColorTypeKnob, 'value'> */
@js.native
trait PickColorTypeKnobvalue extends js.Object {
  var value: ColorTypeKnobValue = js.native
}

object PickColorTypeKnobvalue {
  @scala.inline
  def apply(value: ColorTypeKnobValue): PickColorTypeKnobvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickColorTypeKnobvalue]
  }
  @scala.inline
  implicit class PickColorTypeKnobvalueOps[Self <: PickColorTypeKnobvalue] (val x: Self) extends AnyVal {
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
    def setValue(value: ColorTypeKnobValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

