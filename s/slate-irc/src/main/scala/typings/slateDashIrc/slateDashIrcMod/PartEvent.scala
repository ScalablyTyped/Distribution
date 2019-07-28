package typings.slateDashIrc.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartEvent extends js.Object {
  var channels: js.Array[String]
  var hostmask: String
  var nick: String
}

object PartEvent {
  @scala.inline
  def apply(channels: js.Array[String], hostmask: String, nick: String): PartEvent = {
    val __obj = js.Dynamic.literal(channels = channels, hostmask = hostmask, nick = nick)
  
    __obj.asInstanceOf[PartEvent]
  }
}

