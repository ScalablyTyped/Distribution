package typings.storybookAddonKnobs

import typings.react.mod.Validator
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
trait WeakValidationMapBooleanT extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[BooleanTypeKnob | Null]]] = js.undefined
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
    ]
  ] = js.undefined
}

object WeakValidationMapBooleanT {
  @scala.inline
  def apply(
    knob: Validator[js.UndefOr[BooleanTypeKnob | Null]] = null,
    onChange: Validator[
      js.UndefOr[(js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]) | Null]
    ] = null
  ): WeakValidationMapBooleanT = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapBooleanT]
  }
}

