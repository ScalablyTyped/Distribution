package typings.qiniuJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loaded extends js.Object {
  var loaded: Double
      // 本次上传的总量控制信息，单位为字节，注意这里的 total 跟文件大小并不一致。
  var percent: Double
      // 已上传大小，单位为字节。
  var total: Double
}

object Loaded {
  @scala.inline
  def apply(loaded: Double, percent: Double, total: Double): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
}

