package typings
package socketclusterLib.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerClusterStartInfo extends js.Object {
  var childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess
  var pid: scala.Double
}

object WorkerClusterStartInfo {
  @scala.inline
  def apply(childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess, pid: scala.Double): WorkerClusterStartInfo = {
    val __obj = js.Dynamic.literal(childProcess = childProcess, pid = pid)
  
    __obj.asInstanceOf[WorkerClusterStartInfo]
  }
}

