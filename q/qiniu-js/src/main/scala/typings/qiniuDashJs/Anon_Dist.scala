package typings.qiniuDashJs

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dist extends js.Object {
  var dist: Blob
  	// 压缩后的图片宽度
  var height: Double
  	// 压缩后输出的 blob 对象，或原始的 file，具体看下面的 options 配置
  var width: Double
}

object Anon_Dist {
  @scala.inline
  def apply(dist: Blob, height: Double, width: Double): Anon_Dist = {
    val __obj = js.Dynamic.literal(dist = dist, height = height, width = width)
  
    __obj.asInstanceOf[Anon_Dist]
  }
}

