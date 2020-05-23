package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryParameters extends js.Object {
  var channel: String
  var count: Double
   // timetoken
  var end: js.UndefOr[String | Double] = js.undefined
   // timetoken
  var includeMeta: js.UndefOr[Boolean] = js.undefined
  var includeTimetoken: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[String | Double] = js.undefined
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.undefined
}

object HistoryParameters {
  @scala.inline
  def apply(
    channel: String,
    count: Double,
    end: String | Double = null,
    includeMeta: js.UndefOr[Boolean] = js.undefined,
    includeTimetoken: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    start: String | Double = null,
    stringifiedTimeToken: js.UndefOr[Boolean] = js.undefined
  ): HistoryParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMeta)) __obj.updateDynamic("includeMeta")(includeMeta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTimetoken)) __obj.updateDynamic("includeTimetoken")(includeTimetoken.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifiedTimeToken)) __obj.updateDynamic("stringifiedTimeToken")(stringifiedTimeToken.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryParameters]
  }
}

