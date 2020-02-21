package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerExitInfo extends js.Object {
  var code: Double
  var id: Double
  var pid: Double
  var signal: String
}

object BrokerExitInfo {
  @scala.inline
  def apply(code: Double, id: Double, pid: Double, signal: String): BrokerExitInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BrokerExitInfo]
  }
}

