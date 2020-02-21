package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KickOutData extends js.Object {
  var channel: String
  var message: js.UndefOr[String] = js.undefined
}

object KickOutData {
  @scala.inline
  def apply(channel: String, message: String = null): KickOutData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KickOutData]
  }
}

