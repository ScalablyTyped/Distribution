package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EVoiceCallState extends StObject
@JSImport("steam-user", "EVoiceCallState")
@js.native
object EVoiceCallState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EVoiceCallState & Double] = js.native
  
  @js.native
  sealed trait Connected
    extends StObject
       with EVoiceCallState
  /* 9 */ val Connected: typings.steamUser.mod.EVoiceCallState.Connected & Double = js.native
  
  @js.native
  sealed trait CreatePeerConnection
    extends StObject
       with EVoiceCallState
  /* 4 */ val CreatePeerConnection: typings.steamUser.mod.EVoiceCallState.CreatePeerConnection & Double = js.native
  
  @js.native
  sealed trait InitatedWebRTCSession
    extends StObject
       with EVoiceCallState
  /* 5 */ val InitatedWebRTCSession: typings.steamUser.mod.EVoiceCallState.InitatedWebRTCSession & Double = js.native
  
  @js.native
  sealed trait LocalMicOnly
    extends StObject
       with EVoiceCallState
  /* 3 */ val LocalMicOnly: typings.steamUser.mod.EVoiceCallState.LocalMicOnly & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EVoiceCallState
  /* 0 */ val None: typings.steamUser.mod.EVoiceCallState.None & Double = js.native
  
  @js.native
  sealed trait NotifyingVoiceChatOfWebRTCSession
    extends StObject
       with EVoiceCallState
  /* 8 */ val NotifyingVoiceChatOfWebRTCSession: typings.steamUser.mod.EVoiceCallState.NotifyingVoiceChatOfWebRTCSession & Double = js.native
  
  @js.native
  sealed trait RequestedMicAccess
    extends StObject
       with EVoiceCallState
  /* 2 */ val RequestedMicAccess: typings.steamUser.mod.EVoiceCallState.RequestedMicAccess & Double = js.native
  
  @js.native
  sealed trait RequestedPermission
    extends StObject
       with EVoiceCallState
  /* 7 */ val RequestedPermission: typings.steamUser.mod.EVoiceCallState.RequestedPermission & Double = js.native
  
  @js.native
  sealed trait ScheduledInitiate
    extends StObject
       with EVoiceCallState
  /* 1 */ val ScheduledInitiate: typings.steamUser.mod.EVoiceCallState.ScheduledInitiate & Double = js.native
  
  @js.native
  sealed trait WebRTCConnectedWaitingOnIceConnected
    extends StObject
       with EVoiceCallState
  /* 6 */ val WebRTCConnectedWaitingOnIceConnected: typings.steamUser.mod.EVoiceCallState.WebRTCConnectedWaitingOnIceConnected & Double = js.native
}
