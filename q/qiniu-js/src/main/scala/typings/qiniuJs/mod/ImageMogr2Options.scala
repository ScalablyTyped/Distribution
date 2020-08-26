package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMogr2Options extends js.Object {
  var `auto-orient`: Boolean = js.native
                  // 新图的输出格式，取值范围：jpg，gif，png，webp等
  var blur: String = js.native
              // 缩放操作参数
  var crop: String = js.native
              // 旋转角度，取值范围1-360，缺省为不旋转。
  var format: String = js.native
                  // 裁剪操作参数
  var gravity: String = js.native
              // 裁剪锚点参数
  var quality: Double = js.native
              // 图片质量，取值范围1-100
  var rotate: Double = js.native
          // 布尔值，是否根据原图EXIF信息自动旋正，便于后续处理，建议放在首位。
  var strip: Boolean = js.native
                  // 布尔值，是否去除图片中的元信息
  var thumbnail: String = js.native
}

object ImageMogr2Options {
  @scala.inline
  def apply(
    `auto-orient`: Boolean,
    blur: String,
    crop: String,
    format: String,
    gravity: String,
    quality: Double,
    rotate: Double,
    strip: Boolean,
    thumbnail: String
  ): ImageMogr2Options = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-orient")(`auto-orient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMogr2Options]
  }
  @scala.inline
  implicit class ImageMogr2OptionsOps[Self <: ImageMogr2Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAuto-orient`(value: Boolean): Self = this.set("auto-orient", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlur(value: String): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrop(value: String): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setGravity(value: String): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
  
}

