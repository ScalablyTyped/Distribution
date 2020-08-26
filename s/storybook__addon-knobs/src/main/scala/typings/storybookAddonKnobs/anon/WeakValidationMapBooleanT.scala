package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
@js.native
trait WeakValidationMapBooleanT extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[BooleanTypeKnob | Null]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
    ]
  ] = js.native
}

object WeakValidationMapBooleanT {
  @scala.inline
  def apply(): WeakValidationMapBooleanT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapBooleanT]
  }
  @scala.inline
  implicit class WeakValidationMapBooleanTOps[Self <: WeakValidationMapBooleanT] (val x: Self) extends AnyVal {
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
    def setKnob(value: Validator[js.UndefOr[BooleanTypeKnob | Null]]): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
        ]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

