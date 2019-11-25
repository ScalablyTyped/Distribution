package typings.reactDashRangeslider.reactDashRangesliderMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Function1[/* value */ Double, js.UndefOr[String | Double]]] = js.undefined
  var handleLabel: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[NumberDictionary[String]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onChangeComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onChangeStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
  var value: Double
}

object SliderProps {
  @scala.inline
  def apply(
    value: Double,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double => js.UndefOr[String | Double] = null,
    handleLabel: String = null,
    labels: NumberDictionary[String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    onChangeComplete: /* value */ Double => Unit = null,
    onChangeStart: /* value */ Double => Unit = null,
    orientation: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    tooltip: js.UndefOr[Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (handleLabel != null) __obj.updateDynamic("handleLabel")(handleLabel.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onChangeStart != null) __obj.updateDynamic("onChangeStart")(js.Any.fromFunction1(onChangeStart))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

