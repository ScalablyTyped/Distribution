package typings
package socketclusterLib.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerClusterExitInfo extends js.Object {
  var childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess
  var code: scala.Double
  var pid: scala.Double
  var signal: java.lang.String
}

object WorkerClusterExitInfo {
  @scala.inline
  def apply(
    childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess,
    code: scala.Double,
    pid: scala.Double,
    signal: java.lang.String
  ): WorkerClusterExitInfo = {
    val __obj = js.Dynamic.literal(childProcess = childProcess, code = code, pid = pid, signal = signal)
  
    __obj.asInstanceOf[WorkerClusterExitInfo]
  }
}

