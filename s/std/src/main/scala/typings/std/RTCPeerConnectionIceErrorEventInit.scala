package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionIceErrorEventInit extends EventInit {
  var errorCode: Double
  var hostCandidate: js.UndefOr[java.lang.String] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RTCPeerConnectionIceErrorEventInit {
  @scala.inline
  def apply(
    errorCode: Double,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    hostCandidate: java.lang.String = null,
    statusText: java.lang.String = null,
    url: java.lang.String = null
  ): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (hostCandidate != null) __obj.updateDynamic("hostCandidate")(hostCandidate.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
}

