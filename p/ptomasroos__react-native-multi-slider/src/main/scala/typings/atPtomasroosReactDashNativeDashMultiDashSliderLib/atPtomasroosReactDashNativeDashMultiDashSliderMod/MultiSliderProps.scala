package typings
package atPtomasroosReactDashNativeDashMultiDashSliderLib.atPtomasroosReactDashNativeDashMultiDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSliderProps extends js.Object {
  var allowOverlap: js.UndefOr[scala.Boolean] = js.undefined
  var containerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var customMarker: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[MarkerProps]] = js.undefined
  var customMarkerLeft: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[MarkerProps]] = js.undefined
  var customMarkerRight: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[MarkerProps]] = js.undefined
  var enabledOne: js.UndefOr[scala.Boolean] = js.undefined
  var enabledTwo: js.UndefOr[scala.Boolean] = js.undefined
  var isMarkersSeparated: js.UndefOr[scala.Boolean] = js.undefined
  var markerContainerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var markerOffsetX: js.UndefOr[scala.Double] = js.undefined
  var markerOffsetY: js.UndefOr[scala.Double] = js.undefined
  var markerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onToggleOne: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onToggleTwo: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onValuesChange: js.UndefOr[js.Function1[/* values */ js.Array[scala.Double], scala.Unit]] = js.undefined
  var onValuesChangeFinish: js.UndefOr[js.Function1[/* values */ js.Array[scala.Double], scala.Unit]] = js.undefined
  var onValuesChangeStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var optionsArray: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var pressedMarkerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var selectedStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var sliderLength: js.UndefOr[scala.Double] = js.undefined
  var snapped: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var touchDimensions: js.UndefOr[atPtomasroosReactDashNativeDashMultiDashSliderLib.Anon_BorderRadius] = js.undefined
  var trackStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var unselectedStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var valuePrefix: js.UndefOr[java.lang.String] = js.undefined
  var valueSuffix: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object MultiSliderProps {
  @scala.inline
  def apply(
    allowOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    containerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    customMarker: reactLib.reactMod.ReactNs.ComponentType[MarkerProps] = null,
    customMarkerLeft: reactLib.reactMod.ReactNs.ComponentType[MarkerProps] = null,
    customMarkerRight: reactLib.reactMod.ReactNs.ComponentType[MarkerProps] = null,
    enabledOne: js.UndefOr[scala.Boolean] = js.undefined,
    enabledTwo: js.UndefOr[scala.Boolean] = js.undefined,
    isMarkersSeparated: js.UndefOr[scala.Boolean] = js.undefined,
    markerContainerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    markerOffsetX: scala.Int | scala.Double = null,
    markerOffsetY: scala.Int | scala.Double = null,
    markerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onToggleOne: () => scala.Unit = null,
    onToggleTwo: () => scala.Unit = null,
    onValuesChange: /* values */ js.Array[scala.Double] => scala.Unit = null,
    onValuesChangeFinish: /* values */ js.Array[scala.Double] => scala.Unit = null,
    onValuesChangeStart: () => scala.Unit = null,
    optionsArray: js.Array[scala.Double] = null,
    pressedMarkerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    selectedStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    sliderLength: scala.Int | scala.Double = null,
    snapped: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    touchDimensions: atPtomasroosReactDashNativeDashMultiDashSliderLib.Anon_BorderRadius = null,
    trackStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    unselectedStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    valuePrefix: java.lang.String = null,
    valueSuffix: java.lang.String = null,
    values: js.Array[scala.Double] = null
  ): MultiSliderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (customMarkerLeft != null) __obj.updateDynamic("customMarkerLeft")(customMarkerLeft.asInstanceOf[js.Any])
    if (customMarkerRight != null) __obj.updateDynamic("customMarkerRight")(customMarkerRight.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledOne)) __obj.updateDynamic("enabledOne")(enabledOne)
    if (!js.isUndefined(enabledTwo)) __obj.updateDynamic("enabledTwo")(enabledTwo)
    if (!js.isUndefined(isMarkersSeparated)) __obj.updateDynamic("isMarkersSeparated")(isMarkersSeparated)
    if (markerContainerStyle != null) __obj.updateDynamic("markerContainerStyle")(markerContainerStyle)
    if (markerOffsetX != null) __obj.updateDynamic("markerOffsetX")(markerOffsetX.asInstanceOf[js.Any])
    if (markerOffsetY != null) __obj.updateDynamic("markerOffsetY")(markerOffsetY.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onToggleOne != null) __obj.updateDynamic("onToggleOne")(js.Any.fromFunction0(onToggleOne))
    if (onToggleTwo != null) __obj.updateDynamic("onToggleTwo")(js.Any.fromFunction0(onToggleTwo))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1(onValuesChange))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1(onValuesChangeFinish))
    if (onValuesChangeStart != null) __obj.updateDynamic("onValuesChangeStart")(js.Any.fromFunction0(onValuesChangeStart))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray)
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle)
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle)
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (!js.isUndefined(snapped)) __obj.updateDynamic("snapped")(snapped)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle)
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle)
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix)
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[MultiSliderProps]
  }
}

