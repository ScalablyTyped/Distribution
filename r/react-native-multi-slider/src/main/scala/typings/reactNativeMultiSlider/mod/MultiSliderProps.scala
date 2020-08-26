package typings.reactNativeMultiSlider.mod

import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMultiSlider.anon.BorderRadius
import typings.reactNativeMultiSlider.reactNativeMultiSliderStrings.horizontal
import typings.reactNativeMultiSlider.reactNativeMultiSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSliderProps extends js.Object {
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
  implicit class MultiSliderPropsOps[Self <: MultiSliderProps] (val x: Self) extends AnyVal {
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
    def setContainerStyle(value: ViewStyle): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setCustomMarker(value: ComponentType[MarkerProps]): Self = this.set("customMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMarker: Self = this.set("customMarker", js.undefined)
    @scala.inline
    def setMarkerStyle(value: ViewStyle): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStyle: Self = this.set("markerStyle", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnValuesChange(value: /* change */ js.Array[Double] => Unit): Self = this.set("onValuesChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValuesChange: Self = this.set("onValuesChange", js.undefined)
    @scala.inline
    def setOnValuesChangeFinish(value: /* change */ js.Array[Double] => Unit): Self = this.set("onValuesChangeFinish", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValuesChangeFinish: Self = this.set("onValuesChangeFinish", js.undefined)
    @scala.inline
    def setOnValuesChangeStart(value: () => Unit): Self = this.set("onValuesChangeStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnValuesChangeStart: Self = this.set("onValuesChangeStart", js.undefined)
    @scala.inline
    def setOptionsArrayVarargs(value: Double*): Self = this.set("optionsArray", js.Array(value :_*))
    @scala.inline
    def setOptionsArray(value: js.Array[Double]): Self = this.set("optionsArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsArray: Self = this.set("optionsArray", js.undefined)
    @scala.inline
    def setPressedMarkerStyle(value: ViewStyle): Self = this.set("pressedMarkerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedMarkerStyle: Self = this.set("pressedMarkerStyle", js.undefined)
    @scala.inline
    def setSelectedStyle(value: ViewStyle): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    @scala.inline
    def setSliderLength(value: Double): Self = this.set("sliderLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderLength: Self = this.set("sliderLength", js.undefined)
    @scala.inline
    def setSliderOrientation(value: horizontal | vertical): Self = this.set("sliderOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderOrientation: Self = this.set("sliderOrientation", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTouchDimensions(value: BorderRadius): Self = this.set("touchDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchDimensions: Self = this.set("touchDimensions", js.undefined)
    @scala.inline
    def setTrackStyle(value: ViewStyle): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    @scala.inline
    def setUnselectedStyle(value: ViewStyle): Self = this.set("unselectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedStyle: Self = this.set("unselectedStyle", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

