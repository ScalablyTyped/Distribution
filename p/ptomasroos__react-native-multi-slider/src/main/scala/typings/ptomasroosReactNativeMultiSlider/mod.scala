package typings.ptomasroosReactNativeMultiSlider

import typings.ptomasroosReactNativeMultiSlider.anon.BorderRadius
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ptomasroos/react-native-multi-slider", JSImport.Default)
  @js.native
  class default ()
    extends Component[MultiSliderProps, js.Object, js.Any]
  
  @js.native
  trait MarkerProps extends StObject {
    
    var currentValue: Double = js.native
    
    var enabled: Boolean = js.native
    
    var markerStyle: ViewStyle = js.native
    
    var pressed: Boolean = js.native
    
    var pressedMarkerStyle: ViewStyle = js.native
    
    var valuePrefix: String = js.native
    
    var valueSuffix: String = js.native
  }
  object MarkerProps {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MarkerPropsMutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentValue(value: Double): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStyle(value: ViewStyle): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressedMarkerStyle(value: ViewStyle): Self = StObject.set(x, "pressedMarkerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiSlider = Component[MultiSliderProps, js.Object, js.Any]
  
  @js.native
  trait MultiSliderProps extends StObject {
    
    var allowOverlap: js.UndefOr[Boolean] = js.native
    
    var containerStyle: js.UndefOr[ViewStyle] = js.native
    
    var customMarker: js.UndefOr[ComponentType[MarkerProps]] = js.native
    
    var customMarkerLeft: js.UndefOr[ComponentType[MarkerProps]] = js.native
    
    var customMarkerRight: js.UndefOr[ComponentType[MarkerProps]] = js.native
    
    var enabledOne: js.UndefOr[Boolean] = js.native
    
    var enabledTwo: js.UndefOr[Boolean] = js.native
    
    var isMarkersSeparated: js.UndefOr[Boolean] = js.native
    
    var markerContainerStyle: js.UndefOr[ViewStyle] = js.native
    
    var markerOffsetX: js.UndefOr[Double] = js.native
    
    var markerOffsetY: js.UndefOr[Double] = js.native
    
    var markerStyle: js.UndefOr[ViewStyle] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onToggleOne: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onToggleTwo: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onValuesChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
    
    var onValuesChangeFinish: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
    
    var onValuesChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var optionsArray: js.UndefOr[js.Array[Double]] = js.native
    
    var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.native
    
    var selectedStyle: js.UndefOr[ViewStyle] = js.native
    
    var sliderLength: js.UndefOr[Double] = js.native
    
    var snapped: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var touchDimensions: js.UndefOr[BorderRadius] = js.native
    
    var trackStyle: js.UndefOr[ViewStyle] = js.native
    
    var unselectedStyle: js.UndefOr[ViewStyle] = js.native
    
    var valuePrefix: js.UndefOr[String] = js.native
    
    var valueSuffix: js.UndefOr[String] = js.native
    
    var values: js.UndefOr[js.Array[Double]] = js.native
  }
  object MultiSliderProps {
    
    @scala.inline
    def apply(): MultiSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSliderProps]
    }
    
    @scala.inline
    implicit class MultiSliderPropsMutableBuilder[Self <: MultiSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setCustomMarker(value: ComponentType[MarkerProps]): Self = StObject.set(x, "customMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMarkerLeft(value: ComponentType[MarkerProps]): Self = StObject.set(x, "customMarkerLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMarkerLeftUndefined: Self = StObject.set(x, "customMarkerLeft", js.undefined)
      
      @scala.inline
      def setCustomMarkerRight(value: ComponentType[MarkerProps]): Self = StObject.set(x, "customMarkerRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMarkerRightUndefined: Self = StObject.set(x, "customMarkerRight", js.undefined)
      
      @scala.inline
      def setCustomMarkerUndefined: Self = StObject.set(x, "customMarker", js.undefined)
      
      @scala.inline
      def setEnabledOne(value: Boolean): Self = StObject.set(x, "enabledOne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledOneUndefined: Self = StObject.set(x, "enabledOne", js.undefined)
      
      @scala.inline
      def setEnabledTwo(value: Boolean): Self = StObject.set(x, "enabledTwo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledTwoUndefined: Self = StObject.set(x, "enabledTwo", js.undefined)
      
      @scala.inline
      def setIsMarkersSeparated(value: Boolean): Self = StObject.set(x, "isMarkersSeparated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMarkersSeparatedUndefined: Self = StObject.set(x, "isMarkersSeparated", js.undefined)
      
      @scala.inline
      def setMarkerContainerStyle(value: ViewStyle): Self = StObject.set(x, "markerContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerContainerStyleUndefined: Self = StObject.set(x, "markerContainerStyle", js.undefined)
      
      @scala.inline
      def setMarkerOffsetX(value: Double): Self = StObject.set(x, "markerOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerOffsetXUndefined: Self = StObject.set(x, "markerOffsetX", js.undefined)
      
      @scala.inline
      def setMarkerOffsetY(value: Double): Self = StObject.set(x, "markerOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerOffsetYUndefined: Self = StObject.set(x, "markerOffsetY", js.undefined)
      
      @scala.inline
      def setMarkerStyle(value: ViewStyle): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnToggleOne(value: () => Unit): Self = StObject.set(x, "onToggleOne", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnToggleOneUndefined: Self = StObject.set(x, "onToggleOne", js.undefined)
      
      @scala.inline
      def setOnToggleTwo(value: () => Unit): Self = StObject.set(x, "onToggleTwo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnToggleTwoUndefined: Self = StObject.set(x, "onToggleTwo", js.undefined)
      
      @scala.inline
      def setOnValuesChange(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onValuesChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValuesChangeFinish(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onValuesChangeFinish", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValuesChangeFinishUndefined: Self = StObject.set(x, "onValuesChangeFinish", js.undefined)
      
      @scala.inline
      def setOnValuesChangeStart(value: () => Unit): Self = StObject.set(x, "onValuesChangeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnValuesChangeStartUndefined: Self = StObject.set(x, "onValuesChangeStart", js.undefined)
      
      @scala.inline
      def setOnValuesChangeUndefined: Self = StObject.set(x, "onValuesChange", js.undefined)
      
      @scala.inline
      def setOptionsArray(value: js.Array[Double]): Self = StObject.set(x, "optionsArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsArrayUndefined: Self = StObject.set(x, "optionsArray", js.undefined)
      
      @scala.inline
      def setOptionsArrayVarargs(value: Double*): Self = StObject.set(x, "optionsArray", js.Array(value :_*))
      
      @scala.inline
      def setPressedMarkerStyle(value: ViewStyle): Self = StObject.set(x, "pressedMarkerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressedMarkerStyleUndefined: Self = StObject.set(x, "pressedMarkerStyle", js.undefined)
      
      @scala.inline
      def setSelectedStyle(value: ViewStyle): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
      
      @scala.inline
      def setSliderLength(value: Double): Self = StObject.set(x, "sliderLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderLengthUndefined: Self = StObject.set(x, "sliderLength", js.undefined)
      
      @scala.inline
      def setSnapped(value: Boolean): Self = StObject.set(x, "snapped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnappedUndefined: Self = StObject.set(x, "snapped", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTouchDimensions(value: BorderRadius): Self = StObject.set(x, "touchDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchDimensionsUndefined: Self = StObject.set(x, "touchDimensions", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: ViewStyle): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setUnselectedStyle(value: ViewStyle): Self = StObject.set(x, "unselectedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedStyleUndefined: Self = StObject.set(x, "unselectedStyle", js.undefined)
      
      @scala.inline
      def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
      
      @scala.inline
      def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
