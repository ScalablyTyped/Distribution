package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.mapboxDashGl.mapboxDashGlMod.FitBoundsOptions
import typings.mapboxDashGl.mapboxDashGlMod.PositionOptions
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocateControlProps extends BaseControlProps {
  var className: js.UndefOr[String] = js.undefined
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.undefined
  var positionOptions: js.UndefOr[PositionOptions] = js.undefined
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
    onViewStateChange: /* info */ ViewStateChangeInfo => Unit = null,
    onViewportChange: /* viewState */ ViewportProps => Unit = null,
    positionOptions: PositionOptions = null,
    showUserLocation: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    trackUserLocation: js.UndefOr[Boolean] = js.undefined
  ): GeolocateControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (fitBoundsOptions != null) __obj.updateDynamic("fitBoundsOptions")(fitBoundsOptions)
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1(onViewStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction1(onViewportChange))
    if (positionOptions != null) __obj.updateDynamic("positionOptions")(positionOptions)
    if (!js.isUndefined(showUserLocation)) __obj.updateDynamic("showUserLocation")(showUserLocation)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(trackUserLocation)) __obj.updateDynamic("trackUserLocation")(trackUserLocation)
    __obj.asInstanceOf[GeolocateControlProps]
  }
}

