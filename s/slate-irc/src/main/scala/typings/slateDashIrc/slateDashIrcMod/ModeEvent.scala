package typings.slateDashIrc.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeEvent extends js.Object {
  var client: String
  var mode: String
  var nick: String
  var target: String
}

object ModeEvent {
  @scala.inline
  def apply(client: String, mode: String, nick: String, target: String): ModeEvent = {
    val __obj = js.Dynamic.literal(client = client, mode = mode, nick = nick, target = target)
  
    __obj.asInstanceOf[ModeEvent]
  }
}

