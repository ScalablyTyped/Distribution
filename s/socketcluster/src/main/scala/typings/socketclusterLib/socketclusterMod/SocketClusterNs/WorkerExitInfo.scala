package typings
package socketclusterLib.socketclusterMod.SocketClusterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerExitInfo extends js.Object {
  var code: scala.Double
  var id: scala.Double
  var pid: scala.Double
  var signal: java.lang.String
}

object WorkerExitInfo {
  @scala.inline
  def apply(code: scala.Double, id: scala.Double, pid: scala.Double, signal: java.lang.String): WorkerExitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[WorkerExitInfo]
  }
}

