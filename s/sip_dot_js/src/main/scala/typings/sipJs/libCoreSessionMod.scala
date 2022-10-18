package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreSessionMod {
  
  @JSImport("sip.js/lib/core/session", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.libCoreSessionSessionMod.SessionState & String] = js.native
    
    /* "AckWait" */ val AckWait: typings.sipJs.libCoreSessionSessionMod.SessionState.AckWait & String = js.native
    
    /* "Confirmed" */ val Confirmed: typings.sipJs.libCoreSessionSessionMod.SessionState.Confirmed & String = js.native
    
    /* "Early" */ val Early: typings.sipJs.libCoreSessionSessionMod.SessionState.Early & String = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.libCoreSessionSessionMod.SessionState.Initial & String = js.native
    
    /* "Terminated" */ val Terminated: typings.sipJs.libCoreSessionSessionMod.SessionState.Terminated & String = js.native
  }
  
  @JSImport("sip.js/lib/core/session", "SignalingState")
  @js.native
  object SignalingState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.libCoreSessionSessionMod.SignalingState & String] = js.native
    
    /* "Closed" */ val Closed: typings.sipJs.libCoreSessionSessionMod.SignalingState.Closed & String = js.native
    
    /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer & String = js.native
    
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer & String = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.libCoreSessionSessionMod.SignalingState.Initial & String = js.native
    
    /* "Stable" */ val Stable: typings.sipJs.libCoreSessionSessionMod.SignalingState.Stable & String = js.native
  }
}
