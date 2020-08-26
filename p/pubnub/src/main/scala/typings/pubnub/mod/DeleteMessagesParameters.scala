package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessagesParameters extends js.Object {
  var channel: String = js.native
   // timetoken
  var end: js.UndefOr[String | Double] = js.native
  var start: js.UndefOr[String | Double] = js.native
}

object DeleteMessagesParameters {
  @scala.inline
  def apply(channel: String): DeleteMessagesParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessagesParameters]
  }
  @scala.inline
  implicit class DeleteMessagesParametersOps[Self <: DeleteMessagesParameters] (val x: Self) extends AnyVal {
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
    def setEnd(value: String | Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: String | Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

