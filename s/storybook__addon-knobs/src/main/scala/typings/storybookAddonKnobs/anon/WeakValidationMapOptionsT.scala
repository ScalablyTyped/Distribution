package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
@js.native
trait WeakValidationMapOptionsT extends js.Object {
  var display: js.UndefOr[Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]] = js.native
  var knob: js.UndefOr[Validator[js.UndefOr[Null | OptionsTypeKnob[_]]]] = js.native
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]]] = js.native
}

object WeakValidationMapOptionsT {
  @scala.inline
  def apply(): WeakValidationMapOptionsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapOptionsT]
  }
  @scala.inline
  implicit class WeakValidationMapOptionsTOps[Self <: WeakValidationMapOptionsT] (val x: Self) extends AnyVal {
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
    def setDisplay(value: Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setKnob(value: Validator[js.UndefOr[Null | OptionsTypeKnob[_]]]): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

