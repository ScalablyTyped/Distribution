package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeyMessageEventInit extends EventInit {
  var message: ArrayBuffer
  var messageType: MediaKeyMessageType
}

object MediaKeyMessageEventInit {
  @scala.inline
  def apply(
    message: ArrayBuffer,
    messageType: MediaKeyMessageType,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaKeyMessageEventInit = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
}

