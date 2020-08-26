package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
@js.native
trait PartialButtonTypeProps extends js.Object {
  var knob: js.UndefOr[ButtonTypeKnob] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Nothing, scala.Nothing]] = js.native
  var onClick: js.UndefOr[ButtonTypeOnClickProp] = js.native
}

object PartialButtonTypeProps {
  @scala.inline
  def apply(): PartialButtonTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonTypeProps]
  }
  @scala.inline
  implicit class PartialButtonTypePropsOps[Self <: PartialButtonTypeProps] (val x: Self) extends AnyVal {
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
    def setKnob(value: ButtonTypeKnob): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setOnClick(value: /* knob */ ButtonTypeKnob => js.Any): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

