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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventInit]
  }
}

