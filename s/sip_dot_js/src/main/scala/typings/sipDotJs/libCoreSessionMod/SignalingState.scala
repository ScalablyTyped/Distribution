package typings.sipDotJs.libCoreSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/session", "SignalingState")
@js.native
object SignalingState extends js.Object {
  /* "Closed" */ val Closed: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Closed with String = js.native
  /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
  /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
  /* "Initial" */ val Initial: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Initial with String = js.native
  /* "Stable" */ val Stable: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Stable with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipDotJs.libCoreSessionSessionMod.SignalingState with String] = js.native
}

