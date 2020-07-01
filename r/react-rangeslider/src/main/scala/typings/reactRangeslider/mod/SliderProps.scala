package typings.reactRangeslider.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
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
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double => js.UndefOr[String | Double] = null,
    handleLabel: String = null,
    labels: NumberDictionary[String] = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* value */ Double => Unit = null,
    onChangeComplete: /* value */ Double => Unit = null,
    onChangeStart: /* value */ Double => Unit = null,
    orientation: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    tooltip: js.UndefOr[Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (handleLabel != null) __obj.updateDynamic("handleLabel")(handleLabel.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onChangeStart != null) __obj.updateDynamic("onChangeStart")(js.Any.fromFunction1(onChangeStart))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

