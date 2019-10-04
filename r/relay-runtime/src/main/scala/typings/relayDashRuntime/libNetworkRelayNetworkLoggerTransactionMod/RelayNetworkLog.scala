package typings.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayNetworkLog extends js.Object {
  var label: String
  var values: js.Array[_]
}

object RelayNetworkLog {
  @scala.inline
  def apply(label: String, values: js.Array[_]): RelayNetworkLog = {
    val __obj = js.Dynamic.literal(label = label, values = values)
  
    __obj.asInstanceOf[RelayNetworkLog]
  }
}

