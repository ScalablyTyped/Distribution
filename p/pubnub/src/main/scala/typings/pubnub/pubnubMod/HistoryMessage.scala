package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryMessage extends js.Object {
  var entry: js.Any
  var timetoken: js.UndefOr[String | Double] = js.undefined
}

object HistoryMessage {
  @scala.inline
  def apply(entry: js.Any, timetoken: String | Double = null): HistoryMessage = {
    val __obj = js.Dynamic.literal(entry = entry)
    if (timetoken != null) __obj.updateDynamic("timetoken")(timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryMessage]
  }
}

