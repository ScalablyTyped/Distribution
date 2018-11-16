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

