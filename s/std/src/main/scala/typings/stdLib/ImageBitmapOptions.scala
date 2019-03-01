package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[stdLib.stdLibStrings.none | stdLib.stdLibStrings.default] = js.undefined
  var imageOrientation: js.UndefOr[stdLib.stdLibStrings.none | stdLib.stdLibStrings.flipY] = js.undefined
  var premultiplyAlpha: js.UndefOr[
    stdLib.stdLibStrings.none | stdLib.stdLibStrings.premultiply | stdLib.stdLibStrings.default
  ] = js.undefined
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  var resizeQuality: js.UndefOr[
    stdLib.stdLibStrings.pixelated | stdLib.stdLibStrings.low | stdLib.stdLibStrings.medium | stdLib.stdLibStrings.high
  ] = js.undefined
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(
    colorSpaceConversion: stdLib.stdLibStrings.none | stdLib.stdLibStrings.default = null,
    imageOrientation: stdLib.stdLibStrings.none | stdLib.stdLibStrings.flipY = null,
    premultiplyAlpha: stdLib.stdLibStrings.none | stdLib.stdLibStrings.premultiply | stdLib.stdLibStrings.default = null,
    resizeHeight: scala.Int | scala.Double = null,
    resizeQuality: stdLib.stdLibStrings.pixelated | stdLib.stdLibStrings.low | stdLib.stdLibStrings.medium | stdLib.stdLibStrings.high = null,
    resizeWidth: scala.Int | scala.Double = null
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

