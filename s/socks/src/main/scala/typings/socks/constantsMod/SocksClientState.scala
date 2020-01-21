package typings.socks.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocksClientState extends js.Object

@JSImport("socks/typings/common/constants", "SocksClientState")
@js.native
object SocksClientState extends js.Object {
  @js.native
  sealed trait BoundWaitingForConnection extends SocksClientState
  
  @js.native
  sealed trait Connected extends SocksClientState
  
  @js.native
  sealed trait Connecting extends SocksClientState
  
  @js.native
  sealed trait Created extends SocksClientState
  
  @js.native
  sealed trait Disconnected extends SocksClientState
  
  @js.native
  sealed trait Error extends SocksClientState
  
  @js.native
  sealed trait Established extends SocksClientState
  
  @js.native
  sealed trait ReceivedAuthenticationResponse extends SocksClientState
  
  @js.native
  sealed trait ReceivedFinalResponse extends SocksClientState
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse extends SocksClientState
  
  @js.native
  sealed trait SentAuthentication extends SocksClientState
  
  @js.native
  sealed trait SentFinalHandshake extends SocksClientState
  
  @js.native
  sealed trait SentInitialHandshake extends SocksClientState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksClientState with Double] = js.native
  /* 9 */ @js.native
  object BoundWaitingForConnection extends TopLevel[BoundWaitingForConnection with Double]
  
  /* 2 */ @js.native
  object Connected extends TopLevel[Connected with Double]
  
  /* 1 */ @js.native
  object Connecting extends TopLevel[Connecting with Double]
  
  /* 0 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  /* 11 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
  /* 99 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 10 */ @js.native
  object Established extends TopLevel[Established with Double]
  
  /* 6 */ @js.native
  object ReceivedAuthenticationResponse extends TopLevel[ReceivedAuthenticationResponse with Double]
  
  /* 8 */ @js.native
  object ReceivedFinalResponse extends TopLevel[ReceivedFinalResponse with Double]
  
  /* 4 */ @js.native
  object ReceivedInitialHandshakeResponse extends TopLevel[ReceivedInitialHandshakeResponse with Double]
  
  /* 5 */ @js.native
  object SentAuthentication extends TopLevel[SentAuthentication with Double]
  
  /* 7 */ @js.native
  object SentFinalHandshake extends TopLevel[SentFinalHandshake with Double]
  
  /* 3 */ @js.native
  object SentInitialHandshake extends TopLevel[SentInitialHandshake with Double]
  
}

