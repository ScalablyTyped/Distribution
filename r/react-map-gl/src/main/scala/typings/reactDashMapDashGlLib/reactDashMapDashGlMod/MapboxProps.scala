package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-map-gl.react-map-gl.ViewState ]:? react-map-gl.react-map-gl.ViewState[P]} */ trait MapboxProps extends js.Object {
  var attributionControl: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[js.Object] = js.undefined
  var gl: js.UndefOr[js.Object] = js.undefined
  var height: scala.Double | java.lang.String
  var mapOptions: js.UndefOr[js.Object] = js.undefined
  var mapStyle: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var mapboxApiAccessToken: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ MapError, scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var reuseMap: js.UndefOr[scala.Boolean] = js.undefined
  var reuseMaps: js.UndefOr[scala.Boolean] = js.undefined
  var transformRequest: js.UndefOr[
    js.Function2[
      /* url */ js.UndefOr[java.lang.String], 
      /* resourceType */ js.UndefOr[java.lang.String], 
      MapRequest
    ]
  ] = js.undefined
  var viewState: js.UndefOr[ViewState] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: scala.Double | java.lang.String
}

object MapboxProps {
  @scala.inline
  def apply(
    height: scala.Double | java.lang.String,
    width: scala.Double | java.lang.String,
    attributionControl: js.UndefOr[scala.Boolean] = js.undefined,
    container: js.Object = null,
    gl: js.Object = null,
    mapOptions: js.Object = null,
    mapStyle: java.lang.String | js.Object = null,
    mapboxApiAccessToken: java.lang.String = null,
    onError: js.Function1[/* e */ MapError, scala.Unit] = null,
    onLoad: js.Function0[scala.Unit] = null,
    preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    reuseMap: js.UndefOr[scala.Boolean] = js.undefined,
    reuseMaps: js.UndefOr[scala.Boolean] = js.undefined,
    transformRequest: js.Function2[
      /* url */ js.UndefOr[java.lang.String], 
      /* resourceType */ js.UndefOr[java.lang.String], 
      MapRequest
    ] = null,
    viewState: ViewState = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): MapboxProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl)
    if (container != null) __obj.updateDynamic("container")(container)
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap)
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps)
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest)
    if (viewState != null) __obj.updateDynamic("viewState")(viewState)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MapboxProps]
  }
}

