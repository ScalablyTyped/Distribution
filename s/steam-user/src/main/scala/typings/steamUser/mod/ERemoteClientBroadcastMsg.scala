package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteClientBroadcastMsg extends StObject
@JSImport("steam-user", "ERemoteClientBroadcastMsg")
@js.native
object ERemoteClientBroadcastMsg extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteClientBroadcastMsg & Double] = js.native
  
  @js.native
  sealed trait AuthorizationCancelRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 9 */ val AuthorizationCancelRequest: typings.steamUser.mod.ERemoteClientBroadcastMsg.AuthorizationCancelRequest & Double = js.native
  
  @js.native
  sealed trait AuthorizationRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 3 */ val AuthorizationRequest: typings.steamUser.mod.ERemoteClientBroadcastMsg.AuthorizationRequest & Double = js.native
  
  @js.native
  sealed trait AuthorizationResponse
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 4 */ val AuthorizationResponse: typings.steamUser.mod.ERemoteClientBroadcastMsg.AuthorizationResponse & Double = js.native
  
  @js.native
  sealed trait ClientIDDeconflict
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 11 */ val ClientIDDeconflict: typings.steamUser.mod.ERemoteClientBroadcastMsg.ClientIDDeconflict & Double = js.native
  
  @js.native
  sealed trait Discovery
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 0 */ val Discovery: typings.steamUser.mod.ERemoteClientBroadcastMsg.Discovery & Double = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 2 */ val Offline: typings.steamUser.mod.ERemoteClientBroadcastMsg.Offline & Double = js.native
  
  @js.native
  sealed trait ProofRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 7 */ val ProofRequest: typings.steamUser.mod.ERemoteClientBroadcastMsg.ProofRequest & Double = js.native
  
  @js.native
  sealed trait ProofResponse
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 8 */ val ProofResponse: typings.steamUser.mod.ERemoteClientBroadcastMsg.ProofResponse & Double = js.native
  
  @js.native
  sealed trait Status
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 1 */ val Status: typings.steamUser.mod.ERemoteClientBroadcastMsg.Status & Double = js.native
  
  @js.native
  sealed trait StreamTransportSignal
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 12 */ val StreamTransportSignal: typings.steamUser.mod.ERemoteClientBroadcastMsg.StreamTransportSignal & Double = js.native
  
  @js.native
  sealed trait StreamingCancelRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 10 */ val StreamingCancelRequest: typings.steamUser.mod.ERemoteClientBroadcastMsg.StreamingCancelRequest & Double = js.native
  
  @js.native
  sealed trait StreamingProgress
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 13 */ val StreamingProgress: typings.steamUser.mod.ERemoteClientBroadcastMsg.StreamingProgress & Double = js.native
  
  @js.native
  sealed trait StreamingRequest
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 5 */ val StreamingRequest: typings.steamUser.mod.ERemoteClientBroadcastMsg.StreamingRequest & Double = js.native
  
  @js.native
  sealed trait StreamingResponse
    extends StObject
       with ERemoteClientBroadcastMsg
  /* 6 */ val StreamingResponse: typings.steamUser.mod.ERemoteClientBroadcastMsg.StreamingResponse & Double = js.native
}
