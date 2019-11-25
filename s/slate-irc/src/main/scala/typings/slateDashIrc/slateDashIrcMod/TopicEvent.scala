package typings.slateDashIrc.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicEvent extends js.Object {
  var channel: String
  var hostmask: String
  var nick: String
  var topic: String
}

object TopicEvent {
  @scala.inline
  def apply(channel: String, hostmask: String, nick: String, topic: String): TopicEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicEvent]
  }
}

