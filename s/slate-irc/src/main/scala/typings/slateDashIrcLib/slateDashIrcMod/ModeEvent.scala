package typings
package slateDashIrcLib.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeEvent extends js.Object {
  var client: java.lang.String
  var mode: java.lang.String
  var nick: java.lang.String
  var target: java.lang.String
}

object ModeEvent {
  @scala.inline
  def apply(client: java.lang.String, mode: java.lang.String, nick: java.lang.String, target: java.lang.String): ModeEvent = {
    val __obj = js.Dynamic.literal(client = client, mode = mode, nick = nick, target = target)
  
    __obj.asInstanceOf[ModeEvent]
  }
}

