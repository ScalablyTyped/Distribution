package typings.shipitCli.mod

import typings.node.childProcessMod.ChildProcess
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipitLocal extends js.Object {
  var child: ChildProcess
  var stderr: WriteStream
  var stdout: WriteStream
}

object ShipitLocal {
  @scala.inline
  def apply(child: ChildProcess, stderr: WriteStream, stdout: WriteStream): ShipitLocal = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShipitLocal]
  }
}

