package typings.sipDotJs.libWebSessionDescriptionHandlerMod

import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSessionDescriptionHandlerOptions extends SessionDescriptionHandlerOptions {
  var RTCOfferOptions: js.UndefOr[js.Any] = js.undefined
  var alwaysAcquireMediaFirst: js.UndefOr[Boolean] = js.undefined
  @JSName("constraints")
  var constraints_WebSessionDescriptionHandlerOptions: js.UndefOr[js.Any] = js.undefined
  var disableAudioFallback: js.UndefOr[Boolean] = js.undefined
  var peerConnectionOptions: js.UndefOr[PeerConnectionOptions] = js.undefined
}

object WebSessionDescriptionHandlerOptions {
  @scala.inline
  def apply(
    RTCOfferOptions: js.Any = null,
    alwaysAcquireMediaFirst: js.UndefOr[Boolean] = js.undefined,
    constraints: js.Any = null,
    disableAudioFallback: js.UndefOr[Boolean] = js.undefined,
    modifiers: SessionDescriptionHandlerModifiers = null,
    peerConnectionOptions: PeerConnectionOptions = null
  ): WebSessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (RTCOfferOptions != null) __obj.updateDynamic("RTCOfferOptions")(RTCOfferOptions)
    if (!js.isUndefined(alwaysAcquireMediaFirst)) __obj.updateDynamic("alwaysAcquireMediaFirst")(alwaysAcquireMediaFirst)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (!js.isUndefined(disableAudioFallback)) __obj.updateDynamic("disableAudioFallback")(disableAudioFallback)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (peerConnectionOptions != null) __obj.updateDynamic("peerConnectionOptions")(peerConnectionOptions)
    __obj.asInstanceOf[WebSessionDescriptionHandlerOptions]
  }
}

