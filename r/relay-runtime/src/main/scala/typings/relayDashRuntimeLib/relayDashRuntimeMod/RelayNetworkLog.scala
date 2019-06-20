package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayNetworkLog extends js.Object {
  var label: java.lang.String
  var values: js.Array[_]
}

object RelayNetworkLog {
  @scala.inline
  def apply(label: java.lang.String, values: js.Array[_]): RelayNetworkLog = {
    val __obj = js.Dynamic.literal(label = label, values = values)
  
    __obj.asInstanceOf[RelayNetworkLog]
  }
}

