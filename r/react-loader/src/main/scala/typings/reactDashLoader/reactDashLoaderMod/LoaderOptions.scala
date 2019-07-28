package typings.reactDashLoader.reactDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var corners: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[Double] = js.undefined
  var fps: js.UndefOr[Double] = js.undefined
  var hwaccel: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  var loadedClassName: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var shadow: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var trail: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    color: String = null,
    corners: Int | Double = null,
    direction: Int | Double = null,
    fps: Int | Double = null,
    hwaccel: js.UndefOr[Boolean] = js.undefined,
    left: String = null,
    length: Int | Double = null,
    lines: Int | Double = null,
    loadedClassName: String = null,
    opacity: Int | Double = null,
    position: String = null,
    radius: Int | Double = null,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    top: String = null,
    trail: Int | Double = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
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

