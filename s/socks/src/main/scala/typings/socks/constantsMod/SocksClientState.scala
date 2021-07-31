package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksClientState extends StObject
@JSImport("socks/typings/common/constants", "SocksClientState")
@js.native
object SocksClientState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksClientState & Double] = js.native
  
  @js.native
  sealed trait BoundWaitingForConnection
    extends StObject
       with SocksClientState
  /* 9 */ val BoundWaitingForConnection: typings.socks.constantsMod.SocksClientState.BoundWaitingForConnection & Double = js.native
  
  @js.native
  sealed trait Connected
    extends StObject
       with SocksClientState
  /* 2 */ val Connected: typings.socks.constantsMod.SocksClientState.Connected & Double = js.native
  
  @js.native
  sealed trait Connecting
    extends StObject
       with SocksClientState
  /* 1 */ val Connecting: typings.socks.constantsMod.SocksClientState.Connecting & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with SocksClientState
  /* 0 */ val Created: typings.socks.constantsMod.SocksClientState.Created & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with SocksClientState
  /* 11 */ val Disconnected: typings.socks.constantsMod.SocksClientState.Disconnected & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with SocksClientState
  /* 99 */ val Error: typings.socks.constantsMod.SocksClientState.Error & Double = js.native
  
  @js.native
  sealed trait Established
    extends StObject
       with SocksClientState
  /* 10 */ val Established: typings.socks.constantsMod.SocksClientState.Established & Double = js.native
  
  @js.native
  sealed trait ReceivedAuthenticationResponse
    extends StObject
       with SocksClientState
  /* 6 */ val ReceivedAuthenticationResponse: typings.socks.constantsMod.SocksClientState.ReceivedAuthenticationResponse & Double = js.native
  
  @js.native
  sealed trait ReceivedFinalResponse
    extends StObject
       with SocksClientState
  /* 8 */ val ReceivedFinalResponse: typings.socks.constantsMod.SocksClientState.ReceivedFinalResponse & Double = js.native
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse
    extends StObject
       with SocksClientState
  /* 4 */ val ReceivedInitialHandshakeResponse: typings.socks.constantsMod.SocksClientState.ReceivedInitialHandshakeResponse & Double = js.native
  
  @js.native
  sealed trait SentAuthentication
    extends StObject
       with SocksClientState
  /* 5 */ val SentAuthentication: typings.socks.constantsMod.SocksClientState.SentAuthentication & Double = js.native
  
  @js.native
  sealed trait SentFinalHandshake
    extends StObject
       with SocksClientState
  /* 7 */ val SentFinalHandshake: typings.socks.constantsMod.SocksClientState.SentFinalHandshake & Double = js.native
  
  @js.native
  sealed trait SentInitialHandshake
    extends StObject
       with SocksClientState
  /* 3 */ val SentInitialHandshake: typings.socks.constantsMod.SocksClientState.SentInitialHandshake & Double = js.native
}
