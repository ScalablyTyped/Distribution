package typings
package reactDashNativeDashMultiDashSliderLib.reactDashNativeDashMultiDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSliderProps extends js.Object {
  /**
    * Style of sliders container, note be careful in applying styles that may affect the children's (i.e. the slider's) positioning
    *
    * Default { height: 30 }
    */
  var containerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var customMarker: js.UndefOr[reactLib.reactMod.ComponentType[MarkerProps]] = js.undefined
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
  var markerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * Slider max value corresponding to far right
    *
    * Default 10
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Slider min value corresponding to far left
    *
    * Default 0
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function called after every change in value, with current values passed in as an array.
    */
  var onValuesChange: js.UndefOr[js.Function1[/* change */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * Function called on end of press with final values passed in as an array
    */
  var onValuesChangeFinish: js.UndefOr[js.Function1[/* change */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /**
    * Function to be called at beginning of press
    */
  var onValuesChangeStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Array of values corresponding to the slider's position (left to right on slider index 0 to end respectively).
    * Values of any type can be inserted and the slider will simply give them back in the callbacks
    */
  var optionsArray: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Style to be given to marker when pressed
    *
    * Default { backgroundColor:'#D3D3D3' }
    */
  var pressedMarkerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * Style for the track up to a single marker or between double markers
    *
    * Default { backgroundColor: 'blue' }
    */
  var selectedStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * Width of track
    *
    * Default 280
    */
  var sliderLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * TODO
    */
  var sliderOrientation: js.UndefOr[
    reactDashNativeDashMultiDashSliderLib.reactDashNativeDashMultiDashSliderLibStrings.horizontal | reactDashNativeDashMultiDashSliderLib.reactDashNativeDashMultiDashSliderLibStrings.vertical
  ] = js.undefined
  /**
    * The step size between values. Make sure min max range is divisible by this to get expected results
    *
    * Default 1
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * Area to be touched, should enclose the whole marker.
    * Will be automatically centered and contain the marker.
    * Slip displacement If finger leaves the marker measures distance before responder cuts out and changes are no
    * longer registered, if not given marker will be active until pressed released.
    */
  var touchDimensions: js.UndefOr[reactDashNativeDashMultiDashSliderLib.Anon_BorderRadius] = js.undefined
  /**
    * Customise the track
    *
    * Default { borderRadius: 7, height: 3.5 }
    */
  var trackStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * Style for remaining track
    *
    * Default { backgroundColor: 'grey' }
    */
  var unselectedStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * An array containing one or two values (determines one or two markers respectively) that are the initial marker values.
    * Note these must be possible values from your set up.
    *
    * Default [0]
    */
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object MultiSliderProps {
  @scala.inline
  def apply(
    containerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    customMarker: reactLib.reactMod.ComponentType[MarkerProps] = null,
    markerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onValuesChange: /* change */ js.Array[scala.Double] => scala.Unit = null,
    onValuesChangeFinish: /* change */ js.Array[scala.Double] => scala.Unit = null,
    onValuesChangeStart: () => scala.Unit = null,
    optionsArray: js.Array[scala.Double] = null,
    pressedMarkerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    selectedStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    sliderLength: scala.Int | scala.Double = null,
    sliderOrientation: reactDashNativeDashMultiDashSliderLib.reactDashNativeDashMultiDashSliderLibStrings.horizontal | reactDashNativeDashMultiDashSliderLib.reactDashNativeDashMultiDashSliderLibStrings.vertical = null,
    step: scala.Int | scala.Double = null,
    touchDimensions: reactDashNativeDashMultiDashSliderLib.Anon_BorderRadius = null,
    trackStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    unselectedStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    values: js.Array[scala.Double] = null
  ): MultiSliderProps = {
    val __obj = js.Dynamic.literal()
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1(onValuesChange))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1(onValuesChangeFinish))
    if (onValuesChangeStart != null) __obj.updateDynamic("onValuesChangeStart")(js.Any.fromFunction0(onValuesChangeStart))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray)
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle)
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle)
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (sliderOrientation != null) __obj.updateDynamic("sliderOrientation")(sliderOrientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle)
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[MultiSliderProps]
  }
}

