package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// publish
trait PublishParameters extends js.Object {
  var channel: String
  var message: js.Any
  var meta: js.UndefOr[js.Any] = js.undefined
  var sendByPost: js.UndefOr[Boolean] = js.undefined
  var storeInHistory: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object PublishParameters {
  @scala.inline
  def apply(
    channel: String,
    message: js.Any,
    meta: js.Any = null,
    sendByPost: js.UndefOr[Boolean] = js.undefined,
    storeInHistory: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null
  ): PublishParameters = {
    val __obj = js.Dynamic.literal(channel = channel, message = message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (!js.isUndefined(sendByPost)) __obj.updateDynamic("sendByPost")(sendByPost)
    if (!js.isUndefined(storeInHistory)) __obj.updateDynamic("storeInHistory")(storeInHistory)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishParameters]
  }
}

