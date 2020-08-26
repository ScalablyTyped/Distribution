package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageList extends js.Object {
  /** MessageList messages */
  var messages: js.UndefOr[js.Array[IMessage] | Null] = js.native
}

object IMessageList {
  @scala.inline
  def apply(): IMessageList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageList]
  }
  @scala.inline
  implicit class IMessageListOps[Self <: IMessageList] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: IMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[IMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMessagesNull: Self = this.set("messages", null)
  }
  
}

