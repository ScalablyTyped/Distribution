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

@js.native
trait SliderProps extends js.Object {
  /**
    * Set to true if you want to use the default 'spring' animation
    *
    * @default false
    */
  var animateTransitions: js.UndefOr[Boolean] = js.native
  /**
    * Used to configure the animation parameters. These are the same parameters in the Animated library.
    *
    * @default undefined
    */
  var animationConfig: js.UndefOr[TimingAnimationConfig | SpringAnimationConfig] = js.native
  /**
    * Set to 'spring' or 'timing' to use one of those two types of animations with the default animation properties.
    *
    * @default 'timing'
    */
  var animationType: js.UndefOr[spring | timing] = js.native
  /**
    * Set this to true to visually see the thumb touch rect in green.
    *
    * @default false
    */
  var debugTouchArea: js.UndefOr[Boolean] = js.native
  /**
    * If true the user won't be able to move the slider
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The color used for the track to the right of the button
    *
    * @default '#b3b3b3'
    */
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  /**
    * Initial maximum value of the slider
    *
    * @default 1
    */
  var maximumValue: js.UndefOr[Double] = js.native
  /**
    * The color used for the track to the left of the button
    *
    * @default '#3f3f3f'
    */
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  /**
    * Initial minimum value of the slider
    *
    * @default	0
    */
  var minimumValue: js.UndefOr[Double] = js.native
  /**
    * Callback called when the user finishes changing the value (e.g. when the slider is released)
    */
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Callback called when the user starts changing the value (e.g. when the slider is pressed)
    */
  var onSlidingStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Callback continuously called while the user is dragging the slider
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Choose the orientation
    *
    * @default horizontal
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Step value of the slider. The value should be between 0 and maximumValue - minimumValue)
    *
    * @default 0
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * The style applied to the slider container
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * The style applied to the thumb
    */
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * The color used for the thumb
    *
    * @default '#343434'
    */
  var thumbTintColor: js.UndefOr[String] = js.native
  /**
    * The size of the touch area that allows moving the thumb. The touch area has the same center as the visible thumb.
    * This allows to have a visually small thumb while still allowing the user to move it easily.
    *
    * @default "{width: 40, height: 40}"
    */
  var thumbTouchSize: js.UndefOr[Height] = js.native
  /**
    * The style applied to the track
    */
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Initial value of the slider
    *
    * @default 0
    */
  var value: js.UndefOr[Double] = js.native
}

object SliderProps {
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimateTransitions(value: Boolean): Self = this.set("animateTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateTransitions: Self = this.set("animateTransitions", js.undefined)
    @scala.inline
    def setAnimationConfig(value: TimingAnimationConfig | SpringAnimationConfig): Self = this.set("animationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationConfig: Self = this.set("animationConfig", js.undefined)
    @scala.inline
    def setAnimationType(value: spring | timing): Self = this.set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    @scala.inline
    def setDebugTouchArea(value: Boolean): Self = this.set("debugTouchArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugTouchArea: Self = this.set("debugTouchArea", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    @scala.inline
    def setMaximumValue(value: Double): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    @scala.inline
    def setOnSlidingComplete(value: /* value */ Double => Unit): Self = this.set("onSlidingComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    @scala.inline
    def setOnSlidingStart(value: /* value */ Double => Unit): Self = this.set("onSlidingStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSlidingStart: Self = this.set("onSlidingStart", js.undefined)
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    @scala.inline
    def setThumbStyleNull: Self = this.set("thumbStyle", null)
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    @scala.inline
    def setThumbTouchSize(value: Height): Self = this.set("thumbTouchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbTouchSize: Self = this.set("thumbTouchSize", js.undefined)
    @scala.inline
    def setTrackStyle(value: StyleProp[ViewStyle]): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    @scala.inline
    def setTrackStyleNull: Self = this.set("trackStyle", null)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

