package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwayEvent extends js.Object {
  var message: java.lang.String
  var nick: java.lang.String
}

object AwayEvent {
  @scala.inline
  def apply(message: java.lang.String, nick: java.lang.String): AwayEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("nick")(nick)
    __obj.asInstanceOf[AwayEvent]
  }
}

