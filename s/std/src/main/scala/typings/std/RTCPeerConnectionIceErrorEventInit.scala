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
    val __obj = js.Dynamic.literal(errorCode = errorCode)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (hostCandidate != null) __obj.updateDynamic("hostCandidate")(hostCandidate)
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
}

