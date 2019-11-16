package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResponse extends js.Object {
  var endTimeToken: js.UndefOr[String | Double] = js.undefined
  var messages: js.Array[HistoryMessage]
  var startTimeToken: js.UndefOr[String | Double] = js.undefined
}

object HistoryResponse {
  @scala.inline
  def apply(
    messages: js.Array[HistoryMessage],
    endTimeToken: String | Double = null,
    startTimeToken: String | Double = null
  ): HistoryResponse = {
    val __obj = js.Dynamic.literal(messages = messages)
    if (endTimeToken != null) __obj.updateDynamic("endTimeToken")(endTimeToken.asInstanceOf[js.Any])
    if (startTimeToken != null) __obj.updateDynamic("startTimeToken")(startTimeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryResponse]
  }
}

