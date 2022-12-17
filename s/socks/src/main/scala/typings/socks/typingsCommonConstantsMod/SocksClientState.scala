package typings.socks.typingsCommonConstantsMod

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
  /* 9 */ val BoundWaitingForConnection: typings.socks.typingsCommonConstantsMod.SocksClientState.BoundWaitingForConnection & Double = js.native
  
  @js.native
  sealed trait Connected
    extends StObject
       with SocksClientState
  /* 2 */ val Connected: typings.socks.typingsCommonConstantsMod.SocksClientState.Connected & Double = js.native
  
  @js.native
  sealed trait Connecting
    extends StObject
       with SocksClientState
  /* 1 */ val Connecting: typings.socks.typingsCommonConstantsMod.SocksClientState.Connecting & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with SocksClientState
  /* 0 */ val Created: typings.socks.typingsCommonConstantsMod.SocksClientState.Created & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with SocksClientState
  /* 11 */ val Disconnected: typings.socks.typingsCommonConstantsMod.SocksClientState.Disconnected & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with SocksClientState
  /* 99 */ val Error: typings.socks.typingsCommonConstantsMod.SocksClientState.Error & Double = js.native
  
  @js.native
  sealed trait Established
    extends StObject
       with SocksClientState
  /* 10 */ val Established: typings.socks.typingsCommonConstantsMod.SocksClientState.Established & Double = js.native
  
  @js.native
  sealed trait ReceivedAuthenticationResponse
    extends StObject
       with SocksClientState
  /* 6 */ val ReceivedAuthenticationResponse: typings.socks.typingsCommonConstantsMod.SocksClientState.ReceivedAuthenticationResponse & Double = js.native
  
  @js.native
  sealed trait ReceivedFinalResponse
    extends StObject
       with SocksClientState
  /* 8 */ val ReceivedFinalResponse: typings.socks.typingsCommonConstantsMod.SocksClientState.ReceivedFinalResponse & Double = js.native
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse
    extends StObject
       with SocksClientState
  /* 4 */ val ReceivedInitialHandshakeResponse: typings.socks.typingsCommonConstantsMod.SocksClientState.ReceivedInitialHandshakeResponse & Double = js.native
  
  @js.native
  sealed trait SentAuthentication
    extends StObject
       with SocksClientState
  /* 5 */ val SentAuthentication: typings.socks.typingsCommonConstantsMod.SocksClientState.SentAuthentication & Double = js.native
  
  @js.native
  sealed trait SentFinalHandshake
    extends StObject
       with SocksClientState
  /* 7 */ val SentFinalHandshake: typings.socks.typingsCommonConstantsMod.SocksClientState.SentFinalHandshake & Double = js.native
  
  @js.native
  sealed trait SentInitialHandshake
    extends StObject
       with SocksClientState
  /* 3 */ val SentInitialHandshake: typings.socks.typingsCommonConstantsMod.SocksClientState.SentInitialHandshake & Double = js.native
}
