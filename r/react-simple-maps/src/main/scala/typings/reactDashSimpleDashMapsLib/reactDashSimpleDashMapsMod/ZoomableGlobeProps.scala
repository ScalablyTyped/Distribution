package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomableGlobeProps extends js.Object {
  var center: js.UndefOr[Point] = js.undefined
  var disablePanning: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onMoveEnd: js.UndefOr[js.Function1[/* newCenter */ Point, scala.Unit]] = js.undefined
  var onMoveStart: js.UndefOr[js.Function1[/* currentCenter */ Point, scala.Unit]] = js.undefined
  var sensitivity: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object ZoomableGlobeProps {
  @scala.inline
  def apply(
    center: Point = null,
    disablePanning: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    onMoveEnd: js.Function1[/* newCenter */ Point, scala.Unit] = null,
    onMoveStart: js.Function1[/* currentCenter */ Point, scala.Unit] = null,
    sensitivity: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    width: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): ZoomableGlobeProps = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(onMoveEnd)
    if (onMoveStart != null) __obj.updateDynamic("onMoveStart")(onMoveStart)
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomableGlobeProps]
  }
}

