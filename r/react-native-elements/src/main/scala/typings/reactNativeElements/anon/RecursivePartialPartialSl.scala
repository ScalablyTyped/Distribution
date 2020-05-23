package typings.reactNativeElements.anon

import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.horizontal
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.reactNativeElements.reactNativeElementsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.SliderProps>> */
trait RecursivePartialPartialSl extends js.Object {
  var animateTransitions: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var animationConfig: js.UndefOr[RecursivePartial[js.UndefOr[TimingAnimationConfig | SpringAnimationConfig]]] = js.undefined
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[spring | timing]]] = js.undefined
  var debugTouchArea: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var maximumTrackTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var maximumValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var minimumTrackTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var minimumValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var onSlidingComplete: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.undefined
  var onSlidingStart: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.undefined
  var onValueChange: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.undefined
  var orientation: js.UndefOr[RecursivePartial[js.UndefOr[horizontal | vertical]]] = js.undefined
  var step: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var thumbStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var thumbTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var thumbTouchSize: js.UndefOr[RecursivePartial[js.UndefOr[Height]]] = js.undefined
  var trackStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var value: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
}

object RecursivePartialPartialSl {
  @scala.inline
  def apply(
    animateTransitions: RecursivePartial[js.UndefOr[Boolean]] = null,
    animationConfig: RecursivePartial[js.UndefOr[TimingAnimationConfig | SpringAnimationConfig]] = null,
    animationType: RecursivePartial[js.UndefOr[spring | timing]] = null,
    debugTouchArea: RecursivePartial[js.UndefOr[Boolean]] = null,
    disabled: RecursivePartial[js.UndefOr[Boolean]] = null,
    maximumTrackTintColor: RecursivePartial[js.UndefOr[String]] = null,
    maximumValue: RecursivePartial[js.UndefOr[Double]] = null,
    minimumTrackTintColor: RecursivePartial[js.UndefOr[String]] = null,
    minimumValue: RecursivePartial[js.UndefOr[Double]] = null,
    onSlidingComplete: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]] = null,
    onSlidingStart: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]] = null,
    onValueChange: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]] = null,
    orientation: RecursivePartial[js.UndefOr[horizontal | vertical]] = null,
    step: RecursivePartial[js.UndefOr[Double]] = null,
    style: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    thumbStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    thumbTintColor: RecursivePartial[js.UndefOr[String]] = null,
    thumbTouchSize: RecursivePartial[js.UndefOr[Height]] = null,
    trackStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    value: RecursivePartial[js.UndefOr[Double]] = null
  ): RecursivePartialPartialSl = {
    val __obj = js.Dynamic.literal()
    if (animateTransitions != null) __obj.updateDynamic("animateTransitions")(animateTransitions.asInstanceOf[js.Any])
    if (animationConfig != null) __obj.updateDynamic("animationConfig")(animationConfig.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (debugTouchArea != null) __obj.updateDynamic("debugTouchArea")(debugTouchArea.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (onSlidingComplete != null) __obj.updateDynamic("onSlidingComplete")(onSlidingComplete.asInstanceOf[js.Any])
    if (onSlidingStart != null) __obj.updateDynamic("onSlidingStart")(onSlidingStart.asInstanceOf[js.Any])
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (thumbTintColor != null) __obj.updateDynamic("thumbTintColor")(thumbTintColor.asInstanceOf[js.Any])
    if (thumbTouchSize != null) __obj.updateDynamic("thumbTouchSize")(thumbTouchSize.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialSl]
  }
}

