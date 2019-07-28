package typings.socketcluster.socketclusterMod

import typings.node.childUnderscoreProcessMod.ChildProcess
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
    val __obj = js.Dynamic.literal(childProcess = childProcess, pid = pid)
  
    __obj.asInstanceOf[WorkerClusterStartInfo]
  }
}

