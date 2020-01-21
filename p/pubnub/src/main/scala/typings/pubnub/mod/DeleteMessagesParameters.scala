package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessagesParameters extends js.Object {
  var channel: String
   // timetoken
  var end: js.UndefOr[String | Double] = js.undefined
  var start: js.UndefOr[String | Double] = js.undefined
}

object DeleteMessagesParameters {
  @scala.inline
  def apply(channel: String, end: String | Double = null, start: String | Double = null): DeleteMessagesParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessagesParameters]
  }
}

