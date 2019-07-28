package typings.reactDashSlider.reactDashSliderMod

import typings.reactDashSlider.reactDashSliderStrings.horizontal
import typings.reactDashSlider.reactDashSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSliderProps extends js.Object {
  var barClassName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handleActiveClassName: js.UndefOr[String] = js.undefined
  var handleClassName: js.UndefOr[String] = js.undefined
  var invert: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minDistance: js.UndefOr[Double] = js.undefined
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
  var onSliderClick: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var pearling: js.UndefOr[Boolean] = js.undefined
  var snapDragDisabled: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var withBars: js.UndefOr[Boolean] = js.undefined
}

object ReactSliderProps {
  @scala.inline
  def apply(
    barClassName: String = null,
    className: String = null,
    defaultValue: Double | js.Array[Double] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handleActiveClassName: String = null,
    handleClassName: String = null,
    invert: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    minDistance: Int | Double = null,
    onAfterChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onBeforeChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onSliderClick: /* value */ Double => Unit = null,
    orientation: horizontal | vertical = null,
    pearling: js.UndefOr[Boolean] = js.undefined,
    snapDragDisabled: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    value: Double | js.Array[Double] = null,
    withBars: js.UndefOr[Boolean] = js.undefined
  ): ReactSliderProps = {
    val __obj = js.Dynamic.literal()
    if (barClassName != null) __obj.updateDynamic("barClassName")(barClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (handleActiveClassName != null) __obj.updateDynamic("handleActiveClassName")(handleActiveClassName)
    if (handleClassName != null) __obj.updateDynamic("handleClassName")(handleClassName)
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDistance != null) __obj.updateDynamic("minDistance")(minDistance.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1(onBeforeChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSliderClick != null) __obj.updateDynamic("onSliderClick")(js.Any.fromFunction1(onSliderClick))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(pearling)) __obj.updateDynamic("pearling")(pearling)
    if (!js.isUndefined(snapDragDisabled)) __obj.updateDynamic("snapDragDisabled")(snapDragDisabled)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(withBars)) __obj.updateDynamic("withBars")(withBars)
    __obj.asInstanceOf[ReactSliderProps]
  }
}

