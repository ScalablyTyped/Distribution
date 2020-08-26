package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryResponse extends js.Object {
  var endTimeToken: js.UndefOr[String | Double] = js.native
  var messages: js.Array[HistoryMessage] = js.native
  var startTimeToken: js.UndefOr[String | Double] = js.native
}

object HistoryResponse {
  @scala.inline
  def apply(messages: js.Array[HistoryMessage]): HistoryResponse = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryResponse]
  }
  @scala.inline
  implicit class HistoryResponseOps[Self <: HistoryResponse] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: HistoryMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[HistoryMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTimeToken(value: String | Double): Self = this.set("endTimeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimeToken: Self = this.set("endTimeToken", js.undefined)
    @scala.inline
    def setStartTimeToken(value: String | Double): Self = this.set("startTimeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimeToken: Self = this.set("startTimeToken", js.undefined)
  }
  
}

