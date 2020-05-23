package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
trait WeakValidationMapButtonTy extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[ButtonTypeKnob | Null]]] = js.undefined
  var onChange: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* value */ scala.Nothing, scala.Nothing]) | Null]]
  ] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[ButtonTypeOnClickProp | Null]]] = js.undefined
}

object WeakValidationMapButtonTy {
  @scala.inline
  def apply(
    knob: Validator[js.UndefOr[ButtonTypeKnob | Null]] = null,
    onChange: Validator[js.UndefOr[(js.Function1[/* value */ scala.Nothing, scala.Nothing]) | Null]] = null,
    onClick: Validator[js.UndefOr[ButtonTypeOnClickProp | Null]] = null
  ): WeakValidationMapButtonTy = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapButtonTy]
  }
}

