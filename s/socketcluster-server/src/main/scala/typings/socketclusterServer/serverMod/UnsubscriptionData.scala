package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.UnsubscribeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscriptionData extends UnsubscribeData {
  var socket: typings.socketclusterServer.serversocketMod.^
}

object UnsubscriptionData {
  @scala.inline
  def apply(channel: String, socket: typings.socketclusterServer.serversocketMod.^): UnsubscriptionData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsubscriptionData]
  }
}

