package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnob
import typings.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> */
trait PartialBooleanTypeProps extends js.Object {
  var knob: js.UndefOr[BooleanTypeKnob] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ BooleanTypeKnobValue, BooleanTypeKnobValue]] = js.undefined
}

object PartialBooleanTypeProps {
  @scala.inline
  def apply(
    knob: BooleanTypeKnob = null,
    onChange: /* value */ BooleanTypeKnobValue => BooleanTypeKnobValue = null
  ): PartialBooleanTypeProps = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[PartialBooleanTypeProps]
  }
}

