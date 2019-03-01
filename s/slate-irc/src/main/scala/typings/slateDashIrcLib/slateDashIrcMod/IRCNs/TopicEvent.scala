package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicEvent extends js.Object {
  var channel: java.lang.String
  var hostmask: java.lang.String
  var nick: java.lang.String
  var topic: java.lang.String
}

object TopicEvent {
  @scala.inline
  def apply(
    channel: java.lang.String,
    hostmask: java.lang.String,
    nick: java.lang.String,
    topic: java.lang.String
  ): TopicEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("hostmask")(hostmask)
    __obj.updateDynamic("nick")(nick)
    __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[TopicEvent]
  }
}

