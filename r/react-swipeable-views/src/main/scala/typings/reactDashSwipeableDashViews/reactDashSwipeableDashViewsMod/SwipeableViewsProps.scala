package typings.reactDashSwipeableDashViews.reactDashSwipeableDashViewsMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableViewsProps extends HTMLProps[HTMLDivElement] {
  var animateHeight: js.UndefOr[Boolean] = js.undefined
  var animateTransitions: js.UndefOr[Boolean] = js.undefined
  var axis: js.UndefOr[AxisType] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  /*
    * This is the config used to disable lazy loading, if true it will render all the views in first rendering.
    */
  var disableLazyLoading: js.UndefOr[Boolean] = js.undefined
  var enableMouseEvents: js.UndefOr[Boolean] = js.undefined
  var hysteresis: js.UndefOr[Double] = js.undefined
  var ignoreNativeScroll: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.undefined
  var onSwitching: js.UndefOr[OnSwitchingCallback] = js.undefined
  @JSName("onTransitionEnd")
  var onTransitionEnd_SwipeableViewsProps: js.UndefOr[OnTransitionEndCallback] = js.undefined
  var resistance: js.UndefOr[Boolean] = js.undefined
  var slideClassName: js.UndefOr[String] = js.undefined
  var slideStyle: js.UndefOr[CSSProperties] = js.undefined
  var springConfig: js.UndefOr[SpringConfig] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object SwipeableViewsProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLDivElement] = null,
    animateHeight: js.UndefOr[Boolean] = js.undefined,
    animateTransitions: js.UndefOr[Boolean] = js.undefined,
    axis: AxisType = null,
    containerStyle: CSSProperties = null,
    disableLazyLoading: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableMouseEvents: js.UndefOr[Boolean] = js.undefined,
    hysteresis: Int | Double = null,
    ignoreNativeScroll: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit = null,
    onSwitching: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit = null,
    onTransitionEnd: () => Unit = null,
    resistance: js.UndefOr[Boolean] = js.undefined,
    slideClassName: String = null,
    slideStyle: CSSProperties = null,
    springConfig: SpringConfig = null,
    style: CSSProperties = null,
    threshold: Int | Double = null
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
    if (onChangeIndex != null) __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2(onChangeIndex))
    if (onSwitching != null) __obj.updateDynamic("onSwitching")(js.Any.fromFunction2(onSwitching))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance)
    if (slideClassName != null) __obj.updateDynamic("slideClassName")(slideClassName)
    if (slideStyle != null) __obj.updateDynamic("slideStyle")(slideStyle)
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig)
    if (style != null) __obj.updateDynamic("style")(style)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableViewsProps]
  }
}

