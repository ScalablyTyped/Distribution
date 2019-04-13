package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomableGroupProps extends js.Object {
  var backdrop: js.UndefOr[reactDashSimpleDashMapsLib.Anon_X] = js.undefined
  var center: js.UndefOr[Point] = js.undefined
  var disablePanning: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onMoveEnd: js.UndefOr[js.Function1[/* newCenter */ Point, scala.Unit]] = js.undefined
  var onMoveStart: js.UndefOr[js.Function1[/* currentCenter */ Point, scala.Unit]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object ZoomableGroupProps {
  @scala.inline
  def apply(
    backdrop: reactDashSimpleDashMapsLib.Anon_X = null,
    center: Point = null,
    disablePanning: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    onMoveEnd: /* newCenter */ Point => scala.Unit = null,
    onMoveStart: /* currentCenter */ Point => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null,
    width: scala.Int | scala.Double = null,
    zoom: scala.Int | scala.Double = null
  ): ZoomableGroupProps = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop)
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction1(onMoveEnd))
    if (onMoveStart != null) __obj.updateDynamic("onMoveStart")(js.Any.fromFunction1(onMoveStart))
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomableGroupProps]
  }
}

