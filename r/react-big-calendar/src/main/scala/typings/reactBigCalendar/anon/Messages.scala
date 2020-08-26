package typings.reactBigCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  var messages: typings.reactBigCalendar.mod.Messages = js.native
}

object Messages {
  @scala.inline
  def apply(messages: typings.reactBigCalendar.mod.Messages): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  @scala.inline
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
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
    def setMessages(value: typings.reactBigCalendar.mod.Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

