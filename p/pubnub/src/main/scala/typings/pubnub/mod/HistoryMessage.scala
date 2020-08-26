package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryMessage extends js.Object {
  var entry: js.Any = js.native
  var meta: js.UndefOr[js.Object] = js.native
  var timetoken: js.UndefOr[String | Double] = js.native
}

object HistoryMessage {
  @scala.inline
  def apply(entry: js.Any): HistoryMessage = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryMessage]
  }
  @scala.inline
  implicit class HistoryMessageOps[Self <: HistoryMessage] (val x: Self) extends AnyVal {
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
    def setEntry(value: js.Any): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setTimetoken(value: String | Double): Self = this.set("timetoken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimetoken: Self = this.set("timetoken", js.undefined)
  }
  
}

