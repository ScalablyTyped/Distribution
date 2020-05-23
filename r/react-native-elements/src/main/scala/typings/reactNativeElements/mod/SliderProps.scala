package typings.reactNativeElements.mod

import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.Height
import typings.reactNativeElements.reactNativeElementsStrings.horizontal
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.reactNativeElements.reactNativeElementsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  /**
    * Set to true if you want to use the default 'spring' animation
    *
    * @default false
    */
  var animateTransitions: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to configure the animation parameters. These are the same parameters in the Animated library.
    *
    * @default undefined
    */
  var animationConfig: js.UndefOr[TimingAnimationConfig | SpringAnimationConfig] = js.undefined
  /**
    * Set to 'spring' or 'timing' to use one of those two types of animations with the default animation properties.
    *
    * @default 'timing'
    */
  var animationType: js.UndefOr[spring | timing] = js.undefined
  /**
    * Set this to true to visually see the thumb touch rect in green.
    *
    * @default false
    */
  var debugTouchArea: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the user won't be able to move the slider
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The color used for the track to the right of the button
    *
    * @default '#b3b3b3'
    */
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  /**
    * Initial maximum value of the slider
    *
    * @default 1
    */
  var maximumValue: js.UndefOr[Double] = js.undefined
  /**
    * The color used for the track to the left of the button
    *
    * @default '#3f3f3f'
    */
  var minimumTrackTintColor: js.UndefOr[String] = js.undefined
  /**
    * Initial minimum value of the slider
    *
    * @default	0
    */
  var minimumValue: js.UndefOr[Double] = js.undefined
  /**
    * Callback called when the user finishes changing the value (e.g. when the slider is released)
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Callback called when the user starts changing the value (e.g. when the slider is pressed)
    */
  var onSlidingStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Callback continuously called while the user is dragging the slider
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Choose the orientation
    *
    * @default horizontal
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * Step value of the slider. The value should be between 0 and maximumValue - minimumValue)
    *
    * @default 0
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * The style applied to the slider container
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * The style applied to the thumb
    */
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * The color used for the thumb
    *
    * @default '#343434'
    */
  var thumbTintColor: js.UndefOr[String] = js.undefined
  /**
    * The size of the touch area that allows moving the thumb. The touch area has the same center as the visible thumb.
    * This allows to have a visually small thumb while still allowing the user to move it easily.
    *
    * @default "{width: 40, height: 40}"
    */
  var thumbTouchSize: js.UndefOr[Height] = js.undefined
  /**
    * The style applied to the track
    */
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Initial value of the slider
    *
    * @default 0
    */
  var value: js.UndefOr[Double] = js.undefined
}

object SliderProps {
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
  ): SliderProps = {
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
    __obj.asInstanceOf[SliderProps]
  }
}

