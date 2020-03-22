package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
trait PartialArrayTypeProps extends js.Object {
  var knob: js.UndefOr[ArrayTypeKnob] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]] = js.undefined
}

object PartialArrayTypeProps {
  @scala.inline
  def apply(knob: ArrayTypeKnob = null, onChange: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue = null): PartialArrayTypeProps = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[PartialArrayTypeProps]
  }
}

