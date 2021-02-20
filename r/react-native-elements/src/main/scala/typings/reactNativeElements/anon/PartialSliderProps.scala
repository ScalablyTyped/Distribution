package typings.reactNativeElements.anon

import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.horizontal
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.reactNativeElements.reactNativeElementsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.SliderProps> */
@js.native
trait PartialSliderProps extends StObject {
  
  var allowTouchTrack: js.UndefOr[Boolean] = js.native
  
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
  
  var thumbProps: js.UndefOr[js.Any] = js.native
  
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
  implicit class PartialSliderPropsMutableBuilder[Self <: PartialSliderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTouchTrack(value: Boolean): Self = StObject.set(x, "allowTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTouchTrackUndefined: Self = StObject.set(x, "allowTouchTrack", js.undefined)
    
    @scala.inline
    def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: TimingAnimationConfig | SpringAnimationConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    @scala.inline
    def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setDebugTouchArea(value: Boolean): Self = StObject.set(x, "debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugTouchAreaUndefined: Self = StObject.set(x, "debugTouchArea", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnSlidingStart(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setThumbProps(value: js.Any): Self = StObject.set(x, "thumbProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbPropsUndefined: Self = StObject.set(x, "thumbProps", js.undefined)
    
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
    
    @scala.inline
    def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setThumbTouchSize(value: Height): Self = StObject.set(x, "thumbTouchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTouchSizeUndefined: Self = StObject.set(x, "thumbTouchSize", js.undefined)
    
    @scala.inline
    def setTrackStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackStyleNull: Self = StObject.set(x, "trackStyle", null)
    
    @scala.inline
    def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
