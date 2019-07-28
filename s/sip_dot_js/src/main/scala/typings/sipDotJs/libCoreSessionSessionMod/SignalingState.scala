package typings.sipDotJs.libCoreSessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignalingState extends js.Object

@JSImport("sip.js/lib/core/session/session", "SignalingState")
@js.native
object SignalingState extends js.Object {
  @js.native
  sealed trait Closed extends SignalingState
  
  @js.native
  sealed trait HaveLocalOffer extends SignalingState
  
  @js.native
  sealed trait HaveRemoteOffer extends SignalingState
  
  @js.native
  sealed trait Initial extends SignalingState
  
  @js.native
  sealed trait Stable extends SignalingState
  
  /* "Closed" */ val Closed: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Closed with String = js.native
  /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
  /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
  /* "Initial" */ val Initial: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Initial with String = js.native
  /* "Stable" */ val Stable: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Stable with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SignalingState with String] = js.native
}

