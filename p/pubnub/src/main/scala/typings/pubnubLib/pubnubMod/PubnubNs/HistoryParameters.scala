package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryParameters extends js.Object {
  var channel: java.lang.String
  var count: scala.Double
   // timetoken
  var end: js.UndefOr[scala.Double] = js.undefined
  var includeTimetoken: js.UndefOr[scala.Boolean] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var stringifiedTimeToken: js.UndefOr[scala.Boolean] = js.undefined
}

object HistoryParameters {
  @scala.inline
  def apply(
    channel: java.lang.String,
    count: scala.Double,
    end: scala.Int | scala.Double = null,
    includeTimetoken: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    stringifiedTimeToken: js.UndefOr[scala.Boolean] = js.undefined
  ): HistoryParameters = {
    val __obj = js.Dynamic.literal(channel = channel, count = count)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(includeTimetoken)) __obj.updateDynamic("includeTimetoken")(includeTimetoken)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifiedTimeToken)) __obj.updateDynamic("stringifiedTimeToken")(stringifiedTimeToken)
    __obj.asInstanceOf[HistoryParameters]
  }
}

