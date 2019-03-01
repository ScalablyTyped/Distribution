package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryResponse extends js.Object {
  var endTimeToken: js.UndefOr[scala.Double] = js.undefined
  var messages: js.Array[HistoryMessage]
  var startTimeToken: js.UndefOr[scala.Double] = js.undefined
}

object HistoryResponse {
  @scala.inline
  def apply(
    messages: js.Array[HistoryMessage],
    endTimeToken: scala.Int | scala.Double = null,
    startTimeToken: scala.Int | scala.Double = null
  ): HistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messages")(messages)
    if (endTimeToken != null) __obj.updateDynamic("endTimeToken")(endTimeToken.asInstanceOf[js.Any])
    if (startTimeToken != null) __obj.updateDynamic("startTimeToken")(startTimeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryResponse]
  }
}

