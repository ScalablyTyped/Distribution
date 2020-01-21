package typings.sipJs.webSessionDescriptionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescriptionHandlerOptions
  extends typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions {
  var RTCOfferOptions: js.UndefOr[js.Any] = js.undefined
  var alwaysAcquireMediaFirst: js.UndefOr[Boolean] = js.undefined
  var disableAudioFallback: js.UndefOr[Boolean] = js.undefined
  var peerConnectionOptions: js.UndefOr[PeerConnectionOptions] = js.undefined
}

object SessionDescriptionHandlerOptions {
  @scala.inline
  def apply(
    RTCOfferOptions: js.Any = null,
    alwaysAcquireMediaFirst: js.UndefOr[Boolean] = js.undefined,
    constraints: js.Object = null,
    disableAudioFallback: js.UndefOr[Boolean] = js.undefined,
    peerConnectionOptions: PeerConnectionOptions = null
  ): SessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (RTCOfferOptions != null) __obj.updateDynamic("RTCOfferOptions")(RTCOfferOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysAcquireMediaFirst)) __obj.updateDynamic("alwaysAcquireMediaFirst")(alwaysAcquireMediaFirst.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAudioFallback)) __obj.updateDynamic("disableAudioFallback")(disableAudioFallback.asInstanceOf[js.Any])
    if (peerConnectionOptions != null) __obj.updateDynamic("peerConnectionOptions")(peerConnectionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionDescriptionHandlerOptions]
  }
}

