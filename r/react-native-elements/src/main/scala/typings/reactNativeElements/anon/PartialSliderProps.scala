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
@js.native
trait PartialSliderProps extends js.Object {
  var animateTransitions: js.UndefOr[Boolean] = js.native
  var animationConfig: js.UndefOr[TimingAnimationConfig | SpringAnimationConfig] = js.native
  var animationType: js.UndefOr[spring | timing] = js.native
  var debugTouchArea: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  var maximumValue: js.UndefOr[Double] = js.native
  var minimumTrackTintColor: js.UndefOr[String] = js.native
  var minimumValue: js.UndefOr[Double] = js.native
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onSlidingStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  var step: js.UndefOr[Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var thumbTintColor: js.UndefOr[String] = js.native
  var thumbTouchSize: js.UndefOr[Height] = js.native
  var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var value: js.UndefOr[Double] = js.native
}

object PartialSliderProps {
  @scala.inline
  def apply(): PartialSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderProps]
  }
  @scala.inline
  implicit class PartialSliderPropsOps[Self <: PartialSliderProps] (val x: Self) extends AnyVal {
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

