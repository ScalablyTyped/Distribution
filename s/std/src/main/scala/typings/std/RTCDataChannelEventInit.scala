package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDataChannelEventInit extends EventInit {
  var channel: RTCDataChannel
}

object RTCDataChannelEventInit {
  @scala.inline
  def apply(
    channel: RTCDataChannel,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCDataChannelEventInit = {
    val __obj = js.Dynamic.literal(channel = channel)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[RTCDataChannelEventInit]
  }
}

