package typings.slateDashIrc.slateDashIrcMod

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
    val __obj = js.Dynamic.literal(channel = channel, hostmask = hostmask, nick = nick)
  
    __obj.asInstanceOf[JoinEvent]
  }
}

