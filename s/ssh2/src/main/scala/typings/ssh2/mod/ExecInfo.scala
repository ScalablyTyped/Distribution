package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecInfo extends js.Object {
  /** The command line to be executed. */
  var command: String = js.native
}

object ExecInfo {
  @scala.inline
  def apply(command: String): ExecInfo = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecInfo]
  }
  @scala.inline
  implicit class ExecInfoOps[Self <: ExecInfo] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
  }
  
}

