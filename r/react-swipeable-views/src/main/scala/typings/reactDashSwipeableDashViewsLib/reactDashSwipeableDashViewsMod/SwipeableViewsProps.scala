package typings
package reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableViewsProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] {
  var animateHeight: js.UndefOr[scala.Boolean] = js.undefined
  var animateTransitions: js.UndefOr[scala.Boolean] = js.undefined
  var axis: js.UndefOr[AxisType] = js.undefined
  var containerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /*
    * This is the config used to disable lazy loading, if true it will render all the views in first rendering.
    */
  var disableLazyLoading: js.UndefOr[scala.Boolean] = js.undefined
  var enableMouseEvents: js.UndefOr[scala.Boolean] = js.undefined
  var hysteresis: js.UndefOr[scala.Double] = js.undefined
  var ignoreNativeScroll: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.undefined
  var onSwitching: js.UndefOr[OnSwitchingCallback] = js.undefined
  @JSName("onTransitionEnd")
  var onTransitionEnd_SwipeableViewsProps: js.UndefOr[OnTransitionEndCallback] = js.undefined
  var resistance: js.UndefOr[scala.Boolean] = js.undefined
  var slideClassName: js.UndefOr[java.lang.String] = js.undefined
  var slideStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var springConfig: js.UndefOr[SpringConfig] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object SwipeableViewsProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    animateHeight: js.UndefOr[scala.Boolean] = js.undefined,
    animateTransitions: js.UndefOr[scala.Boolean] = js.undefined,
    axis: AxisType = null,
    containerStyle: reactLib.reactMod.CSSProperties = null,
    disableLazyLoading: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enableMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    hysteresis: scala.Int | scala.Double = null,
    ignoreNativeScroll: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    onChangeIndex: OnChangeIndexCallback = null,
    onSwitching: OnSwitchingCallback = null,
    onTransitionEnd: OnTransitionEndCallback = null,
    resistance: js.UndefOr[scala.Boolean] = js.undefined,
    slideClassName: java.lang.String = null,
    slideStyle: reactLib.reactMod.CSSProperties = null,
    springConfig: SpringConfig = null,
    style: reactLib.reactMod.CSSProperties = null,
    threshold: scala.Int | scala.Double = null
  ): SwipeableViewsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(animateHeight)) __obj.updateDynamic("animateHeight")(animateHeight)
    if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (!js.isUndefined(disableLazyLoading)) __obj.updateDynamic("disableLazyLoading")(disableLazyLoading)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents)
    if (hysteresis != null) __obj.updateDynamic("hysteresis")(hysteresis.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNativeScroll)) __obj.updateDynamic("ignoreNativeScroll")(ignoreNativeScroll)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onChangeIndex != null) __obj.updateDynamic("onChangeIndex")(onChangeIndex)
    if (onSwitching != null) __obj.updateDynamic("onSwitching")(onSwitching)
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd)
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance)
    if (slideClassName != null) __obj.updateDynamic("slideClassName")(slideClassName)
    if (slideStyle != null) __obj.updateDynamic("slideStyle")(slideStyle)
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig)
    if (style != null) __obj.updateDynamic("style")(style)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableViewsProps]
  }
}

