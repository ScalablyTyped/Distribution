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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.SliderProps>> */
@js.native
trait RecursivePartialPartialSl extends StObject {
  
  var allowTouchTrack: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
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
  
  var thumbProps: js.UndefOr[RecursivePartial[js.UndefOr[_]]] = js.native
  
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
  implicit class RecursivePartialPartialSlMutableBuilder[Self <: RecursivePartialPartialSl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTouchTrack(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowTouchTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTouchTrackUndefined: Self = StObject.set(x, "allowTouchTrack", js.undefined)
    
    @scala.inline
    def setAnimateTransitions(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
    
    @scala.inline
    def setAnimationConfig(value: RecursivePartial[js.UndefOr[TimingAnimationConfig | SpringAnimationConfig]]): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    @scala.inline
    def setAnimationType(value: RecursivePartial[js.UndefOr[spring | timing]]): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    @scala.inline
    def setDebugTouchArea(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "debugTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugTouchAreaUndefined: Self = StObject.set(x, "debugTouchArea", js.undefined)
    
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMaximumTrackTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumTrackTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = StObject.set(x, "onSlidingComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnSlidingStart(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = StObject.set(x, "onSlidingStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Unit]]]): Self = StObject.set(x, "onValueChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: RecursivePartial[js.UndefOr[horizontal | vertical]]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setStep(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setThumbProps(value: RecursivePartial[js.UndefOr[_]]): Self = StObject.set(x, "thumbProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbPropsUndefined: Self = StObject.set(x, "thumbProps", js.undefined)
    
    @scala.inline
    def setThumbStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setThumbTouchSize(value: RecursivePartial[js.UndefOr[Height]]): Self = StObject.set(x, "thumbTouchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTouchSizeUndefined: Self = StObject.set(x, "thumbTouchSize", js.undefined)
    
    @scala.inline
    def setTrackStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
    
    @scala.inline
    def setValue(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
