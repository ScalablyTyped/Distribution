package typings.ptyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Master extends js.Object {
  var master: Double = js.native
  var pty: String = js.native
  var slave: Double = js.native
}

object Master {
  @scala.inline
  def apply(master: Double, pty: String, slave: Double): Master = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Master]
  }
  @scala.inline
  implicit class MasterOps[Self <: Master] (val x: Self) extends AnyVal {
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
    def setMaster(value: Double): Self = this.set("master", value.asInstanceOf[js.Any])
    @scala.inline
    def setPty(value: String): Self = this.set("pty", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlave(value: Double): Self = this.set("slave", value.asInstanceOf[js.Any])
  }
  
}

