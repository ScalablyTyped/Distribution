package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.selectMod.SelectTypeKnob
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> */
trait PartialSelectTypePropsSel extends js.Object {
  var knob: js.UndefOr[SelectTypeKnob[SelectTypeKnobValue]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]] = js.undefined
}

object PartialSelectTypePropsSel {
  @scala.inline
  def apply(
    knob: SelectTypeKnob[SelectTypeKnobValue] = null,
    onChange: /* value */ SelectTypeKnobValue => SelectTypeKnobValue = null
  ): PartialSelectTypePropsSel = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[PartialSelectTypePropsSel]
  }
}

