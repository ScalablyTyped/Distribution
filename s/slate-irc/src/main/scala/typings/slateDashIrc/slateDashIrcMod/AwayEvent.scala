package typings.slateDashIrc.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwayEvent extends js.Object {
  var message: String
  var nick: String
}

object AwayEvent {
  @scala.inline
  def apply(message: String, nick: String): AwayEvent = {
    val __obj = js.Dynamic.literal(message = message, nick = nick)
  
    __obj.asInstanceOf[AwayEvent]
  }
}

