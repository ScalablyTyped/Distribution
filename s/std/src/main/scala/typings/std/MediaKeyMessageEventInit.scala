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
    val __obj = js.Dynamic.literal(message = message, messageType = messageType)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
}

