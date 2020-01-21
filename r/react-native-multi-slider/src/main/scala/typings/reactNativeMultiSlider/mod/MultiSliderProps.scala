package typings.reactNativeMultiSlider.mod

import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMultiSlider.AnonBorderRadius
import typings.reactNativeMultiSlider.reactNativeMultiSliderStrings.horizontal
import typings.reactNativeMultiSlider.reactNativeMultiSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSliderProps extends js.Object {
  /**
    * Style of sliders container, note be careful in applying styles that may affect the children's (i.e. the slider's) positioning
    *
    * Default { height: 30 }
    */
  var containerStyle: js.UndefOr[ViewStyle] = js.undefined
  var customMarker: js.UndefOr[ComponentType[MarkerProps]] = js.undefined
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
  var markerStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Slider max value corresponding to far right
    *
    * Default 10
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Slider min value corresponding to far left
    *
    * Default 0
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Function called after every change in value, with current values passed in as an array.
    */
  var onValuesChange: js.UndefOr[js.Function1[/* change */ js.Array[Double], Unit]] = js.undefined
  /**
    * Function called on end of press with final values passed in as an array
    */
  var onValuesChangeFinish: js.UndefOr[js.Function1[/* change */ js.Array[Double], Unit]] = js.undefined
  /**
    * Function to be called at beginning of press
    */
  var onValuesChangeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Array of values corresponding to the slider's position (left to right on slider index 0 to end respectively).
    * Values of any type can be inserted and the slider will simply give them back in the callbacks
    */
  var optionsArray: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Style to be given to marker when pressed
    *
    * Default { backgroundColor:'#D3D3D3' }
    */
  var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Style for the track up to a single marker or between double markers
    *
    * Default { backgroundColor: 'blue' }
    */
  var selectedStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Width of track
    *
    * Default 280
    */
  var sliderLength: js.UndefOr[Double] = js.undefined
  /**
    * TODO
    */
  var sliderOrientation: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * The step size between values. Make sure min max range is divisible by this to get expected results
    *
    * Default 1
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Area to be touched, should enclose the whole marker.
    * Will be automatically centered and contain the marker.
    * Slip displacement If finger leaves the marker measures distance before responder cuts out and changes are no
    * longer registered, if not given marker will be active until pressed released.
    */
  var touchDimensions: js.UndefOr[AnonBorderRadius] = js.undefined
  /**
    * Customise the track
    *
    * Default { borderRadius: 7, height: 3.5 }
    */
  var trackStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Style for remaining track
    *
    * Default { backgroundColor: 'grey' }
    */
  var unselectedStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * An array containing one or two values (determines one or two markers respectively) that are the initial marker values.
    * Note these must be possible values from your set up.
    *
    * Default [0]
    */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object MultiSliderProps {
  @scala.inline
  def apply(
    containerStyle: ViewStyle = null,
    customMarker: ComponentType[MarkerProps] = null,
    markerStyle: ViewStyle = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onValuesChange: /* change */ js.Array[Double] => Unit = null,
    onValuesChangeFinish: /* change */ js.Array[Double] => Unit = null,
    onValuesChangeStart: () => Unit = null,
    optionsArray: js.Array[Double] = null,
    pressedMarkerStyle: ViewStyle = null,
    selectedStyle: ViewStyle = null,
    sliderLength: Int | Double = null,
    sliderOrientation: horizontal | vertical = null,
    step: Int | Double = null,
    touchDimensions: AnonBorderRadius = null,
    trackStyle: ViewStyle = null,
    unselectedStyle: ViewStyle = null,
    values: js.Array[Double] = null
  ): MultiSliderProps = {
    val __obj = js.Dynamic.literal()
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1(onValuesChange))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1(onValuesChangeFinish))
    if (onValuesChangeStart != null) __obj.updateDynamic("onValuesChangeStart")(js.Any.fromFunction0(onValuesChangeStart))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (sliderOrientation != null) __obj.updateDynamic("sliderOrientation")(sliderOrientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSliderProps]
  }
}

