package typings.qiniuJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoaded extends js.Object {
  var loaded: Double
  	// 本次上传的总量控制信息，单位为字节，注意这里的 total 跟文件大小并不一致。
  var percent: Double
  	// 已上传大小，单位为字节。
  var total: Double
}

object AnonLoaded {
  @scala.inline
  def apply(loaded: Double, percent: Double, total: Double): AnonLoaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLoaded]
  }
}

