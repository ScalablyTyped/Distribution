package typings.qiniuDashJs.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMogr2FopOptions extends ImageMogr2Options {
  var fop: typings.qiniuDashJs.qiniuDashJsStrings.imageMogr2
}

object ImageMogr2FopOptions {
  @scala.inline
  def apply(
    `auto-orient`: Boolean,
    blur: String,
    crop: String,
    fop: typings.qiniuDashJs.qiniuDashJsStrings.imageMogr2,
    format: String,
    gravity: String,
    quality: Double,
    rotate: Double,
    strip: Boolean,
    thumbnail: String
  ): ImageMogr2FopOptions = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-orient")(`auto-orient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMogr2FopOptions]
  }
}

