package typings
package rcDashSliderLib.rcDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends CommonApiProps {
  /**
    * Set initial value of slider.
    *  @default 0
    */
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * onChange will be triggered while the value of Slider changing.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Set the tabIndex of the slider handle.
    * @default 0
    */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set current value of slider.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    activeDotStyle: reactLib.reactMod.CSSProperties = null,
    className: java.lang.String = null,
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dotStyle: reactLib.reactMod.CSSProperties = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    handle: /* props */ js.Any => reactLib.reactMod.ReactNode = null,
    handleStyle: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties = null,
    included: js.UndefOr[scala.Boolean] = js.undefined,
    marks: Marks = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onAfterChange: /* value */ scala.Double => scala.Unit = null,
    onBeforeChange: /* value */ scala.Double => scala.Unit = null,
    onChange: /* value */ scala.Double => scala.Unit = null,
    railStyle: reactLib.reactMod.CSSProperties = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    style: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    tipFormatter: /* value */ js.Any => js.UndefOr[_] = null,
    tipTransitionName: java.lang.String = null,
    trackStyle: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties = null,
    value: scala.Int | scala.Double = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
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

