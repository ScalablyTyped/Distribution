package typings
package reactDashRangesliderLib.reactDashRangesliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[
    js.Function1[/* value */ scala.Double, js.UndefOr[java.lang.String | scala.Double]]
  ] = js.undefined
  var handleLabel: js.UndefOr[scala.Boolean] = js.undefined
  var labels: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var onChangeComplete: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var onChangeStart: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var tooltip: js.UndefOr[scala.Boolean] = js.undefined
  var value: scala.Double
}

object SliderProps {
  @scala.inline
  def apply(
    value: scala.Double,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    format: js.Function1[/* value */ scala.Double, js.UndefOr[java.lang.String | scala.Double]] = null,
    handleLabel: js.UndefOr[scala.Boolean] = js.undefined,
    labels: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    onChangeComplete: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    onChangeStart: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    orientation: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    tooltip: js.UndefOr[scala.Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(handleLabel)) __obj.updateDynamic("handleLabel")(handleLabel)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    if (onChangeStart != null) __obj.updateDynamic("onChangeStart")(onChangeStart)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[SliderProps]
  }
}

