package typings
package rcDashSliderLib.rcDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProps extends CommonApiProps {
  /**
    * allowCross could be set as true to allow those handles to cross.
    *  @default true
    */
  var allowCross: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determine how many ranges to render, and multiple handles will be rendered (number + 1).
    *  @default 1
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set initial positions of handles.
    *  @default [0,0]
    */
  var defaultValue: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * onChange will be triggered while the value of Slider changing.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * pushable could be set as true to allow pushing of surrounding handles when moving an handle. When set to a number, the number will be the minimum ensured distance between handles.
    *  @default true
    */
  var pushable: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Set the tabIndex of each handle.
    * @default [0,0]
    */
  var tabIndex: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Set current positions of handles.
    */
  var value: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object RangeProps {
  @scala.inline
  def apply(
    activeDotStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    allowCross: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    defaultValue: js.Array[scala.Double] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dotStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    handle: js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactNode] = null,
    handleStyle: js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties = null,
    included: js.UndefOr[scala.Boolean] = js.undefined,
    marks: Marks = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onAfterChange: js.Function1[/* value */ js.Array[scala.Double], scala.Unit] = null,
    onBeforeChange: js.Function1[/* value */ js.Array[scala.Double], scala.Unit] = null,
    onChange: js.Function1[/* value */ js.Array[scala.Double], scala.Unit] = null,
    pushable: scala.Boolean | scala.Double = null,
    railStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    step: scala.Int | scala.Double = null,
    style: js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: js.Array[scala.Double] = null,
    tipFormatter: js.Function1[/* value */ js.Any, js.UndefOr[_]] = null,
    tipTransitionName: java.lang.String = null,
    trackStyle: js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties = null,
    value: js.Array[scala.Double] = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): RangeProps = {
    val __obj = js.Dynamic.literal()
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle)
    if (!js.isUndefined(allowCross)) __obj.updateDynamic("allowCross")(allowCross)
    if (className != null) __obj.updateDynamic("className")(className)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(onAfterChange)
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(onBeforeChange)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (pushable != null) __obj.updateDynamic("pushable")(pushable.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(tipFormatter)
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[RangeProps]
  }
}

