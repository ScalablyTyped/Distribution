package typings.reactMapGl.mod

import typings.mapboxGl.mod.FitBoundsOptions
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocateControlProps extends BaseControlProps {
  var className: js.UndefOr[String] = js.undefined
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onGeolocate: js.UndefOr[js.Function1[/* options */ PositionOptions, Unit]] = js.undefined
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.undefined
  var positionOptions: js.UndefOr[typings.mapboxGl.mod.PositionOptions] = js.undefined
  var showUserLocation: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var trackUserLocation: js.UndefOr[Boolean] = js.undefined
}

object GeolocateControlProps {
  @scala.inline
  def apply(
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    fitBoundsOptions: FitBoundsOptions = null,
    label: String = null,
    onGeolocate: /* options */ PositionOptions => Unit = null,
    onViewStateChange: /* info */ ViewStateChangeInfo => Unit = null,
    onViewportChange: /* viewState */ ViewportProps => Unit = null,
    positionOptions: typings.mapboxGl.mod.PositionOptions = null,
    showUserLocation: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    trackUserLocation: js.UndefOr[Boolean] = js.undefined
  ): GeolocateControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (fitBoundsOptions != null) __obj.updateDynamic("fitBoundsOptions")(fitBoundsOptions.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onGeolocate != null) __obj.updateDynamic("onGeolocate")(js.Any.fromFunction1(onGeolocate))
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1(onViewStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction1(onViewportChange))
    if (positionOptions != null) __obj.updateDynamic("positionOptions")(positionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showUserLocation)) __obj.updateDynamic("showUserLocation")(showUserLocation.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(trackUserLocation)) __obj.updateDynamic("trackUserLocation")(trackUserLocation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocateControlProps]
  }
}

