package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStat extends js.Object {
  var data: String = js.native
  var dt: String = js.native
  var lib: String = js.native
  var resident: String = js.native
  var share: String = js.native
  var size: String = js.native
  var text: String = js.native
}

object MemoryStat {
  @scala.inline
  def apply(data: String, dt: String, lib: String, resident: String, share: String, size: String, text: String): MemoryStat = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], resident = resident.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStat]
  }
  @scala.inline
  implicit class MemoryStatOps[Self <: MemoryStat] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDt(value: String): Self = this.set("dt", value.asInstanceOf[js.Any])
    @scala.inline
    def setLib(value: String): Self = this.set("lib", value.asInstanceOf[js.Any])
    @scala.inline
    def setResident(value: String): Self = this.set("resident", value.asInstanceOf[js.Any])
    @scala.inline
    def setShare(value: String): Self = this.set("share", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

