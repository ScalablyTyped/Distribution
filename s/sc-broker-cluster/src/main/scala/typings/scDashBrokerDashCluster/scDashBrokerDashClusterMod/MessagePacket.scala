package typings.scDashBrokerDashCluster.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePacket extends js.Object {
  var channel: String
  var data: js.Any
}

object MessagePacket {
  @scala.inline
  def apply(channel: String, data: js.Any): MessagePacket = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessagePacket]
  }
}

