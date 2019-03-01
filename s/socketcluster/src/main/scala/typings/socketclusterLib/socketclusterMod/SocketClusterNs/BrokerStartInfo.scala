package typings
package socketclusterLib.socketclusterMod.SocketClusterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerStartInfo extends js.Object {
  var id: scala.Double
  var pid: scala.Double
  var respawn: scala.Boolean
}

object BrokerStartInfo {
  @scala.inline
  def apply(id: scala.Double, pid: scala.Double, respawn: scala.Boolean): BrokerStartInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("respawn")(respawn)
    __obj.asInstanceOf[BrokerStartInfo]
  }
}

