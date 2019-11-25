package typings.socketcluster.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerExitInfo extends js.Object {
  var code: Double
  var id: Double
  var pid: Double
  var signal: String
}

object WorkerExitInfo {
  @scala.inline
  def apply(code: Double, id: Double, pid: Double, signal: String): WorkerExitInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkerExitInfo]
  }
}

