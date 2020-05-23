package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-map-gl.react-map-gl.ViewState> */
trait MapboxProps extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var bearing: js.UndefOr[Double] = js.undefined
  var container: js.UndefOr[js.Object] = js.undefined
  var gl: js.UndefOr[js.Object] = js.undefined
  var height: Double | String
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var mapOptions: js.UndefOr[js.Object] = js.undefined
  var mapStyle: js.UndefOr[String | js.Object] = js.undefined
  var mapboxApiAccessToken: js.UndefOr[String] = js.undefined
  var mapboxApiUrl: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ MapError, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ MapLoadEvent, Unit]] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var reuseMap: js.UndefOr[Boolean] = js.undefined
  var reuseMaps: js.UndefOr[Boolean] = js.undefined
  var transformRequest: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String], MapRequest]
  ] = js.undefined
  var viewState: js.UndefOr[ViewState] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: Double | String
  var zoom: js.UndefOr[Double] = js.undefined
}

object MapboxProps {
  @scala.inline
  def apply(
    height: Double | String,
    width: Double | String,
    altitude: js.UndefOr[Double] = js.undefined,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bearing: js.UndefOr[Double] = js.undefined,
    container: js.Object = null,
    gl: js.Object = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    mapboxApiUrl: String = null,
    onError: /* e */ MapError => Unit = null,
    onLoad: /* event */ MapLoadEvent => Unit = null,
    pitch: js.UndefOr[Double] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest = null,
    viewState: ViewState = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): MapboxProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken.asInstanceOf[js.Any])
    if (mapboxApiUrl != null) __obj.updateDynamic("mapboxApiUrl")(mapboxApiUrl.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps.get.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (viewState != null) __obj.updateDynamic("viewState")(viewState.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxProps]
  }
}

