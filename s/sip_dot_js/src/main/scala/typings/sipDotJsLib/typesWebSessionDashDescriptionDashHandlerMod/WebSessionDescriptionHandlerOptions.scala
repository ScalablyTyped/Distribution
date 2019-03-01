package typings
package sipDotJsLib.typesWebSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 2 members from Set(sip.js.sip.js/types/session-description-handler.SessionDescriptionHandlerOptions) */ trait WebSessionDescriptionHandlerOptions extends js.Object {
  var RTCOfferOptions: js.UndefOr[js.Any] = js.undefined
  var alwaysAcquireMediaFirst: js.UndefOr[scala.Boolean] = js.undefined
  var constraints: js.UndefOr[js.Any with sipDotJsLib.Anon_Audio] = js.undefined
  var disableAudioFallback: js.UndefOr[scala.Boolean] = js.undefined
  var modifiers: js.UndefOr[
    sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ] = js.undefined
  var peerConnectionOptions: js.UndefOr[PeerConnectionOptions] = js.undefined
}

object WebSessionDescriptionHandlerOptions {
  @scala.inline
  def apply(
    RTCOfferOptions: js.Any = null,
    alwaysAcquireMediaFirst: js.UndefOr[scala.Boolean] = js.undefined,
    constraints: js.Any with sipDotJsLib.Anon_Audio = null,
    disableAudioFallback: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers = null,
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

