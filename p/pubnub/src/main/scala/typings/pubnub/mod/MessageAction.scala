package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAction extends js.Object {
  var actionTimetoken: String = js.native
  var messageTimetoken: String = js.native
  var `type`: String = js.native
  var uuid: String = js.native
  var value: String = js.native
}

object MessageAction {
  @scala.inline
  def apply(actionTimetoken: String, messageTimetoken: String, `type`: String, uuid: String, value: String): MessageAction = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAction]
  }
  @scala.inline
  implicit class MessageActionOps[Self <: MessageAction] (val x: Self) extends AnyVal {
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
    def setActionTimetoken(value: String): Self = this.set("actionTimetoken", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageTimetoken(value: String): Self = this.set("messageTimetoken", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

