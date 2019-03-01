package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePacket extends js.Object {
  var channel: java.lang.String
  var data: js.Any
}

object MessagePacket {
  @scala.inline
  def apply(channel: java.lang.String, data: js.Any): MessagePacket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[MessagePacket]
  }
}

