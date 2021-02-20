package typings.reactNativeMultiSlider

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMultiSlider.anon.BorderRadius
import typings.reactNativeMultiSlider.reactNativeMultiSliderStrings.horizontal
import typings.reactNativeMultiSlider.reactNativeMultiSliderStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-multi-slider", JSImport.Default)
  @js.native
  class default ()
    extends Component[MultiSliderProps, js.Object, js.Any]
  
  @js.native
  trait MarkerProps extends StObject {
    
    var markerStyle: js.UndefOr[ViewStyle] = js.native
    
    var pressed: js.UndefOr[Double] = js.native
    
    var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object MarkerProps {
    
    @scala.inline
    def apply(): MarkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerProps]
    }
    
    @scala.inline
    implicit class MarkerPropsMutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkerStyle(value: ViewStyle): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
      
      @scala.inline
      def setPressed(value: Double): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressedMarkerStyle(value: ViewStyle): Self = StObject.set(x, "pressedMarkerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressedMarkerStyleUndefined: Self = StObject.set(x, "pressedMarkerStyle", js.undefined)
      
      @scala.inline
      def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type MultiSlider = Component[MultiSliderProps, js.Object, js.Any]
  
  @js.native
  trait MultiSliderProps extends StObject {
    
    /**
      * Style of sliders container, note be careful in applying styles that may affect the children's (i.e. the slider's) positioning
      *
      * Default { height: 30 }
      */
    var containerStyle: js.UndefOr[ViewStyle] = js.native
    
    var customMarker: js.UndefOr[ComponentType[MarkerProps]] = js.native
    
    /**
      * Customise the marker's style
      *
      * Default {
      *     height:30,
      *     width: 30,
      *     borderRadius: 15,
      *     backgroundColor:'#E8E8E8',
      *     borderWidth: 0.5,
      *     borderColor: 'grey',
      * }
      */
    var markerStyle: js.UndefOr[ViewStyle] = js.native
    
    /**
      * Slider max value corresponding to far right
      *
      * Default 10
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Slider min value corresponding to far left
      *
      * Default 0
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Function called after every change in value, with current values passed in as an array.
      */
    var onValuesChange: js.UndefOr[js.Function1[/* change */ js.Array[Double], Unit]] = js.native
    
    /**
      * Function called on end of press with final values passed in as an array
      */
    var onValuesChangeFinish: js.UndefOr[js.Function1[/* change */ js.Array[Double], Unit]] = js.native
    
    /**
      * Function to be called at beginning of press
      */
    var onValuesChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Array of values corresponding to the slider's position (left to right on slider index 0 to end respectively).
      * Values of any type can be inserted and the slider will simply give them back in the callbacks
      */
    var optionsArray: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Style to be given to marker when pressed
      *
      * Default { backgroundColor:'#D3D3D3' }
      */
    var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.native
    
    /**
      * Style for the track up to a single marker or between double markers
      *
      * Default { backgroundColor: 'blue' }
      */
    var selectedStyle: js.UndefOr[ViewStyle] = js.native
    
    /**
      * Width of track
      *
      * Default 280
      */
    var sliderLength: js.UndefOr[Double] = js.native
    
    /**
      * TODO
      */
    var sliderOrientation: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * The step size between values. Make sure min max range is divisible by this to get expected results
      *
      * Default 1
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * Area to be touched, should enclose the whole marker.
      * Will be automatically centered and contain the marker.
      * Slip displacement If finger leaves the marker measures distance before responder cuts out and changes are no
      * longer registered, if not given marker will be active until pressed released.
      */
    var touchDimensions: js.UndefOr[BorderRadius] = js.native
    
    /**
      * Customise the track
      *
      * Default { borderRadius: 7, height: 3.5 }
      */
    var trackStyle: js.UndefOr[ViewStyle] = js.native
    
    /**
      * Style for remaining track
      *
      * Default { backgroundColor: 'grey' }
      */
    var unselectedStyle: js.UndefOr[ViewStyle] = js.native
    
    /**
      * An array containing one or two values (determines one or two markers respectively) that are the initial marker values.
      * Note these must be possible values from your set up.
      *
      * Default [0]
      */
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
      def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setCustomMarker(value: ComponentType[MarkerProps]): Self = StObject.set(x, "customMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMarkerUndefined: Self = StObject.set(x, "customMarker", js.undefined)
      
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
      def setOnValuesChange(value: /* change */ js.Array[Double] => Unit): Self = StObject.set(x, "onValuesChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValuesChangeFinish(value: /* change */ js.Array[Double] => Unit): Self = StObject.set(x, "onValuesChangeFinish", js.Any.fromFunction1(value))
      
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
      def setSliderOrientation(value: horizontal | vertical): Self = StObject.set(x, "sliderOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderOrientationUndefined: Self = StObject.set(x, "sliderOrientation", js.undefined)
      
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
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
