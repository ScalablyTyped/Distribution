package typings
package qiniuDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loaded extends js.Object {
  var loaded: scala.Double
  	// 本次上传的总量控制信息，单位为字节，注意这里的 total 跟文件大小并不一致。
  var percent: scala.Double
  	// 已上传大小，单位为字节。
  var total: scala.Double
}

object Anon_Loaded {
  @scala.inline
  def apply(loaded: scala.Double, percent: scala.Double, total: scala.Double): Anon_Loaded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Anon_Loaded]
  }
}

