package typings.reactLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderProps extends LoaderOptions {
  var className: js.UndefOr[String] = js.undefined
  var loaded: Boolean
  var options: js.UndefOr[LoaderOptions] = js.undefined
}

object LoaderProps {
  @scala.inline
  def apply(
    loaded: Boolean,
    className: String = null,
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
    options: LoaderOptions = null,
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
  ): LoaderProps = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
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
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[LoaderProps]
  }
}

