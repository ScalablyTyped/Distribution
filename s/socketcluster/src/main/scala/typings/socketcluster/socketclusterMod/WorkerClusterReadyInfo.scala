package typings.socketcluster.socketclusterMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerClusterReadyInfo extends js.Object {
  var childProcess: ChildProcess
  var pid: Double
}

object WorkerClusterReadyInfo {
  @scala.inline
  def apply(childProcess: ChildProcess, pid: Double): WorkerClusterReadyInfo = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkerClusterReadyInfo]
  }
}

