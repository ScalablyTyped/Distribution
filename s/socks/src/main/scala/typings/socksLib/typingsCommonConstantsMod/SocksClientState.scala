package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocksClientState extends js.Object

@JSImport("socks/typings/common/constants", "SocksClientState")
@js.native
object SocksClientState extends js.Object {
  @js.native
  sealed trait BoundWaitingForConnection
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait Connected
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait Connecting
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait Created
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait Disconnected
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait Error
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait Established
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait ReceivedAuthenticationResponse
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait ReceivedFinalResponse
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait SentAuthentication
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait SentFinalHandshake
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  @js.native
  sealed trait SentInitialHandshake
    extends socksLib.typingsCommonConstantsMod.SocksClientState
  
  /* 9 */ val BoundWaitingForConnection: BoundWaitingForConnection with scala.Double = js.native
  /* 2 */ val Connected: Connected with scala.Double = js.native
  /* 1 */ val Connecting: Connecting with scala.Double = js.native
  /* 0 */ val Created: Created with scala.Double = js.native
  /* 11 */ val Disconnected: Disconnected with scala.Double = js.native
  /* 99 */ val Error: Error with scala.Double = js.native
  /* 10 */ val Established: Established with scala.Double = js.native
  /* 6 */ val ReceivedAuthenticationResponse: ReceivedAuthenticationResponse with scala.Double = js.native
  /* 8 */ val ReceivedFinalResponse: ReceivedFinalResponse with scala.Double = js.native
  /* 4 */ val ReceivedInitialHandshakeResponse: ReceivedInitialHandshakeResponse with scala.Double = js.native
  /* 5 */ val SentAuthentication: SentAuthentication with scala.Double = js.native
  /* 7 */ val SentFinalHandshake: SentFinalHandshake with scala.Double = js.native
  /* 3 */ val SentInitialHandshake: SentInitialHandshake with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[socksLib.typingsCommonConstantsMod.SocksClientState with scala.Double] = js.native
}

