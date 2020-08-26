package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartEvent extends js.Object {
  var channels: js.Array[String] = js.native
  var hostmask: String = js.native
  var nick: String = js.native
}

object PartEvent {
  @scala.inline
  def apply(channels: js.Array[String], hostmask: String, nick: String): PartEvent = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hostmask = hostmask.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartEvent]
  }
  @scala.inline
  implicit class PartEventOps[Self <: PartEvent] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostmask(value: String): Self = this.set("hostmask", value.asInstanceOf[js.Any])
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
  }
  
}

