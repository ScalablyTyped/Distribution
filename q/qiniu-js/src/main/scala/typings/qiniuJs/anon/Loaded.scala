package typings.qiniuJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loaded extends js.Object {
  var loaded: Double = js.native
      // 本次上传的总量控制信息，单位为字节，注意这里的 total 跟文件大小并不一致。
  var percent: Double = js.native
      // 已上传大小，单位为字节。
  var total: Double = js.native
}

object Loaded {
  @scala.inline
  def apply(loaded: Double, percent: Double, total: Double): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
  @scala.inline
  implicit class LoadedOps[Self <: Loaded] (val x: Self) extends AnyVal {
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
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

