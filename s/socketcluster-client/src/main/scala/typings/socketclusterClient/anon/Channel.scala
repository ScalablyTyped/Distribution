package typings.socketclusterClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var channel: String
  var data: js.Any
}

object Channel {
  @scala.inline
  def apply(channel: String, data: js.Any): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

