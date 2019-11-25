package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMessageActionsResponse extends js.Object {
  var data: js.Array[MessageAction]
  var end: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object GetMessageActionsResponse {
  @scala.inline
  def apply(data: js.Array[MessageAction], end: String = null, start: String = null): GetMessageActionsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageActionsResponse]
  }
}

