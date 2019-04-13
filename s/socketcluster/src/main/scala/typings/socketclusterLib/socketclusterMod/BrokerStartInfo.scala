package typings
package socketclusterLib.socketclusterMod

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
    val __obj = js.Dynamic.literal(id = id, pid = pid, respawn = respawn)
  
    __obj.asInstanceOf[BrokerStartInfo]
  }
}

