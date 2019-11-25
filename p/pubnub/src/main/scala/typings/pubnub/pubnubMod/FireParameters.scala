package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fire
trait FireParameters extends js.Object {
  var channel: String
  var message: js.Any
  var meta: js.UndefOr[js.Any] = js.undefined
  var sendByPost: js.UndefOr[Boolean] = js.undefined
}

object FireParameters {
  @scala.inline
  def apply(
    channel: String,
    message: js.Any,
    meta: js.Any = null,
    sendByPost: js.UndefOr[Boolean] = js.undefined
  ): FireParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(sendByPost)) __obj.updateDynamic("sendByPost")(sendByPost.asInstanceOf[js.Any])
    __obj.asInstanceOf[FireParameters]
  }
}

