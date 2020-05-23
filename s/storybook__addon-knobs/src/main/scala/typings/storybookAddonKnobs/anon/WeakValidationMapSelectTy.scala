package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.selectMod.SelectTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
trait WeakValidationMapSelectTy extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]]] = js.undefined
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
    ]
  ] = js.undefined
}

object WeakValidationMapSelectTy {
  @scala.inline
  def apply(
    knob: Validator[js.UndefOr[Null | SelectTypeKnob[SelectTypeKnobValue]]] = null,
    onChange: Validator[
      js.UndefOr[(js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]) | Null]
    ] = null
  ): WeakValidationMapSelectTy = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapSelectTy]
  }
}

