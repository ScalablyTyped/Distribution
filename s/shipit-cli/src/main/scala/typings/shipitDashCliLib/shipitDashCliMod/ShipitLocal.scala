package typings
package shipitDashCliLib.shipitDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipitLocal extends js.Object {
  var child: nodeLib.childUnderscoreProcessMod.ChildProcess
  var stderr: nodeLib.fsMod.WriteStream
  var stdout: nodeLib.fsMod.WriteStream
}

object ShipitLocal {
  @scala.inline
  def apply(
    child: nodeLib.childUnderscoreProcessMod.ChildProcess,
    stderr: nodeLib.fsMod.WriteStream,
    stdout: nodeLib.fsMod.WriteStream
  ): ShipitLocal = {
    val __obj = js.Dynamic.literal(child = child, stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[ShipitLocal]
  }
}

