package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinEvent extends js.Object {
  var channel: String
  var hostmask: String
  var nick: String
}

object JoinEvent {
  @scala.inline
  def apply(channel: String, hostmask: String, nick: String): JoinEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JoinEvent]
  }
}

