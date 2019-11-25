package typings.socketcluster.socketclusterMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerClusterExitInfo extends js.Object {
  var childProcess: ChildProcess
  var code: Double
  var pid: Double
  var signal: String
}

object WorkerClusterExitInfo {
  @scala.inline
  def apply(childProcess: ChildProcess, code: Double, pid: Double, signal: String): WorkerClusterExitInfo = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkerClusterExitInfo]
  }
}

