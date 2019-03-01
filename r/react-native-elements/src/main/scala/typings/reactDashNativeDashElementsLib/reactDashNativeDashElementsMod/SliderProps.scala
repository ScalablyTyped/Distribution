package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  /**
    * Set to true if you want to use the default 'spring' animation
    *
    * @default false
    */
  var animateTransitions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to configure the animation parameters. These are the same parameters in the Animated library.
    *
    * @default undefined
    */
  var animationConfig: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.AnimatedNs.TimingAnimationConfig | reactDashNativeLib.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
  ] = js.undefined
  /**
    * Set to 'spring' or 'timing' to use one of those two types of animations with the default animation properties.
    *
    * @default 'timing'
    */
  var animationType: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.spring | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.timing
  ] = js.undefined
  /**
    * Set this to true to visually see the thumb touch rect in green.
    *
    * @default false
    */
  var debugTouchArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the user won't be able to move the slider
    *
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The color used for the track to the right of the button
    *
    * @default '#b3b3b3'
    */
  var maximumTrackTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Initial maximum value of the slider
    *
    * @default 1
    */
  var maximumValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color used for the track to the left of the button
    *
    * @default '#3f3f3f'
    */
  var minimumTrackTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Initial minimum value of the slider
    *
    * @default	0
    */
  var minimumValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback called when the user finishes changing the value (e.g. when the slider is released)
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Callback called when the user starts changing the value (e.g. when the slider is pressed)
    */
  var onSlidingStart: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Callback continuously called while the user is dragging the slider
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Choose the orientation
    *
    * @default horizontal
    */
  var orientation: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.horizontal | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.vertical
  ] = js.undefined
  /**
    * Step value of the slider. The value should be between 0 and maximumValue - minimumValue)
    *
    * @default 0
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * The style applied to the slider container
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * The style applied to the thumb
    */
  var thumbStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * The color used for the thumb
    *
    * @default '#343434'
    */
  var thumbTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The size of the touch area that allows moving the thumb. The touch area has the same center as the visible thumb.
    * This allows to have a visually small thumb while still allowing the user to move it easily.
    *
    * @default "{width: 40, height: 40}"
    */
  var thumbTouchSize: js.UndefOr[reactDashNativeDashElementsLib.Anon_Height] = js.undefined
  /**
    * The style applied to the track
    */
  var trackStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Initial value of the slider
    *
    * @default 0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    animateTransitions: js.UndefOr[scala.Boolean] = js.undefined,
    animationConfig: reactDashNativeLib.reactDashNativeMod.AnimatedNs.TimingAnimationConfig | reactDashNativeLib.reactDashNativeMod.AnimatedNs.SpringAnimationConfig = null,
    animationType: reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.spring | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.timing = null,
    debugTouchArea: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    maximumTrackTintColor: java.lang.String = null,
    maximumValue: scala.Int | scala.Double = null,
    minimumTrackTintColor: java.lang.String = null,
    minimumValue: scala.Int | scala.Double = null,
    onSlidingComplete: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    onSlidingStart: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    onValueChange: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    orientation: reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.horizontal | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.vertical = null,
    step: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    thumbStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    thumbTintColor: java.lang.String = null,
    thumbTouchSize: reactDashNativeDashElementsLib.Anon_Height = null,
    trackStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    value: scala.Int | scala.Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions)
    if (animationConfig != null) __obj.updateDynamic("animationConfig")(animationConfig.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(debugTouchArea)) __obj.updateDynamic("debugTouchArea")(debugTouchArea)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor)
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor)
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (onSlidingComplete != null) __obj.updateDynamic("onSlidingComplete")(onSlidingComplete)
    if (onSlidingStart != null) __obj.updateDynamic("onSlidingStart")(onSlidingStart)
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(onValueChange)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (thumbTintColor != null) __obj.updateDynamic("thumbTintColor")(thumbTintColor)
    if (thumbTouchSize != null) __obj.updateDynamic("thumbTouchSize")(thumbTouchSize)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

