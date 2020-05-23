package typings.reactSimpleMaps.mod

import typings.react.mod.SVGAttributes
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomableGroupProps extends SVGAttributes[SVGGElement] {
  /**
    * @default [0, 0]
    */
  var center: js.UndefOr[Point] = js.undefined
  /**
    * @default false
    */
  var disablePanning: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var disableZooming: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 5
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /**
    * @default 1
    */
  var minZoom: js.UndefOr[Double] = js.undefined
  var onMoveEnd: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.undefined
  var onMoveStart: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.undefined
  var onZoomEnd: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.undefined
  var onZoomStart: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.undefined
  /**
    * @default 1
    */
  var zoom: js.UndefOr[Double] = js.undefined
  /**
    * @default 0.025
    */
  var zoomSensitivity: js.UndefOr[Double] = js.undefined
}

object ZoomableGroupProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[SVGGElement] = null,
    center: Point = null,
    disablePanning: js.UndefOr[Boolean] = js.undefined,
    disableZooming: js.UndefOr[Boolean] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    onMoveEnd: (/* event */ js.Any, /* position */ Position) => Unit = null,
    onMoveStart: (/* event */ js.Any, /* position */ Position) => Unit = null,
    onZoomEnd: (/* event */ js.Any, /* position */ Position) => Unit = null,
    onZoomStart: (/* event */ js.Any, /* position */ Position) => Unit = null,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomSensitivity: js.UndefOr[Double] = js.undefined
  ): ZoomableGroupProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableZooming)) __obj.updateDynamic("disableZooming")(disableZooming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction2(onMoveEnd))
    if (onMoveStart != null) __obj.updateDynamic("onMoveStart")(js.Any.fromFunction2(onMoveStart))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction2(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction2(onZoomStart))
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomSensitivity)) __obj.updateDynamic("zoomSensitivity")(zoomSensitivity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomableGroupProps]
  }
}

