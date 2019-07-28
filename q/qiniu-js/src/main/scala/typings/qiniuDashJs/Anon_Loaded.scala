package typings.qiniuDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loaded extends js.Object {
  var loaded: Double
  	// 本次上传的总量控制信息，单位为字节，注意这里的 total 跟文件大小并不一致。
  var percent: Double
  	// 已上传大小，单位为字节。
  var total: Double
}

object Anon_Loaded {
  @scala.inline
  def apply(loaded: Double, percent: Double, total: Double): Anon_Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded, percent = percent, total = total)
  
    __obj.asInstanceOf[Anon_Loaded]
  }
}

