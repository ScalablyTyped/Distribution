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
    corners: Int | Double = null,
    direction: Int | Double = null,
    fps: Int | Double = null,
    hwaccel: js.UndefOr[Boolean] = js.undefined,
    left: String = null,
    length: Int | Double = null,
    lines: Int | Double = null,
    loadedClassName: String = null,
    opacity: Int | Double = null,
    options: LoaderOptions = null,
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
  ): LoaderProps = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (corners != null) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (!js.isUndefined(hwaccel)) __obj.updateDynamic("hwaccel")(hwaccel.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (loadedClassName != null) __obj.updateDynamic("loadedClassName")(loadedClassName.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (trail != null) __obj.updateDynamic("trail")(trail.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
}

