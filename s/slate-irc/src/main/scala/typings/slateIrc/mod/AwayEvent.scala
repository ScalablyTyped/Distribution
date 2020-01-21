package typings.slateIrc.mod

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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AwayEvent]
  }
}

