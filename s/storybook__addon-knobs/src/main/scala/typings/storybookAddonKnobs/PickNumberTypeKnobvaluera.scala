package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.numberMod.NumberTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.NumberTypeKnob, 'value' | 'range' | 'min' | 'max' | 'step'> */
trait PickNumberTypeKnobvaluera extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var value: NumberTypeKnobValue
}

object PickNumberTypeKnobvaluera {
  @scala.inline
  def apply(
    value: NumberTypeKnobValue,
    max: Int | Double = null,
    min: Int | Double = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null
  ): PickNumberTypeKnobvaluera = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNumberTypeKnobvaluera]
  }
}

