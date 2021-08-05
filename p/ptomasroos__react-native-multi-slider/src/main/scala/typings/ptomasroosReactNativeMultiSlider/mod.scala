package typings.ptomasroosReactNativeMultiSlider

import typings.ptomasroosReactNativeMultiSlider.anon.BorderRadius
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ptomasroos/react-native-multi-slider", JSImport.Default)
  @js.native
  class default ()
    extends Component[MultiSliderProps, js.Object, js.Any]
  
  trait MarkerProps extends StObject {
    
    var currentValue: Double
    
    var enabled: Boolean
    
    var markerStyle: ViewStyle
    
    var pressed: Boolean
    
    var pressedMarkerStyle: ViewStyle
    
    var valuePrefix: String
    
    var valueSuffix: String
  }
  object MarkerProps {
    
    inline def apply(
      currentValue: Double,
      enabled: Boolean,
      markerStyle: ViewStyle,
      pressed: Boolean,
      pressedMarkerStyle: ViewStyle,
      valuePrefix: String,
      valueSuffix: String
    ): MarkerProps = {
      val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], markerStyle = markerStyle.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], pressedMarkerStyle = pressedMarkerStyle.asInstanceOf[js.Any], valuePrefix = valuePrefix.asInstanceOf[js.Any], valueSuffix = valueSuffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerProps]
    }
    
    extension [Self <: MarkerProps](x: Self) {
      
      inline def setCurrentValue(value: Double): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMarkerStyle(value: ViewStyle): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
      
      inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedMarkerStyle(value: ViewStyle): Self = StObject.set(x, "pressedMarkerStyle", value.asInstanceOf[js.Any])
      
      inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
      
      inline def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiSlider = Component[MultiSliderProps, js.Object, js.Any]
  
  trait MultiSliderProps extends StObject {
    
    var allowOverlap: js.UndefOr[Boolean] = js.undefined
    
    var containerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var customMarker: js.UndefOr[ComponentType[MarkerProps]] = js.undefined
    
    var customMarkerLeft: js.UndefOr[ComponentType[MarkerProps]] = js.undefined
    
    var customMarkerRight: js.UndefOr[ComponentType[MarkerProps]] = js.undefined
    
    var enabledOne: js.UndefOr[Boolean] = js.undefined
    
    var enabledTwo: js.UndefOr[Boolean] = js.undefined
    
    var isMarkersSeparated: js.UndefOr[Boolean] = js.undefined
    
    var markerContainerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var markerOffsetX: js.UndefOr[Double] = js.undefined
    
    var markerOffsetY: js.UndefOr[Double] = js.undefined
    
    var markerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onToggleOne: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onToggleTwo: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onValuesChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
    
    var onValuesChangeFinish: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
    
    var onValuesChangeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var optionsArray: js.UndefOr[js.Array[Double]] = js.undefined
    
    var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var selectedStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var sliderLength: js.UndefOr[Double] = js.undefined
    
    var snapped: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var touchDimensions: js.UndefOr[BorderRadius] = js.undefined
    
    var trackStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var unselectedStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var valuePrefix: js.UndefOr[String] = js.undefined
    
    var valueSuffix: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object MultiSliderProps {
    
    inline def apply(): MultiSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSliderProps]
    }
    
    extension [Self <: MultiSliderProps](x: Self) {
      
      inline def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
      
      inline def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
      
      inline def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setCustomMarker(value: ComponentType[MarkerProps]): Self = StObject.set(x, "customMarker", value.asInstanceOf[js.Any])
      
      inline def setCustomMarkerLeft(value: ComponentType[MarkerProps]): Self = StObject.set(x, "customMarkerLeft", value.asInstanceOf[js.Any])
      
      inline def setCustomMarkerLeftUndefined: Self = StObject.set(x, "customMarkerLeft", js.undefined)
      
      inline def setCustomMarkerRight(value: ComponentType[MarkerProps]): Self = StObject.set(x, "customMarkerRight", value.asInstanceOf[js.Any])
      
      inline def setCustomMarkerRightUndefined: Self = StObject.set(x, "customMarkerRight", js.undefined)
      
      inline def setCustomMarkerUndefined: Self = StObject.set(x, "customMarker", js.undefined)
      
      inline def setEnabledOne(value: Boolean): Self = StObject.set(x, "enabledOne", value.asInstanceOf[js.Any])
      
      inline def setEnabledOneUndefined: Self = StObject.set(x, "enabledOne", js.undefined)
      
      inline def setEnabledTwo(value: Boolean): Self = StObject.set(x, "enabledTwo", value.asInstanceOf[js.Any])
      
      inline def setEnabledTwoUndefined: Self = StObject.set(x, "enabledTwo", js.undefined)
      
      inline def setIsMarkersSeparated(value: Boolean): Self = StObject.set(x, "isMarkersSeparated", value.asInstanceOf[js.Any])
      
      inline def setIsMarkersSeparatedUndefined: Self = StObject.set(x, "isMarkersSeparated", js.undefined)
      
      inline def setMarkerContainerStyle(value: ViewStyle): Self = StObject.set(x, "markerContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setMarkerContainerStyleUndefined: Self = StObject.set(x, "markerContainerStyle", js.undefined)
      
      inline def setMarkerOffsetX(value: Double): Self = StObject.set(x, "markerOffsetX", value.asInstanceOf[js.Any])
      
      inline def setMarkerOffsetXUndefined: Self = StObject.set(x, "markerOffsetX", js.undefined)
      
      inline def setMarkerOffsetY(value: Double): Self = StObject.set(x, "markerOffsetY", value.asInstanceOf[js.Any])
      
      inline def setMarkerOffsetYUndefined: Self = StObject.set(x, "markerOffsetY", js.undefined)
      
      inline def setMarkerStyle(value: ViewStyle): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
      
      inline def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnToggleOne(value: () => Unit): Self = StObject.set(x, "onToggleOne", js.Any.fromFunction0(value))
      
      inline def setOnToggleOneUndefined: Self = StObject.set(x, "onToggleOne", js.undefined)
      
      inline def setOnToggleTwo(value: () => Unit): Self = StObject.set(x, "onToggleTwo", js.Any.fromFunction0(value))
      
      inline def setOnToggleTwoUndefined: Self = StObject.set(x, "onToggleTwo", js.undefined)
      
      inline def setOnValuesChange(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onValuesChange", js.Any.fromFunction1(value))
      
      inline def setOnValuesChangeFinish(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onValuesChangeFinish", js.Any.fromFunction1(value))
      
      inline def setOnValuesChangeFinishUndefined: Self = StObject.set(x, "onValuesChangeFinish", js.undefined)
      
      inline def setOnValuesChangeStart(value: () => Unit): Self = StObject.set(x, "onValuesChangeStart", js.Any.fromFunction0(value))
      
      inline def setOnValuesChangeStartUndefined: Self = StObject.set(x, "onValuesChangeStart", js.undefined)
      
      inline def setOnValuesChangeUndefined: Self = StObject.set(x, "onValuesChange", js.undefined)
      
      inline def setOptionsArray(value: js.Array[Double]): Self = StObject.set(x, "optionsArray", value.asInstanceOf[js.Any])
      
      inline def setOptionsArrayUndefined: Self = StObject.set(x, "optionsArray", js.undefined)
      
      inline def setOptionsArrayVarargs(value: Double*): Self = StObject.set(x, "optionsArray", js.Array(value :_*))
      
      inline def setPressedMarkerStyle(value: ViewStyle): Self = StObject.set(x, "pressedMarkerStyle", value.asInstanceOf[js.Any])
      
      inline def setPressedMarkerStyleUndefined: Self = StObject.set(x, "pressedMarkerStyle", js.undefined)
      
      inline def setSelectedStyle(value: ViewStyle): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
      
      inline def setSliderLength(value: Double): Self = StObject.set(x, "sliderLength", value.asInstanceOf[js.Any])
      
      inline def setSliderLengthUndefined: Self = StObject.set(x, "sliderLength", js.undefined)
      
      inline def setSnapped(value: Boolean): Self = StObject.set(x, "snapped", value.asInstanceOf[js.Any])
      
      inline def setSnappedUndefined: Self = StObject.set(x, "snapped", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTouchDimensions(value: BorderRadius): Self = StObject.set(x, "touchDimensions", value.asInstanceOf[js.Any])
      
      inline def setTouchDimensionsUndefined: Self = StObject.set(x, "touchDimensions", js.undefined)
      
      inline def setTrackStyle(value: ViewStyle): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setUnselectedStyle(value: ViewStyle): Self = StObject.set(x, "unselectedStyle", value.asInstanceOf[js.Any])
      
      inline def setUnselectedStyleUndefined: Self = StObject.set(x, "unselectedStyle", js.undefined)
      
      inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
      
      inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
      
      inline def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
      
      inline def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
