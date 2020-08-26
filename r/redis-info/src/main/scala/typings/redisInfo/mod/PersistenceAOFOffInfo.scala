package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceAOFOffInfo extends js.Object {
  var aof_enabled: OFF = js.native
}

object PersistenceAOFOffInfo {
  @scala.inline
  def apply(aof_enabled: OFF): PersistenceAOFOffInfo = {
    val __obj = js.Dynamic.literal(aof_enabled = aof_enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceAOFOffInfo]
  }
  @scala.inline
  implicit class PersistenceAOFOffInfoOps[Self <: PersistenceAOFOffInfo] (val x: Self) extends AnyVal {
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
    def setAof_enabled(value: OFF): Self = this.set("aof_enabled", value.asInstanceOf[js.Any])
  }
  
}

