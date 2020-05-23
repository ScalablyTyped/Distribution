package typings.reactNativeElements.anon

import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.horizontal
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.reactNativeElements.reactNativeElementsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.SliderProps> */
trait PartialSliderProps extends js.Object {
  var animateTransitions: js.UndefOr[Boolean] = js.undefined
  var animationConfig: js.UndefOr[TimingAnimationConfig | SpringAnimationConfig] = js.undefined
  var animationType: js.UndefOr[spring | timing] = js.undefined
  var debugTouchArea: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumTrackTintColor: js.UndefOr[String] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onSlidingStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var thumbTintColor: js.UndefOr[String] = js.undefined
  var thumbTouchSize: js.UndefOr[Height] = js.undefined
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PartialSliderProps {
  @scala.inline
  def apply(
    animateTransitions: js.UndefOr[Boolean] = js.undefined,
    animationConfig: TimingAnimationConfig | SpringAnimationConfig = null,
    animationType: spring | timing = null,
    debugTouchArea: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maximumTrackTintColor: String = null,
    maximumValue: js.UndefOr[Double] = js.undefined,
    minimumTrackTintColor: String = null,
    minimumValue: js.UndefOr[Double] = js.undefined,
    onSlidingComplete: /* value */ Double => Unit = null,
    onSlidingStart: /* value */ Double => Unit = null,
    onValueChange: /* value */ Double => Unit = null,
    orientation: horizontal | vertical = null,
    step: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    thumbStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    thumbTintColor: String = null,
    thumbTouchSize: Height = null,
    trackStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): PartialSliderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions.get.asInstanceOf[js.Any])
    if (animationConfig != null) __obj.updateDynamic("animationConfig")(animationConfig.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(debugTouchArea)) __obj.updateDynamic("debugTouchArea")(debugTouchArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumValue)) __obj.updateDynamic("maximumValue")(maximumValue.get.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumValue)) __obj.updateDynamic("minimumValue")(minimumValue.get.asInstanceOf[js.Any])
    if (onSlidingComplete != null) __obj.updateDynamic("onSlidingComplete")(js.Any.fromFunction1(onSlidingComplete))
    if (onSlidingStart != null) __obj.updateDynamic("onSlidingStart")(js.Any.fromFunction1(onSlidingStart))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbStyle)) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (thumbTintColor != null) __obj.updateDynamic("thumbTintColor")(thumbTintColor.asInstanceOf[js.Any])
    if (thumbTouchSize != null) __obj.updateDynamic("thumbTouchSize")(thumbTouchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(trackStyle)) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderProps]
  }
}

