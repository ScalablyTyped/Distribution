package typings
package reactDashLoaderLib.reactDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderProps extends LoaderOptions {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var loaded: scala.Boolean
  var options: js.UndefOr[LoaderOptions] = js.undefined
}

object LoaderProps {
  @scala.inline
  def apply(
    loaded: scala.Boolean,
    className: java.lang.String = null,
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
    options: LoaderOptions = null,
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
  ): LoaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loaded")(loaded)
    if (className != null) __obj.updateDynamic("className")(className)
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
    if (options != null) __obj.updateDynamic("options")(options)
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
    __obj.asInstanceOf[LoaderProps]
  }
}

