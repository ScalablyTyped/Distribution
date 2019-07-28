package typings.std

import typings.std.stdStrings.default
import typings.std.stdStrings.flipY
import typings.std.stdStrings.high
import typings.std.stdStrings.low
import typings.std.stdStrings.medium
import typings.std.stdStrings.none
import typings.std.stdStrings.pixelated
import typings.std.stdStrings.premultiply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[none | default] = js.undefined
  var imageOrientation: js.UndefOr[none | flipY] = js.undefined
  var premultiplyAlpha: js.UndefOr[none | premultiply | default] = js.undefined
  var resizeHeight: js.UndefOr[Double] = js.undefined
  var resizeQuality: js.UndefOr[pixelated | low | medium | high] = js.undefined
  var resizeWidth: js.UndefOr[Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(
    colorSpaceConversion: none | default = null,
    imageOrientation: none | flipY = null,
    premultiplyAlpha: none | premultiply | default = null,
    resizeHeight: Int | Double = null,
    resizeQuality: pixelated | low | medium | high = null,
    resizeWidth: Int | Double = null
  ): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (colorSpaceConversion != null) __obj.updateDynamic("colorSpaceConversion")(colorSpaceConversion.asInstanceOf[js.Any])
    if (imageOrientation != null) __obj.updateDynamic("imageOrientation")(imageOrientation.asInstanceOf[js.Any])
    if (premultiplyAlpha != null) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.asInstanceOf[js.Any])
    if (resizeHeight != null) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (resizeWidth != null) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapOptions]
  }
}

