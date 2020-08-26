package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsStrings.bmp
import typings.qiniuJs.qiniuJsStrings.gif
import typings.qiniuJs.qiniuJsStrings.jpeg
import typings.qiniuJs.qiniuJsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInfo_ extends js.Object {
                              // 图片高度，单位：像素(px) 。
  var colorModel: String = js.native
                              // 文件大小，单位：Bytes
  var format: png | jpeg | gif | bmp = js.native
                          // 彩色空间，如palette16、ycbcr等。
  var frameNumber: Double = js.native
                              // 图片宽度，单位：像素(px) 。
  var height: Double = js.native
  var size: Double = js.native
      // 图片类型，如png、jpeg、gif、bmp等。
  var width: Double = js.native
}

object ImageInfo_ {
  @scala.inline
  def apply(
    colorModel: String,
    format: png | jpeg | gif | bmp,
    frameNumber: Double,
    height: Double,
    size: Double,
    width: Double
  ): ImageInfo_ = {
    val __obj = js.Dynamic.literal(colorModel = colorModel.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], frameNumber = frameNumber.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo_]
  }
  @scala.inline
  implicit class ImageInfo_Ops[Self <: ImageInfo_] (val x: Self) extends AnyVal {
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
    def setColorModel(value: String): Self = this.set("colorModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: png | jpeg | gif | bmp): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameNumber(value: Double): Self = this.set("frameNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

