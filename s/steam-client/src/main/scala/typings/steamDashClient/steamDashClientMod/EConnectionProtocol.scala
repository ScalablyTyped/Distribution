package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EConnectionProtocol.TCP
import typings.steamDashClient.steamDashClientMod.EConnectionProtocol.UDP
import typings.steamDashClient.steamDashClientMod.EConnectionProtocol.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EConnectionProtocol extends js.Object

@JSImport("steam-client", "EConnectionProtocol")
@js.native
object EConnectionProtocol extends js.Object {
  @js.native
  sealed trait TCP extends EConnectionProtocol
  
  @js.native
  sealed trait UDP extends EConnectionProtocol
  
  @js.native
  sealed trait WebSocket extends EConnectionProtocol
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EConnectionProtocol with Double] = js.native
  /* 1 */ @js.native
  object TCP extends TopLevel[TCP with Double]
  
  /* 2 */ @js.native
  object UDP extends TopLevel[UDP with Double]
  
  /* 3 */ @js.native
  object WebSocket extends TopLevel[WebSocket with Double]
  
}

