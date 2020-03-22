package typings.reactNativeElements

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
  var thumbTouchSize: js.UndefOr[AnonHeight] = js.undefined
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
    maximumValue: Int | Double = null,
    minimumTrackTintColor: String = null,
    minimumValue: Int | Double = null,
    onSlidingComplete: /* value */ Double => Unit = null,
    onSlidingStart: /* value */ Double => Unit = null,
    onValueChange: /* value */ Double => Unit = null,
    orientation: horizontal | vertical = null,
    step: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    thumbStyle: StyleProp[ViewStyle] = null,
    thumbTintColor: String = null,
    thumbTouchSize: AnonHeight = null,
    trackStyle: StyleProp[ViewStyle] = null,
    value: Int | Double = null
  ): PartialSliderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions.asInstanceOf[js.Any])
    if (animationConfig != null) __obj.updateDynamic("animationConfig")(animationConfig.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(debugTouchArea)) __obj.updateDynamic("debugTouchArea")(debugTouchArea.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (onSlidingComplete != null) __obj.updateDynamic("onSlidingComplete")(js.Any.fromFunction1(onSlidingComplete))
    if (onSlidingStart != null) __obj.updateDynamic("onSlidingStart")(js.Any.fromFunction1(onSlidingStart))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (thumbTintColor != null) __obj.updateDynamic("thumbTintColor")(thumbTintColor.asInstanceOf[js.Any])
    if (thumbTouchSize != null) __obj.updateDynamic("thumbTouchSize")(thumbTouchSize.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderProps]
  }
}

