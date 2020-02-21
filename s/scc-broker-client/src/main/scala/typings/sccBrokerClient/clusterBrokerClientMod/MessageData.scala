package typings.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData extends js.Object {
  var channelName: String
  var packet: js.Any
}

object MessageData {
  @scala.inline
  def apply(channelName: String, packet: js.Any): MessageData = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageData]
  }
}

