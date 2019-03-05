package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[
    atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.default
  ] = js.undefined
  var imageOrientation: js.UndefOr[
    atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.flipY
  ] = js.undefined
  var premultiplyAlpha: js.UndefOr[
    atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.premultiply | atSindresorhusIsLib.atSindresorhusIsLibStrings.default
  ] = js.undefined
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  var resizeQuality: js.UndefOr[
    atSindresorhusIsLib.atSindresorhusIsLibStrings.pixelated | atSindresorhusIsLib.atSindresorhusIsLibStrings.low | atSindresorhusIsLib.atSindresorhusIsLibStrings.medium | atSindresorhusIsLib.atSindresorhusIsLibStrings.high
  ] = js.undefined
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(
    colorSpaceConversion: atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.default = null,
    imageOrientation: atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.flipY = null,
    premultiplyAlpha: atSindresorhusIsLib.atSindresorhusIsLibStrings.none | atSindresorhusIsLib.atSindresorhusIsLibStrings.premultiply | atSindresorhusIsLib.atSindresorhusIsLibStrings.default = null,
    resizeHeight: scala.Int | scala.Double = null,
    resizeQuality: atSindresorhusIsLib.atSindresorhusIsLibStrings.pixelated | atSindresorhusIsLib.atSindresorhusIsLibStrings.low | atSindresorhusIsLib.atSindresorhusIsLibStrings.medium | atSindresorhusIsLib.atSindresorhusIsLibStrings.high = null,
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

