package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMessagesParameters extends js.Object {
  var channels: js.Array[String]
  var count: js.UndefOr[Double] = js.undefined
   // timetoken
  var end: js.UndefOr[String | Double] = js.undefined
  var includeMessageActions: js.UndefOr[Boolean] = js.undefined
  var includeMeta: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[String | Double] = js.undefined
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.undefined
   // timetoken
  var withMessageActions: js.UndefOr[Boolean] = js.undefined
}

object FetchMessagesParameters {
  @scala.inline
  def apply(
    channels: js.Array[String],
    count: Int | Double = null,
    end: String | Double = null,
    includeMessageActions: js.UndefOr[Boolean] = js.undefined,
    includeMeta: js.UndefOr[Boolean] = js.undefined,
    start: String | Double = null,
    stringifiedTimeToken: js.UndefOr[Boolean] = js.undefined,
    withMessageActions: js.UndefOr[Boolean] = js.undefined
  ): FetchMessagesParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMessageActions)) __obj.updateDynamic("includeMessageActions")(includeMessageActions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMeta)) __obj.updateDynamic("includeMeta")(includeMeta.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifiedTimeToken)) __obj.updateDynamic("stringifiedTimeToken")(stringifiedTimeToken.asInstanceOf[js.Any])
    if (!js.isUndefined(withMessageActions)) __obj.updateDynamic("withMessageActions")(withMessageActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessagesParameters]
  }
}

