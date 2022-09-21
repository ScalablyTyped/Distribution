package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUdpPacketType extends StObject
@JSImport("steam-user", "EUdpPacketType")
@js.native
object EUdpPacketType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUdpPacketType & Double] = js.native
  
  @js.native
  sealed trait Accept
    extends StObject
       with EUdpPacketType
  /* 4 */ val Accept: typings.steamUser.mod.EUdpPacketType.Accept & Double = js.native
  
  @js.native
  sealed trait Challenge
    extends StObject
       with EUdpPacketType
  /* 2 */ val Challenge: typings.steamUser.mod.EUdpPacketType.Challenge & Double = js.native
  
  @js.native
  sealed trait ChallengeReq
    extends StObject
       with EUdpPacketType
  /* 1 */ val ChallengeReq: typings.steamUser.mod.EUdpPacketType.ChallengeReq & Double = js.native
  
  @js.native
  sealed trait Connect
    extends StObject
       with EUdpPacketType
  /* 3 */ val Connect: typings.steamUser.mod.EUdpPacketType.Connect & Double = js.native
  
  @js.native
  sealed trait Data
    extends StObject
       with EUdpPacketType
  /* 6 */ val Data: typings.steamUser.mod.EUdpPacketType.Data & Double = js.native
  
  @js.native
  sealed trait Datagram
    extends StObject
       with EUdpPacketType
  /* 7 */ val Datagram: typings.steamUser.mod.EUdpPacketType.Datagram & Double = js.native
  
  @js.native
  sealed trait Disconnect
    extends StObject
       with EUdpPacketType
  /* 5 */ val Disconnect: typings.steamUser.mod.EUdpPacketType.Disconnect & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EUdpPacketType
  /* 0 */ val Invalid: typings.steamUser.mod.EUdpPacketType.Invalid & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EUdpPacketType
  /* 8 */ val Max: typings.steamUser.mod.EUdpPacketType.Max & Double = js.native
}
