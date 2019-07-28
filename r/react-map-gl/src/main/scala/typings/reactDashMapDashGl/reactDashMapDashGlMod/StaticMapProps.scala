package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.reactDashMapDashGl.Anon_Height
import typings.reactDashMapDashGl.Anon_MaxPitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticMapProps extends MapboxProps {
  var className: js.UndefOr[String] = js.undefined
  var disableTokenWarning: js.UndefOr[Boolean] = js.undefined
  var onResize: js.UndefOr[js.Function1[/* dimensions */ Anon_Height, Unit]] = js.undefined
  var preventStyleDiffing: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visibilityConstraints: js.UndefOr[Anon_MaxPitch] = js.undefined
}

object StaticMapProps {
  @scala.inline
  def apply(
    height: Double | String,
    width: Double | String,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    container: js.Object = null,
    disableTokenWarning: js.UndefOr[Boolean] = js.undefined,
    gl: js.Object = null,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    onError: /* e */ MapError => Unit = null,
    onLoad: /* event */ MapLoadEvent => Unit = null,
    onResize: /* dimensions */ Anon_Height => Unit = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    preventStyleDiffing: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest = null,
    viewState: ViewState = null,
    visibilityConstraints: Anon_MaxPitch = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StaticMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl)
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(disableTokenWarning)) __obj.updateDynamic("disableTokenWarning")(disableTokenWarning)
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(preventStyleDiffing)) __obj.updateDynamic("preventStyleDiffing")(preventStyleDiffing)
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap)
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (viewState != null) __obj.updateDynamic("viewState")(viewState)
    if (visibilityConstraints != null) __obj.updateDynamic("visibilityConstraints")(visibilityConstraints)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StaticMapProps]
  }
}

