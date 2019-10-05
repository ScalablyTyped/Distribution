package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/session", JSImport.Namespace)
@js.native
object libCoreSessionMod extends js.Object {
  @js.native
  object SessionState extends js.Object {
    /* "AckWait" */ val AckWait: typings.sipDotJs.libCoreSessionSessionMod.SessionState.AckWait with String = js.native
    /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Confirmed with String = js.native
    /* "Early" */ val Early: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Early with String = js.native
    /* "Initial" */ val Initial: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Initial with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libCoreSessionSessionMod.SessionState with String] = js.native
  }
  
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
  
}

