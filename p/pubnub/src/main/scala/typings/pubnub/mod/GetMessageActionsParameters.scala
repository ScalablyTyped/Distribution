package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMessageActionsParameters extends js.Object {
  var channel: String
  var end: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object GetMessageActionsParameters {
  @scala.inline
  def apply(channel: String, end: String = null, limit: Int | Double = null, start: String = null): GetMessageActionsParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageActionsParameters]
  }
}

