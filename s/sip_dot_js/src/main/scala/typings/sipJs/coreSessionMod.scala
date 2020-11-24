package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/session", JSImport.Namespace)
@js.native
object coreSessionMod extends js.Object {
  
  @js.native
  object SessionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.sessionSessionMod.SessionState with String] = js.native
    
    /* "AckWait" */ val AckWait: typings.sipJs.sessionSessionMod.SessionState.AckWait with String = js.native
    
    /* "Confirmed" */ val Confirmed: typings.sipJs.sessionSessionMod.SessionState.Confirmed with String = js.native
    
    /* "Early" */ val Early: typings.sipJs.sessionSessionMod.SessionState.Early with String = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.sessionSessionMod.SessionState.Initial with String = js.native
    
    /* "Terminated" */ val Terminated: typings.sipJs.sessionSessionMod.SessionState.Terminated with String = js.native
  }
  
  @js.native
  object SignalingState extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.sessionSessionMod.SignalingState with String] = js.native
    
    /* "Closed" */ val Closed: typings.sipJs.sessionSessionMod.SignalingState.Closed with String = js.native
    
    /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipJs.sessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
    
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipJs.sessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.sessionSessionMod.SignalingState.Initial with String = js.native
    
    /* "Stable" */ val Stable: typings.sipJs.sessionSessionMod.SignalingState.Stable with String = js.native
  }
}
