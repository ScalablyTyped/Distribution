package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSessionMod {
  
  @JSImport("sip.js/lib/core/session", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.sessionSessionMod.SessionState & String] = js.native
    
    /* "AckWait" */ val AckWait: typings.sipJs.sessionSessionMod.SessionState.AckWait & String = js.native
    
    /* "Confirmed" */ val Confirmed: typings.sipJs.sessionSessionMod.SessionState.Confirmed & String = js.native
    
    /* "Early" */ val Early: typings.sipJs.sessionSessionMod.SessionState.Early & String = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.sessionSessionMod.SessionState.Initial & String = js.native
    
    /* "Terminated" */ val Terminated: typings.sipJs.sessionSessionMod.SessionState.Terminated & String = js.native
  }
  
  @JSImport("sip.js/lib/core/session", "SignalingState")
  @js.native
  object SignalingState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.sessionSessionMod.SignalingState & String] = js.native
    
    /* "Closed" */ val Closed: typings.sipJs.sessionSessionMod.SignalingState.Closed & String = js.native
    
    /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipJs.sessionSessionMod.SignalingState.HaveLocalOffer & String = js.native
    
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipJs.sessionSessionMod.SignalingState.HaveRemoteOffer & String = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.sessionSessionMod.SignalingState.Initial & String = js.native
    
    /* "Stable" */ val Stable: typings.sipJs.sessionSessionMod.SignalingState.Stable & String = js.native
  }
}
