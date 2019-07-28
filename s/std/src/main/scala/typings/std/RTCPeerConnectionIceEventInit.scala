package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionIceEventInit extends EventInit {
  var candidate: js.UndefOr[RTCIceCandidate | Null] = js.undefined
  var url: js.UndefOr[java.lang.String | Null] = js.undefined
}

object RTCPeerConnectionIceEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    candidate: RTCIceCandidate = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): RTCPeerConnectionIceEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (candidate != null) __obj.updateDynamic("candidate")(candidate)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RTCPeerConnectionIceEventInit]
  }
}

