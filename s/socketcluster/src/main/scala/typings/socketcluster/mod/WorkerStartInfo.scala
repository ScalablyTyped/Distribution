package typings.socketcluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerStartInfo extends js.Object {
  var id: Double
  var pid: Double
  var respawn: Boolean
}

object WorkerStartInfo {
  @scala.inline
  def apply(id: Double, pid: Double, respawn: Boolean): WorkerStartInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], respawn = respawn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkerStartInfo]
  }
}

