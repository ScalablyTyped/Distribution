package typings.reactLoader.mod

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
    corners: js.UndefOr[Double] = js.undefined,
    direction: js.UndefOr[Double] = js.undefined,
    fps: js.UndefOr[Double] = js.undefined,
    hwaccel: js.UndefOr[Boolean] = js.undefined,
    left: String = null,
    length: js.UndefOr[Double] = js.undefined,
    lines: js.UndefOr[Double] = js.undefined,
    loadedClassName: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    position: String = null,
    radius: js.UndefOr[Double] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    top: String = null,
    trail: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners.get.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fps)) __obj.updateDynamic("fps")(fps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hwaccel)) __obj.updateDynamic("hwaccel")(hwaccel.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    if (loadedClassName != null) __obj.updateDynamic("loadedClassName")(loadedClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(trail)) __obj.updateDynamic("trail")(trail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
}

