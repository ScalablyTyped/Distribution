package typings.pythonShell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.native
  var childProcess: js.UndefOr[String] = js.native
  var command: js.UndefOr[String] = js.native
  var exitCode: js.UndefOr[js.Any] = js.native
  var script: js.UndefOr[String] = js.native
  var stderr: js.UndefOr[js.Any] = js.native
  var stdin: js.UndefOr[js.Any] = js.native
  var stdout: js.UndefOr[js.Any] = js.native
  var terminated: js.UndefOr[js.Any] = js.native
}

object InstanceOptions {
  @scala.inline
  def apply(): InstanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceOptions]
  }
  @scala.inline
  implicit class InstanceOptionsOps[Self <: InstanceOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setChildProcess(value: String): Self = this.set("childProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildProcess: Self = this.set("childProcess", js.undefined)
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setExitCode(value: js.Any): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setStderr(value: js.Any): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdin(value: js.Any): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setStdout(value: js.Any): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    @scala.inline
    def setTerminated(value: js.Any): Self = this.set("terminated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminated: Self = this.set("terminated", js.undefined)
  }
  
}

