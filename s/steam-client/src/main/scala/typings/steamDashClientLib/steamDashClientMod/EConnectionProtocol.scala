package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EConnectionProtocol extends js.Object

@JSImport("steam-client", "EConnectionProtocol")
@js.native
object EConnectionProtocol extends js.Object {
  @js.native
  sealed trait TCP
    extends steamDashClientLib.steamDashClientMod.EConnectionProtocol
  
  @js.native
  sealed trait UDP
    extends steamDashClientLib.steamDashClientMod.EConnectionProtocol
  
  @js.native
  sealed trait WebSocket
    extends steamDashClientLib.steamDashClientMod.EConnectionProtocol
  
  /* 1 */ val TCP: TCP with scala.Double = js.native
  /* 2 */ val UDP: UDP with scala.Double = js.native
  /* 3 */ val WebSocket: WebSocket with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EConnectionProtocol with scala.Double] = js.native
}

