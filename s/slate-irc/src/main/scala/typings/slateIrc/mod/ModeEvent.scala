package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModeEvent extends js.Object {
  var client: String = js.native
  var mode: String = js.native
  var nick: String = js.native
  var target: String = js.native
}

object ModeEvent {
  @scala.inline
  def apply(client: String, mode: String, nick: String, target: String): ModeEvent = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeEvent]
  }
  @scala.inline
  implicit class ModeEventOps[Self <: ModeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: String): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

