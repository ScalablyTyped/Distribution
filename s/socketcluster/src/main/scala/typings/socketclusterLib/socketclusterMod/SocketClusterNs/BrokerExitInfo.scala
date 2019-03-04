package typings
package socketclusterLib.socketclusterMod.SocketClusterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerExitInfo extends js.Object {
  var code: scala.Double
  var id: scala.Double
  var pid: scala.Double
  var signal: java.lang.String
}

object BrokerExitInfo {
  @scala.inline
  def apply(code: scala.Double, id: scala.Double, pid: scala.Double, signal: java.lang.String): BrokerExitInfo = {
    val __obj = js.Dynamic.literal(code = code, id = id, pid = pid, signal = signal)
  
    __obj.asInstanceOf[BrokerExitInfo]
  }
}

