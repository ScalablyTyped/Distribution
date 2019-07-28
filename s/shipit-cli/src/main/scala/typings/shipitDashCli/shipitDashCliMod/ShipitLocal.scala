package typings.shipitDashCli.shipitDashCliMod

import typings.node.childUnderscoreProcessMod.ChildProcess
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
    val __obj = js.Dynamic.literal(child = child, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[ShipitLocal]
  }
}

