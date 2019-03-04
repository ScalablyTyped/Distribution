package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NickEvent extends js.Object {
  var hostmask: java.lang.String
  var `new`: java.lang.String
  var nick: java.lang.String
}

object NickEvent {
  @scala.inline
  def apply(hostmask: java.lang.String, `new`: java.lang.String, nick: java.lang.String): NickEvent = {
    val __obj = js.Dynamic.literal(hostmask = hostmask, nick = nick)
    __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[NickEvent]
  }
}

