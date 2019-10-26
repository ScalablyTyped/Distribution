package typings.rcDashSlider.rcDashSliderMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends CommonApiProps {
  /**
    * Set initial value of slider.
    *  @default 0
    */
  var defaultValue: js.UndefOr[Double] = js.undefined
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Handle blur event on the control
    */
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  /**
    * onChange will be triggered while the value of Slider changing.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Set the tabIndex of the slider handle.
    * @default 0
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
    * Set current value of slider.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    activeDotStyle: CSSProperties = null,
    className: String = null,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: /* props */ js.Any => ReactNode = null,
    handleStyle: js.Array[CSSProperties] | CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: Marks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ Double => Unit = null,
    onBeforeChange: /* value */ Double => Unit = null,
    onBlur: FocusEvent[Element] => Unit = null,
    onChange: /* value */ Double => Unit = null,
    railStyle: CSSProperties = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: js.Array[CSSProperties] | CSSProperties = null,
    tabIndex: Int | Double = null,
    tipFormatter: /* value */ js.Any => js.UndefOr[_] = null,
    tipTransitionName: String = null,
    trackStyle: js.Array[CSSProperties] | CSSProperties = null,
    value: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (handle != null) __obj.updateDynamic("handle")(js.Any.fromFunction1(handle))
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1(onBeforeChange))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[SliderProps]
  }
}

