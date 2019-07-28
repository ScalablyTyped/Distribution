package typings.socketcluster.socketclusterMod

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
    val __obj = js.Dynamic.literal(id = id, pid = pid, respawn = respawn)
  
    __obj.asInstanceOf[WorkerStartInfo]
  }
}

