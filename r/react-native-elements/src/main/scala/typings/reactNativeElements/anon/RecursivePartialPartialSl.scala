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
@js.native
trait RecursivePartialPartialSl extends js.Object {
  var animateTransitions: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var animationConfig: js.UndefOr[RecursivePartial[js.UndefOr[TimingAnimationConfig | SpringAnimationConfig]]] = js.native
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[spring | timing]]] = js.native
  var debugTouchArea: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var maximumTrackTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var maximumValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var minimumTrackTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var minimumValue: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var onSlidingComplete: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var onSlidingStart: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var onValueChange: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]] = js.native
  var orientation: js.UndefOr[RecursivePartial[js.UndefOr[horizontal | vertical]]] = js.native
  var step: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var thumbStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var thumbTintColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var thumbTouchSize: js.UndefOr[RecursivePartial[js.UndefOr[Height]]] = js.native
  var trackStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var value: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
}

object RecursivePartialPartialSl {
  @scala.inline
  def apply(): RecursivePartialPartialSl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialSl]
  }
  @scala.inline
  implicit class RecursivePartialPartialSlOps[Self <: RecursivePartialPartialSl] (val x: Self) extends AnyVal {
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
    def setAnimateTransitions(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("animateTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateTransitions: Self = this.set("animateTransitions", js.undefined)
    @scala.inline
    def setAnimationConfig(value: RecursivePartial[js.UndefOr[TimingAnimationConfig | SpringAnimationConfig]]): Self = this.set("animationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationConfig: Self = this.set("animationConfig", js.undefined)
    @scala.inline
    def setAnimationType(value: RecursivePartial[js.UndefOr[spring | timing]]): Self = this.set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    @scala.inline
    def setDebugTouchArea(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("debugTouchArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugTouchArea: Self = this.set("debugTouchArea", js.undefined)
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMaximumTrackTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    @scala.inline
    def setMaximumValue(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    @scala.inline
    def setMinimumTrackTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
    @scala.inline
    def setMinimumValue(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    @scala.inline
    def setOnSlidingComplete(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = this.set("onSlidingComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    @scala.inline
    def setOnSlidingStart(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = this.set("onSlidingStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSlidingStart: Self = this.set("onSlidingStart", js.undefined)
    @scala.inline
    def setOnValueChange(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = this.set("onValueChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setOrientation(value: RecursivePartial[js.UndefOr[horizontal | vertical]]): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setStep(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setThumbStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    @scala.inline
    def setThumbTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    @scala.inline
    def setThumbTouchSize(value: RecursivePartial[js.UndefOr[Height]]): Self = this.set("thumbTouchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbTouchSize: Self = this.set("thumbTouchSize", js.undefined)
    @scala.inline
    def setTrackStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    @scala.inline
    def setValue(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

