package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the Slider is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum value for the slider.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value for the slider.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Called when the value of the slider is changed. The current value is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * The current value of the Slider (0-100).
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * Whether the Slider can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: Anon_H = null,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    row: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SliderProps]
  }
}

