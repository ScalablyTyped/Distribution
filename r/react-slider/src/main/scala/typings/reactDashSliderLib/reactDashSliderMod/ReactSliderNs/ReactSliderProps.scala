package typings
package reactDashSliderLib.reactDashSliderMod.ReactSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSliderProps extends js.Object {
  var barClassName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var handleActiveClassName: js.UndefOr[java.lang.String] = js.undefined
  var handleClassName: js.UndefOr[java.lang.String] = js.undefined
  var invert: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minDistance: js.UndefOr[scala.Double] = js.undefined
  var onAfterChange: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null], 
      scala.Unit
    ]
  ] = js.undefined
  var onBeforeChange: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null], 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null], 
      scala.Unit
    ]
  ] = js.undefined
  var onSliderClick: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var orientation: js.UndefOr[
    reactDashSliderLib.reactDashSliderLibStrings.horizontal | reactDashSliderLib.reactDashSliderLibStrings.vertical
  ] = js.undefined
  var pearling: js.UndefOr[scala.Boolean] = js.undefined
  var snapDragDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var withBars: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactSliderProps {
  @scala.inline
  def apply(
    barClassName: java.lang.String = null,
    className: java.lang.String = null,
    defaultValue: scala.Double | js.Array[scala.Double] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    handleActiveClassName: java.lang.String = null,
    handleClassName: java.lang.String = null,
    invert: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minDistance: scala.Int | scala.Double = null,
    onAfterChange: /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null] => scala.Unit = null,
    onBeforeChange: /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null] => scala.Unit = null,
    onChange: /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null] => scala.Unit = null,
    onSliderClick: /* value */ scala.Double => scala.Unit = null,
    orientation: reactDashSliderLib.reactDashSliderLibStrings.horizontal | reactDashSliderLib.reactDashSliderLibStrings.vertical = null,
    pearling: js.UndefOr[scala.Boolean] = js.undefined,
    snapDragDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    value: scala.Double | js.Array[scala.Double] = null,
    withBars: js.UndefOr[scala.Boolean] = js.undefined
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

