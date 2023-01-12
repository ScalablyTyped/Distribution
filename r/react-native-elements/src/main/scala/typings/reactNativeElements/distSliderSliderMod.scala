package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.ContainerHorizontal
import typings.reactNativeElements.anon.PickSliderPropsPartialThe
import typings.reactNativeElements.anon.SliderPropsPartialThemePr
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.reactNativeElementsStrings.horizontal
import typings.reactNativeElements.reactNativeElementsStrings.spring
import typings.reactNativeElements.reactNativeElementsStrings.timing
import typings.reactNativeElements.reactNativeElementsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSliderSliderMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/slider/Slider", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickSliderPropsPartialThe] | ForwardRefExoticComponent[SliderPropsPartialThemePr] = js.native
  
  @JSImport("react-native-elements/dist/slider/Slider", "Slider")
  @js.native
  val Slider: RneFunctionComponent[SliderProps] = js.native
  
  trait Sizable extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Sizable {
    
    inline def apply(height: Double, width: Double): Sizable = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sizable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sizable] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SliderProps extends StObject {
    
    var allowTouchTrack: js.UndefOr[Boolean] = js.undefined
    
    var animateTransitions: js.UndefOr[Boolean] = js.undefined
    
    var animationConfig: js.UndefOr[TimingAnimationConfig | SpringAnimationConfig] = js.undefined
    
    var animationType: js.UndefOr[spring | timing] = js.undefined
    
    var containerStyle: js.UndefOr[ContainerHorizontal] = js.undefined
    
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
    
    var thumbProps: js.UndefOr[Any] = js.undefined
    
    var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var thumbTintColor: js.UndefOr[String] = js.undefined
    
    var thumbTouchSize: js.UndefOr[Sizable] = js.undefined
    
    var trackStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      inline def setAllowTouchTrack(value: Boolean): Self = StObject.set(x, "allowTouchTrack", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchTrackUndefined: Self = StObject.set(x, "allowTouchTrack", js.undefined)
      
      inline def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
      
      inline def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
      
      inline def setAnimationConfig(value: TimingAnimationConfig | SpringAnimationConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
      
      inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
      
      inline def setAnimationType(value: spring | timing): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      inline def setContainerStyle(value: ContainerHorizontal): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDebugTouchArea(value: Boolean): Self = StObject.set(x, "debugTouchArea", value.asInstanceOf[js.Any])
      
      inline def setDebugTouchAreaUndefined: Self = StObject.set(x, "debugTouchArea", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
      
      inline def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
      
      inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
      
      inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
      
      inline def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
      
      inline def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
      
      inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
      
      inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
      
      inline def setOnSlidingComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
      
      inline def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
      
      inline def setOnSlidingStart(value: /* value */ Double => Unit): Self = StObject.set(x, "onSlidingStart", js.Any.fromFunction1(value))
      
      inline def setOnSlidingStartUndefined: Self = StObject.set(x, "onSlidingStart", js.undefined)
      
      inline def setOnValueChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThumbProps(value: Any): Self = StObject.set(x, "thumbProps", value.asInstanceOf[js.Any])
      
      inline def setThumbPropsUndefined: Self = StObject.set(x, "thumbProps", js.undefined)
      
      inline def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
      
      inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
      
      inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
      
      inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
      
      inline def setThumbTouchSize(value: Sizable): Self = StObject.set(x, "thumbTouchSize", value.asInstanceOf[js.Any])
      
      inline def setThumbTouchSizeUndefined: Self = StObject.set(x, "thumbTouchSize", js.undefined)
      
      inline def setTrackStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleNull: Self = StObject.set(x, "trackStyle", null)
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickSliderPropsPartialThe] | ForwardRefExoticComponent[SliderPropsPartialThemePr]
  
  /* This means you don't have to write `default`, but can instead just say `distSliderSliderMod.foo` */
  override def _to: FunctionComponent[PickSliderPropsPartialThe] | ForwardRefExoticComponent[SliderPropsPartialThemePr] = default
}
