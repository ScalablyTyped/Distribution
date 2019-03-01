package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartEvent extends js.Object {
  var channels: js.Array[java.lang.String]
  var hostmask: java.lang.String
  var nick: java.lang.String
}

object PartEvent {
  @scala.inline
  def apply(channels: js.Array[java.lang.String], hostmask: java.lang.String, nick: java.lang.String): PartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("hostmask")(hostmask)
    __obj.updateDynamic("nick")(nick)
    __obj.asInstanceOf[PartEvent]
  }
}

