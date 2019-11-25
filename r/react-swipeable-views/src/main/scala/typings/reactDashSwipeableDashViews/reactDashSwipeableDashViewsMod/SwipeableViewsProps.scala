package typings.reactDashSwipeableDashViews.reactDashSwipeableDashViewsMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableViewsProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
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
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    animateHeight: js.UndefOr[Boolean] = js.undefined,
    animateTransitions: js.UndefOr[Boolean] = js.undefined,
    axis: AxisType = null,
    containerStyle: CSSProperties = null,
    disableLazyLoading: js.UndefOr[Boolean] = js.undefined,
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
    threshold: Int | Double = null
  ): SwipeableViewsProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(animateHeight)) __obj.updateDynamic("animateHeight")(animateHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLazyLoading)) __obj.updateDynamic("disableLazyLoading")(disableLazyLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents.asInstanceOf[js.Any])
    if (hysteresis != null) __obj.updateDynamic("hysteresis")(hysteresis.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNativeScroll)) __obj.updateDynamic("ignoreNativeScroll")(ignoreNativeScroll.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onChangeIndex != null) __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2(onChangeIndex))
    if (onSwitching != null) __obj.updateDynamic("onSwitching")(js.Any.fromFunction2(onSwitching))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance.asInstanceOf[js.Any])
    if (slideClassName != null) __obj.updateDynamic("slideClassName")(slideClassName.asInstanceOf[js.Any])
    if (slideStyle != null) __obj.updateDynamic("slideStyle")(slideStyle.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableViewsProps]
  }
}

