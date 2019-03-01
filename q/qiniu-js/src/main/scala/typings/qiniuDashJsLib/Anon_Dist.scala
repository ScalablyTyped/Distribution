package typings
package qiniuDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dist extends js.Object {
  var dist: stdLib.Blob
  	// 压缩后的图片宽度
  var height: scala.Double
  	// 压缩后输出的 blob 对象，或原始的 file，具体看下面的 options 配置
  var width: scala.Double
}

object Anon_Dist {
  @scala.inline
  def apply(dist: stdLib.Blob, height: scala.Double, width: scala.Double): Anon_Dist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dist")(dist)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Dist]
  }
}

