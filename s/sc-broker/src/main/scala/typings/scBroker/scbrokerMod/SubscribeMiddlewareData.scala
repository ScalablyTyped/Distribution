package typings.scBroker.scbrokerMod

import typings.ncom.mod.ComSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeMiddlewareData extends js.Object {
  var channel: String
  var socket: ComSocket
}

object SubscribeMiddlewareData {
  @scala.inline
  def apply(channel: String, socket: ComSocket): SubscribeMiddlewareData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeMiddlewareData]
  }
}

