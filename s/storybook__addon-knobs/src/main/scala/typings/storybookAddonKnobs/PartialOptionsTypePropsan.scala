package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> */
trait PartialOptionsTypePropsan extends js.Object {
  var display: js.UndefOr[OptionsKnobOptionsDisplay] = js.undefined
  var knob: js.UndefOr[OptionsTypeKnob[_]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
}

object PartialOptionsTypePropsan {
  @scala.inline
  def apply(
    display: OptionsKnobOptionsDisplay = null,
    knob: OptionsTypeKnob[_] = null,
    onChange: /* value */ js.Any => _ = null
  ): PartialOptionsTypePropsan = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[PartialOptionsTypePropsan]
  }
}

