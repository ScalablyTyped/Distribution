package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ArrayTypeKnob, 'value' | 'separator'> */
@js.native
trait PickArrayTypeKnobvaluesep extends js.Object {
  var separator: String = js.native
  var value: ArrayTypeKnobValue = js.native
}

object PickArrayTypeKnobvaluesep {
  @scala.inline
  def apply(separator: String, value: ArrayTypeKnobValue): PickArrayTypeKnobvaluesep = {
    val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickArrayTypeKnobvaluesep]
  }
  @scala.inline
  implicit class PickArrayTypeKnobvaluesepOps[Self <: PickArrayTypeKnobvaluesep] (val x: Self) extends AnyVal {
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
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: ArrayTypeKnobValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

