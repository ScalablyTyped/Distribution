package typings.ptyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pid extends js.Object {
  var fd: Double = js.native
  var pid: Double = js.native
  var pty: Double = js.native
}

object Pid {
  @scala.inline
  def apply(fd: Double, pid: Double, pty: Double): Pid = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pid]
  }
  @scala.inline
  implicit class PidOps[Self <: Pid] (val x: Self) extends AnyVal {
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
    def setFd(value: Double): Self = this.set("fd", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPty(value: Double): Self = this.set("pty", value.asInstanceOf[js.Any])
  }
  
}

