package typings.rcSlider.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProps extends CommonApiProps {
  /**
    * allowCross could be set as true to allow those handles to cross.
    *  @default true
    */
  var allowCross: js.UndefOr[Boolean] = js.undefined
  /**
    * Determine how many ranges to render, and multiple handles will be rendered (number + 1).
    *  @default 1
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Set initial positions of handles.
    *  @default [0,0]
    */
  var defaultValue: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
  /**
    * onChange will be triggered while the value of Slider changing.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
  /**
    * pushable could be set as true to allow pushing of surrounding handles when moving an handle. When set to a number, the number will be the minimum ensured distance between handles.
    *  @default true
    */
  var pushable: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Set the tabIndex of each handle.
    * @default [0,0]
    */
  var tabIndex: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Set current positions of handles.
    */
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}

object RangeProps {
  @scala.inline
  def apply(
    activeDotStyle: CSSProperties = null,
    allowCross: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    count: js.UndefOr[Double] = js.undefined,
    defaultValue: js.Array[Double] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: /* props */ js.Any => ReactNode = null,
    handleStyle: js.Array[CSSProperties] | CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: Marks = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onAfterChange: /* value */ js.Array[Double] => Unit = null,
    onBeforeChange: /* value */ js.Array[Double] => Unit = null,
    onChange: /* value */ js.Array[Double] => Unit = null,
    pushable: Boolean | Double = null,
    railStyle: CSSProperties = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Null | Double] = js.undefined,
    style: js.Array[CSSProperties] | CSSProperties = null,
    tabIndex: js.Array[Double] = null,
    tipFormatter: js.UndefOr[Null | (/* value */ js.Any => js.UndefOr[_])] = js.undefined,
    tipTransitionName: String = null,
    trackStyle: js.Array[CSSProperties] | CSSProperties = null,
    value: js.Array[Double] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): RangeProps = {
    val __obj = js.Dynamic.literal()
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCross)) __obj.updateDynamic("allowCross")(allowCross.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(js.Any.fromFunction1(handle))
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.get.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1(onBeforeChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (pushable != null) __obj.updateDynamic("pushable")(pushable.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(tipFormatter)) __obj.updateDynamic("tipFormatter")(if (tipFormatter != null) js.Any.fromFunction1(tipFormatter.asInstanceOf[/* value */ js.Any => js.UndefOr[_]]) else null)
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeProps]
  }
}

