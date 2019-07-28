package typings.slateDashIrc.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NickEvent extends js.Object {
  var hostmask: String
  var `new`: String
  var nick: String
}

object NickEvent {
  @scala.inline
  def apply(hostmask: String, `new`: String, nick: String): NickEvent = {
    val __obj = js.Dynamic.literal(hostmask = hostmask, nick = nick)
    __obj.updateDynamic("new")(`new`)
    __obj.asInstanceOf[NickEvent]
  }
}

