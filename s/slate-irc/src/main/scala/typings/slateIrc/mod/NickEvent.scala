package typings.slateIrc.mod

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
    val __obj = js.Dynamic.literal(hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NickEvent]
  }
}

