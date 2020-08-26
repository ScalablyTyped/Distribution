package typings.ptomasroosReactNativeMultiSlider.mod

import typings.ptomasroosReactNativeMultiSlider.anon.BorderRadius
import typings.react.mod.ComponentType
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSliderProps extends js.Object {
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
    def setAllowOverlap(value: Boolean): Self = this.set("allowOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOverlap: Self = this.set("allowOverlap", js.undefined)
    @scala.inline
    def setContainerStyle(value: ViewStyle): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setCustomMarker(value: ComponentType[MarkerProps]): Self = this.set("customMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMarker: Self = this.set("customMarker", js.undefined)
    @scala.inline
    def setCustomMarkerLeft(value: ComponentType[MarkerProps]): Self = this.set("customMarkerLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMarkerLeft: Self = this.set("customMarkerLeft", js.undefined)
    @scala.inline
    def setCustomMarkerRight(value: ComponentType[MarkerProps]): Self = this.set("customMarkerRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMarkerRight: Self = this.set("customMarkerRight", js.undefined)
    @scala.inline
    def setEnabledOne(value: Boolean): Self = this.set("enabledOne", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledOne: Self = this.set("enabledOne", js.undefined)
    @scala.inline
    def setEnabledTwo(value: Boolean): Self = this.set("enabledTwo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledTwo: Self = this.set("enabledTwo", js.undefined)
    @scala.inline
    def setIsMarkersSeparated(value: Boolean): Self = this.set("isMarkersSeparated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMarkersSeparated: Self = this.set("isMarkersSeparated", js.undefined)
    @scala.inline
    def setMarkerContainerStyle(value: ViewStyle): Self = this.set("markerContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerContainerStyle: Self = this.set("markerContainerStyle", js.undefined)
    @scala.inline
    def setMarkerOffsetX(value: Double): Self = this.set("markerOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOffsetX: Self = this.set("markerOffsetX", js.undefined)
    @scala.inline
    def setMarkerOffsetY(value: Double): Self = this.set("markerOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOffsetY: Self = this.set("markerOffsetY", js.undefined)
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
    def setOnToggleOne(value: () => Unit): Self = this.set("onToggleOne", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnToggleOne: Self = this.set("onToggleOne", js.undefined)
    @scala.inline
    def setOnToggleTwo(value: () => Unit): Self = this.set("onToggleTwo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnToggleTwo: Self = this.set("onToggleTwo", js.undefined)
    @scala.inline
    def setOnValuesChange(value: /* values */ js.Array[Double] => Unit): Self = this.set("onValuesChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValuesChange: Self = this.set("onValuesChange", js.undefined)
    @scala.inline
    def setOnValuesChangeFinish(value: /* values */ js.Array[Double] => Unit): Self = this.set("onValuesChangeFinish", js.Any.fromFunction1(value))
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
    def setSnapped(value: Boolean): Self = this.set("snapped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapped: Self = this.set("snapped", js.undefined)
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
    def setValuePrefix(value: String): Self = this.set("valuePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePrefix: Self = this.set("valuePrefix", js.undefined)
    @scala.inline
    def setValueSuffix(value: String): Self = this.set("valueSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSuffix: Self = this.set("valueSuffix", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

