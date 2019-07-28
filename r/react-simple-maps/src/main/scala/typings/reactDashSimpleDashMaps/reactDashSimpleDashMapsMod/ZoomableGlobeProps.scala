package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomableGlobeProps extends js.Object {
  var center: js.UndefOr[Point] = js.undefined
  var disablePanning: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var onMoveEnd: js.UndefOr[js.Function1[/* newCenter */ Point, Unit]] = js.undefined
  var onMoveStart: js.UndefOr[js.Function1[/* currentCenter */ Point, Unit]] = js.undefined
  var sensitivity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object ZoomableGlobeProps {
  @scala.inline
  def apply(
    center: Point = null,
    disablePanning: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onMoveEnd: /* newCenter */ Point => Unit = null,
    onMoveStart: /* currentCenter */ Point => Unit = null,
    sensitivity: Int | Double = null,
    style: CSSProperties = null,
    width: Int | Double = null,
    zoom: Int | Double = null
  ): ZoomableGlobeProps = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction1(onMoveEnd))
    if (onMoveStart != null) __obj.updateDynamic("onMoveStart")(js.Any.fromFunction1(onMoveStart))
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomableGlobeProps]
  }
}

