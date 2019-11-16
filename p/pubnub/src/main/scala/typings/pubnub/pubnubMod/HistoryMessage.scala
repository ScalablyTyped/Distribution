package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryMessage extends js.Object {
  var entry: js.Any
  var meta: js.UndefOr[js.Object] = js.undefined
  var timetoken: js.UndefOr[String | Double] = js.undefined
}

object HistoryMessage {
  @scala.inline
  def apply(entry: js.Any, meta: js.Object = null, timetoken: String | Double = null): HistoryMessage = {
    val __obj = js.Dynamic.literal(entry = entry)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (timetoken != null) __obj.updateDynamic("timetoken")(timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryMessage]
  }
}

