package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMogr2FopOptions extends ImageMogr2Options {
  var fop: qiniuDashJsLib.qiniuDashJsLibStrings.imageMogr2
}

object ImageMogr2FopOptions {
  @scala.inline
  def apply(
    `auto-orient`: scala.Boolean,
    blur: java.lang.String,
    crop: java.lang.String,
    fop: qiniuDashJsLib.qiniuDashJsLibStrings.imageMogr2,
    format: java.lang.String,
    gravity: java.lang.String,
    quality: scala.Double,
    rotate: scala.Double,
    strip: scala.Boolean,
    thumbnail: java.lang.String
  ): ImageMogr2FopOptions = {
    val __obj = js.Dynamic.literal(blur = blur, crop = crop, fop = fop, format = format, gravity = gravity, quality = quality, rotate = rotate, strip = strip, thumbnail = thumbnail)
    __obj.updateDynamic("auto-orient")(`auto-orient`)
    __obj.asInstanceOf[ImageMogr2FopOptions]
  }
}

