package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined
  var imageOrientation: js.UndefOr[ImageOrientation] = js.undefined
  var premultiplyAlpha: js.UndefOr[PremultiplyAlpha] = js.undefined
  var resizeHeight: js.UndefOr[Double] = js.undefined
  var resizeQuality: js.UndefOr[ResizeQuality] = js.undefined
  var resizeWidth: js.UndefOr[Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(
    colorSpaceConversion: ColorSpaceConversion = null,
    imageOrientation: ImageOrientation = null,
    premultiplyAlpha: PremultiplyAlpha = null,
    resizeHeight: js.UndefOr[Double] = js.undefined,
    resizeQuality: ResizeQuality = null,
    resizeWidth: js.UndefOr[Double] = js.undefined
  ): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (colorSpaceConversion != null) __obj.updateDynamic("colorSpaceConversion")(colorSpaceConversion.asInstanceOf[js.Any])
    if (imageOrientation != null) __obj.updateDynamic("imageOrientation")(imageOrientation.asInstanceOf[js.Any])
    if (premultiplyAlpha != null) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeHeight)) __obj.updateDynamic("resizeHeight")(resizeHeight.get.asInstanceOf[js.Any])
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeWidth)) __obj.updateDynamic("resizeWidth")(resizeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapOptions]
  }
}

