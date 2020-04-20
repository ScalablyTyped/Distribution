package typings.socketcluster.mod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerClusterStartInfo extends js.Object {
  var childProcess: ChildProcess
  var pid: Double
}

object WorkerClusterStartInfo {
  @scala.inline
  def apply(childProcess: ChildProcess, pid: Double): WorkerClusterStartInfo = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerClusterStartInfo]
  }
}

