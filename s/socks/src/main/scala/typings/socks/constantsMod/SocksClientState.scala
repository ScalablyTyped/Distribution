package typings.socks.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksClientState extends js.Object
@JSImport("socks/typings/common/constants", "SocksClientState")
@js.native
object SocksClientState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksClientState with Double] = js.native
  
  @js.native
  sealed trait BoundWaitingForConnection extends SocksClientState
  /* 9 */ @js.native
  object BoundWaitingForConnection extends TopLevel[BoundWaitingForConnection with Double]
  
  @js.native
  sealed trait Connected extends SocksClientState
  /* 2 */ @js.native
  object Connected extends TopLevel[Connected with Double]
  
  @js.native
  sealed trait Connecting extends SocksClientState
  /* 1 */ @js.native
  object Connecting extends TopLevel[Connecting with Double]
  
  @js.native
  sealed trait Created extends SocksClientState
  /* 0 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  @js.native
  sealed trait Disconnected extends SocksClientState
  /* 11 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
  @js.native
  sealed trait Error extends SocksClientState
  /* 99 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Established extends SocksClientState
  /* 10 */ @js.native
  object Established extends TopLevel[Established with Double]
  
  @js.native
  sealed trait ReceivedAuthenticationResponse extends SocksClientState
  /* 6 */ @js.native
  object ReceivedAuthenticationResponse extends TopLevel[ReceivedAuthenticationResponse with Double]
  
  @js.native
  sealed trait ReceivedFinalResponse extends SocksClientState
  /* 8 */ @js.native
  object ReceivedFinalResponse extends TopLevel[ReceivedFinalResponse with Double]
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse extends SocksClientState
  /* 4 */ @js.native
  object ReceivedInitialHandshakeResponse extends TopLevel[ReceivedInitialHandshakeResponse with Double]
  
  @js.native
  sealed trait SentAuthentication extends SocksClientState
  /* 5 */ @js.native
  object SentAuthentication extends TopLevel[SentAuthentication with Double]
  
  @js.native
  sealed trait SentFinalHandshake extends SocksClientState
  /* 7 */ @js.native
  object SentFinalHandshake extends TopLevel[SentFinalHandshake with Double]
  
  @js.native
  sealed trait SentInitialHandshake extends SocksClientState
  /* 3 */ @js.native
  object SentInitialHandshake extends TopLevel[SentInitialHandshake with Double]
}
