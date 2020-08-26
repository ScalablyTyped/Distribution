package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMessageActionsResponse extends js.Object {
  var data: js.Array[MessageAction] = js.native
  var end: js.UndefOr[String] = js.native
  var start: js.UndefOr[String] = js.native
}

object GetMessageActionsResponse {
  @scala.inline
  def apply(data: js.Array[MessageAction]): GetMessageActionsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageActionsResponse]
  }
  @scala.inline
  implicit class GetMessageActionsResponseOps[Self <: GetMessageActionsResponse] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: MessageAction*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[MessageAction]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

