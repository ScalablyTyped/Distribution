package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksClientState extends StObject
@JSImport("socks/typings/common/constants", "SocksClientState")
@js.native
object SocksClientState extends StObject {
  
  @js.native
  sealed trait BoundWaitingForConnection
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait Connected
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait Connecting
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait Created
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait Error
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait Established
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait ReceivedAuthenticationResponse
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait ReceivedFinalResponse
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait SentAuthentication
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait SentFinalHandshake
    extends StObject
       with SocksClientState
  
  @js.native
  sealed trait SentInitialHandshake
    extends StObject
       with SocksClientState
}
