package typings.slateIrc.mod

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
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartEvent]
  }
}

