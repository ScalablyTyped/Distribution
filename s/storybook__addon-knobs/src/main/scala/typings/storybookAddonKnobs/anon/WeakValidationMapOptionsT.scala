package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
trait WeakValidationMapOptionsT extends js.Object {
  var display: js.UndefOr[Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]]] = js.undefined
  var knob: js.UndefOr[Validator[js.UndefOr[Null | OptionsTypeKnob[_]]]] = js.undefined
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]]] = js.undefined
}

object WeakValidationMapOptionsT {
  @scala.inline
  def apply(
    display: Validator[js.UndefOr[Null | OptionsKnobOptionsDisplay]] = null,
    knob: Validator[js.UndefOr[Null | OptionsTypeKnob[_]]] = null,
    onChange: Validator[js.UndefOr[(js.Function1[/* value */ _, _]) | Null]] = null
  ): WeakValidationMapOptionsT = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapOptionsT]
  }
}

