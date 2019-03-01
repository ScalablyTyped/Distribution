package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinEvent extends js.Object {
  var channel: java.lang.String
  var hostmask: java.lang.String
  var nick: java.lang.String
}

object JoinEvent {
  @scala.inline
  def apply(channel: java.lang.String, hostmask: java.lang.String, nick: java.lang.String): JoinEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("hostmask")(hostmask)
    __obj.updateDynamic("nick")(nick)
    __obj.asInstanceOf[JoinEvent]
  }
}

