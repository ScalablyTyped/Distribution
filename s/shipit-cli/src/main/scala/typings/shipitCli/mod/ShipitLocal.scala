package typings.shipitCli.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShipitLocal extends js.Object {
  var child: ChildProcess = js.native
  var stderr: WriteStream = js.native
  var stdout: WriteStream = js.native
}

object ShipitLocal {
  @scala.inline
  def apply(child: ChildProcess, stderr: WriteStream, stdout: WriteStream): ShipitLocal = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShipitLocal]
  }
  @scala.inline
  implicit class ShipitLocalOps[Self <: ShipitLocal] (val x: Self) extends AnyVal {
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
    def setChild(value: ChildProcess): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def setStderr(value: WriteStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: WriteStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
  
}

