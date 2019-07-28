package typings.socketcluster.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerStartInfo extends js.Object {
  var id: Double
  var pid: Double
  var respawn: Boolean
}

object BrokerStartInfo {
  @scala.inline
  def apply(id: Double, pid: Double, respawn: Boolean): BrokerStartInfo = {
    val __obj = js.Dynamic.literal(id = id, pid = pid, respawn = respawn)
  
    __obj.asInstanceOf[BrokerStartInfo]
  }
}

