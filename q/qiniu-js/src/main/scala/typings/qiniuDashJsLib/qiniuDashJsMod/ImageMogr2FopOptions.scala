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
    val __obj = js.Dynamic.literal(`auto-orient` = `auto-orient`)
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("crop")(crop)
    __obj.updateDynamic("fop")(fop)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("gravity")(gravity)
    __obj.updateDynamic("quality")(quality)
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("strip")(strip)
    __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ImageMogr2FopOptions]
  }
}

