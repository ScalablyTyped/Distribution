package typings.qiniuDashJs.qiniuDashJsMod

import typings.qiniuDashJs.qiniuDashJsStrings.imageMogr2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMogr2FopOptions extends ImageMogr2Options {
  var fop: imageMogr2
}

object ImageMogr2FopOptions {
  @scala.inline
  def apply(
    `auto-orient`: Boolean,
    blur: String,
    crop: String,
    fop: imageMogr2,
    format: String,
    gravity: String,
    quality: Double,
    rotate: Double,
    strip: Boolean,
    thumbnail: String
  ): ImageMogr2FopOptions = {
    val __obj = js.Dynamic.literal(blur = blur, crop = crop, fop = fop, format = format, gravity = gravity, quality = quality, rotate = rotate, strip = strip, thumbnail = thumbnail)
    __obj.updateDynamic("auto-orient")(`auto-orient`)
    __obj.asInstanceOf[ImageMogr2FopOptions]
  }
}

