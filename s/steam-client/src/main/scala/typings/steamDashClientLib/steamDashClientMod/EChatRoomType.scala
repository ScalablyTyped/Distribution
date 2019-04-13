package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatRoomType extends js.Object

@JSImport("steam-client", "EChatRoomType")
@js.native
object EChatRoomType extends js.Object {
  @js.native
  sealed trait Friend
    extends steamDashClientLib.steamDashClientMod.EChatRoomType
  
  @js.native
  sealed trait Lobby
    extends steamDashClientLib.steamDashClientMod.EChatRoomType
  
  @js.native
  sealed trait MUC
    extends steamDashClientLib.steamDashClientMod.EChatRoomType
  
  /* 1 */ val Friend: Friend with scala.Double = js.native
  /* 3 */ val Lobby: Lobby with scala.Double = js.native
  /* 2 */ val MUC: MUC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatRoomType with scala.Double] = js.native
}

