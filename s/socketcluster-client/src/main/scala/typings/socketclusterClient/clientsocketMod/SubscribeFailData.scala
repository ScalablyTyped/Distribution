package typings.socketclusterClient.clientsocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeFailData extends js.Object {
  var channel: String
  var error: Error
  var subscriptionOptions: SubscribeOptions
}

object SubscribeFailData {
  @scala.inline
  def apply(channel: String, error: Error, subscriptionOptions: SubscribeOptions): SubscribeFailData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscribeFailData]
  }
}

