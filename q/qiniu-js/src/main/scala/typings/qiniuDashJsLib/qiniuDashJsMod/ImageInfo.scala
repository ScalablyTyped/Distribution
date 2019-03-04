package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  							// 图片高度，单位：像素(px) 。
  var colorModel: java.lang.String
  							// 文件大小，单位：Bytes
  var format: qiniuDashJsLib.qiniuDashJsLibStrings.png | qiniuDashJsLib.qiniuDashJsLibStrings.jpeg | qiniuDashJsLib.qiniuDashJsLibStrings.gif | qiniuDashJsLib.qiniuDashJsLibStrings.bmp
  						// 彩色空间，如palette16、ycbcr等。
  var frameNumber: scala.Double
  							// 图片宽度，单位：像素(px) 。
  var height: scala.Double
  var size: scala.Double
  	// 图片类型，如png、jpeg、gif、bmp等。
  var width: scala.Double
}

object ImageInfo {
  @scala.inline
  def apply(
    colorModel: java.lang.String,
    format: qiniuDashJsLib.qiniuDashJsLibStrings.png | qiniuDashJsLib.qiniuDashJsLibStrings.jpeg | qiniuDashJsLib.qiniuDashJsLibStrings.gif | qiniuDashJsLib.qiniuDashJsLibStrings.bmp,
    frameNumber: scala.Double,
    height: scala.Double,
    size: scala.Double,
    width: scala.Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(colorModel = colorModel, format = format.asInstanceOf[js.Any], frameNumber = frameNumber, height = height, size = size, width = width)
  
    __obj.asInstanceOf[ImageInfo]
  }
}

