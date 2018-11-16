package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageMogr2Options extends js.Object {
  var `auto-orient`: scala.Boolean
  				// 新图的输出格式，取值范围：jpg，gif，png，webp等
  var blur: java.lang.String
  			// 缩放操作参数
  var crop: java.lang.String
  			// 旋转角度，取值范围1-360，缺省为不旋转。
  var format: java.lang.String
  				// 裁剪操作参数
  var gravity: java.lang.String
  			// 裁剪锚点参数
  var quality: scala.Double
  			// 图片质量，取值范围1-100
  var rotate: scala.Double
  		// 布尔值，是否根据原图EXIF信息自动旋正，便于后续处理，建议放在首位。
  var strip: scala.Boolean
  				// 布尔值，是否去除图片中的元信息
  var thumbnail: java.lang.String
}

