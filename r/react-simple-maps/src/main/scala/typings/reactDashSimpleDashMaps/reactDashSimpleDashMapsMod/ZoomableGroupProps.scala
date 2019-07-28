package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.CSSProperties
import typings.reactDashSimpleDashMaps.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomableGroupProps extends js.Object {
  var backdrop: js.UndefOr[Anon_X] = js.undefined
  var center: js.UndefOr[Point] = js.undefined
  var disablePanning: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var onMoveEnd: js.UndefOr[js.Function1[/* newCenter */ Point, Unit]] = js.undefined
  var onMoveStart: js.UndefOr[js.Function1[/* currentCenter */ Point, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object ZoomableGroupProps {
  @scala.inline
  def apply(
    backdrop: Anon_X = null,
    center: Point = null,
    disablePanning: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onMoveEnd: /* newCenter */ Point => Unit = null,
    onMoveStart: /* currentCenter */ Point => Unit = null,
    style: CSSProperties = null,
    width: Int | Double = null,
    zoom: Int | Double = null
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

