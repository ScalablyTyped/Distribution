package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinEvent extends js.Object {
  var channel: String = js.native
  var hostmask: String = js.native
  var nick: String = js.native
}

object JoinEvent {
  @scala.inline
  def apply(channel: String, hostmask: String, nick: String): JoinEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinEvent]
  }
  @scala.inline
  implicit class JoinEventOps[Self <: JoinEvent] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostmask(value: String): Self = this.set("hostmask", value.asInstanceOf[js.Any])
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
  }
  
}

