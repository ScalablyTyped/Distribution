package typings
package socketclusterLib.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerClusterReadyInfo extends js.Object {
  var childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess
  var pid: scala.Double
}

object WorkerClusterReadyInfo {
  @scala.inline
  def apply(childProcess: nodeLib.childUnderscoreProcessMod.ChildProcess, pid: scala.Double): WorkerClusterReadyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childProcess")(childProcess)
    __obj.updateDynamic("pid")(pid)
    __obj.asInstanceOf[WorkerClusterReadyInfo]
  }
}

