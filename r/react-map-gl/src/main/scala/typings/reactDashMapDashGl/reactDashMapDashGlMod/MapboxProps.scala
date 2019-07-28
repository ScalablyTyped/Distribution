package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-map-gl.react-map-gl.ViewState ]:? react-map-gl.react-map-gl.ViewState[P]} */ trait MapboxProps extends js.Object {
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[js.Object] = js.undefined
  var gl: js.UndefOr[js.Object] = js.undefined
  var height: Double | String
  var mapOptions: js.UndefOr[js.Object] = js.undefined
  var mapStyle: js.UndefOr[String | js.Object] = js.undefined
  var mapboxApiAccessToken: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ MapError, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ MapLoadEvent, Unit]] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var reuseMap: js.UndefOr[Boolean] = js.undefined
  var reuseMaps: js.UndefOr[Boolean] = js.undefined
  var transformRequest: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String], MapRequest]
  ] = js.undefined
  var viewState: js.UndefOr[ViewState] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: Double | String
}

object MapboxProps {
  @scala.inline
  def apply(
    height: Double | String,
    width: Double | String,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    container: js.Object = null,
    gl: js.Object = null,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    onError: /* e */ MapError => Unit = null,
    onLoad: /* event */ MapLoadEvent => Unit = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest = null,
    viewState: ViewState = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MapboxProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl)
    if (container != null) __obj.updateDynamic("container")(container)
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap)
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps)
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (viewState != null) __obj.updateDynamic("viewState")(viewState)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MapboxProps]
  }
}

