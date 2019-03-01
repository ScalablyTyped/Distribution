package typings
package reactDashLoaderLib.reactDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var corners: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[scala.Double] = js.undefined
  var fps: js.UndefOr[scala.Double] = js.undefined
  var hwaccel: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var lines: js.UndefOr[scala.Double] = js.undefined
  var loadedClassName: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[java.lang.String] = js.undefined
  var trail: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    corners: scala.Int | scala.Double = null,
    direction: scala.Int | scala.Double = null,
    fps: scala.Int | scala.Double = null,
    hwaccel: js.UndefOr[scala.Boolean] = js.undefined,
    left: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    lines: scala.Int | scala.Double = null,
    loadedClassName: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    rotate: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    top: java.lang.String = null,
    trail: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (!js.isUndefined(hwaccel)) __obj.updateDynamic("hwaccel")(hwaccel)
    if (left != null) __obj.updateDynamic("left")(left)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (loadedClassName != null) __obj.updateDynamic("loadedClassName")(loadedClassName)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top)
    if (trail != null) __obj.updateDynamic("trail")(trail.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
}

