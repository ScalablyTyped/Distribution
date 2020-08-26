package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMessagesParameters extends js.Object {
  var channels: js.Array[String] = js.native
  var count: js.UndefOr[Double] = js.native
   // timetoken
  var end: js.UndefOr[String | Double] = js.native
  var includeMessageActions: js.UndefOr[Boolean] = js.native
  var includeMeta: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[String | Double] = js.native
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.native
   // timetoken
  var withMessageActions: js.UndefOr[Boolean] = js.native
}

object FetchMessagesParameters {
  @scala.inline
  def apply(channels: js.Array[String]): FetchMessagesParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessagesParameters]
  }
  @scala.inline
  implicit class FetchMessagesParametersOps[Self <: FetchMessagesParameters] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEnd(value: String | Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setIncludeMessageActions(value: Boolean): Self = this.set("includeMessageActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeMessageActions: Self = this.set("includeMessageActions", js.undefined)
    @scala.inline
    def setIncludeMeta(value: Boolean): Self = this.set("includeMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeMeta: Self = this.set("includeMeta", js.undefined)
    @scala.inline
    def setStart(value: String | Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStringifiedTimeToken(value: Boolean): Self = this.set("stringifiedTimeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringifiedTimeToken: Self = this.set("stringifiedTimeToken", js.undefined)
    @scala.inline
    def setWithMessageActions(value: Boolean): Self = this.set("withMessageActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithMessageActions: Self = this.set("withMessageActions", js.undefined)
  }
  
}

