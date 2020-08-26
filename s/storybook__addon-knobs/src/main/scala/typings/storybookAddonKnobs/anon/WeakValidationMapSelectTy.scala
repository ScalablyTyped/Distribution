package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.selectMod.SelectTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
@js.native
trait WeakValidationMapSelectTy extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
    ]
  ] = js.native
}

object WeakValidationMapSelectTy {
  @scala.inline
  def apply(): WeakValidationMapSelectTy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSelectTy]
  }
  @scala.inline
  implicit class WeakValidationMapSelectTyOps[Self <: WeakValidationMapSelectTy] (val x: Self) extends AnyVal {
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
    def setKnob(value: Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]]): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
        ]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

