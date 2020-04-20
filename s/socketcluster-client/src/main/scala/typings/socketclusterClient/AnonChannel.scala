package typings.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: String
  var data: js.Any
}

object AnonChannel {
  @scala.inline
  def apply(channel: String, data: js.Any): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
}

