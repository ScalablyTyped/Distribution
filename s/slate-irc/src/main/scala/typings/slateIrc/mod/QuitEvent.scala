package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuitEvent extends js.Object {
  var hostmask: String
  var message: String
  var nick: String
}

object QuitEvent {
  @scala.inline
  def apply(hostmask: String, message: String, nick: String): QuitEvent = {
    val __obj = js.Dynamic.literal(hostmask = hostmask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QuitEvent]
  }
}

