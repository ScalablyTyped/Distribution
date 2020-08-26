package typings.socketcluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerStartInfo extends js.Object {
  var id: Double = js.native
  var pid: Double = js.native
  var respawn: Boolean = js.native
}

object BrokerStartInfo {
  @scala.inline
  def apply(id: Double, pid: Double, respawn: Boolean): BrokerStartInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], respawn = respawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerStartInfo]
  }
  @scala.inline
  implicit class BrokerStartInfoOps[Self <: BrokerStartInfo] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRespawn(value: Boolean): Self = this.set("respawn", value.asInstanceOf[js.Any])
  }
  
}

