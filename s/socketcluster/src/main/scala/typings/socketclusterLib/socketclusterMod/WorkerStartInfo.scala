package typings
package socketclusterLib.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerStartInfo extends js.Object {
  var id: scala.Double
  var pid: scala.Double
  var respawn: scala.Boolean
}

object WorkerStartInfo {
  @scala.inline
  def apply(id: scala.Double, pid: scala.Double, respawn: scala.Boolean): WorkerStartInfo = {
    val __obj = js.Dynamic.literal(id = id, pid = pid, respawn = respawn)
  
    __obj.asInstanceOf[WorkerStartInfo]
  }
}

