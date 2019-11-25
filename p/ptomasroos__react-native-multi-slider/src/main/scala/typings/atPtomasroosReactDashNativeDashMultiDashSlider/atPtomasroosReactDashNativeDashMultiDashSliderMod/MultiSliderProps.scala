package typings.atPtomasroosReactDashNativeDashMultiDashSlider.atPtomasroosReactDashNativeDashMultiDashSliderMod

import typings.atPtomasroosReactDashNativeDashMultiDashSlider.Anon_BorderRadius
import typings.react.reactMod.ComponentType
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSliderProps extends js.Object {
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
  var touchDimensions: js.UndefOr[Anon_BorderRadius] = js.undefined
  var trackStyle: js.UndefOr[ViewStyle] = js.undefined
  var unselectedStyle: js.UndefOr[ViewStyle] = js.undefined
  var valuePrefix: js.UndefOr[String] = js.undefined
  var valueSuffix: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object MultiSliderProps {
  @scala.inline
  def apply(
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    containerStyle: ViewStyle = null,
    customMarker: ComponentType[MarkerProps] = null,
    customMarkerLeft: ComponentType[MarkerProps] = null,
    customMarkerRight: ComponentType[MarkerProps] = null,
    enabledOne: js.UndefOr[Boolean] = js.undefined,
    enabledTwo: js.UndefOr[Boolean] = js.undefined,
    isMarkersSeparated: js.UndefOr[Boolean] = js.undefined,
    markerContainerStyle: ViewStyle = null,
    markerOffsetX: Int | Double = null,
    markerOffsetY: Int | Double = null,
    markerStyle: ViewStyle = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onToggleOne: () => Unit = null,
    onToggleTwo: () => Unit = null,
    onValuesChange: /* values */ js.Array[Double] => Unit = null,
    onValuesChangeFinish: /* values */ js.Array[Double] => Unit = null,
    onValuesChangeStart: () => Unit = null,
    optionsArray: js.Array[Double] = null,
    pressedMarkerStyle: ViewStyle = null,
    selectedStyle: ViewStyle = null,
    sliderLength: Int | Double = null,
    snapped: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    touchDimensions: Anon_BorderRadius = null,
    trackStyle: ViewStyle = null,
    unselectedStyle: ViewStyle = null,
    valuePrefix: String = null,
    valueSuffix: String = null,
    values: js.Array[Double] = null
  ): MultiSliderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (customMarkerLeft != null) __obj.updateDynamic("customMarkerLeft")(customMarkerLeft.asInstanceOf[js.Any])
    if (customMarkerRight != null) __obj.updateDynamic("customMarkerRight")(customMarkerRight.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledOne)) __obj.updateDynamic("enabledOne")(enabledOne.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledTwo)) __obj.updateDynamic("enabledTwo")(enabledTwo.asInstanceOf[js.Any])
    if (!js.isUndefined(isMarkersSeparated)) __obj.updateDynamic("isMarkersSeparated")(isMarkersSeparated.asInstanceOf[js.Any])
    if (markerContainerStyle != null) __obj.updateDynamic("markerContainerStyle")(markerContainerStyle.asInstanceOf[js.Any])
    if (markerOffsetX != null) __obj.updateDynamic("markerOffsetX")(markerOffsetX.asInstanceOf[js.Any])
    if (markerOffsetY != null) __obj.updateDynamic("markerOffsetY")(markerOffsetY.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onToggleOne != null) __obj.updateDynamic("onToggleOne")(js.Any.fromFunction0(onToggleOne))
    if (onToggleTwo != null) __obj.updateDynamic("onToggleTwo")(js.Any.fromFunction0(onToggleTwo))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1(onValuesChange))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1(onValuesChangeFinish))
    if (onValuesChangeStart != null) __obj.updateDynamic("onValuesChangeStart")(js.Any.fromFunction0(onValuesChangeStart))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (!js.isUndefined(snapped)) __obj.updateDynamic("snapped")(snapped.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle.asInstanceOf[js.Any])
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix.asInstanceOf[js.Any])
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSliderProps]
  }
}

