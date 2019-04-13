package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAccountType extends js.Object

@JSImport("steam-client", "EAccountType")
@js.native
object EAccountType extends js.Object {
  @js.native
  sealed trait AnonGameServer
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait AnonUser
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait Chat
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait Clan
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait ConsoleUser
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait ContentServer
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait GameServer
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait Individual
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait Multiseat
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  @js.native
  sealed trait Pending
    extends steamDashClientLib.steamDashClientMod.EAccountType
  
  /* 4 */ val AnonGameServer: AnonGameServer with scala.Double = js.native
  /* 10 */ val AnonUser: AnonUser with scala.Double = js.native
  /* 8 */ val Chat: Chat with scala.Double = js.native
  /* 7 */ val Clan: Clan with scala.Double = js.native
  /* 9 */ val ConsoleUser: ConsoleUser with scala.Double = js.native
  /* 6 */ val ContentServer: ContentServer with scala.Double = js.native
  /* 3 */ val GameServer: GameServer with scala.Double = js.native
  /* 1 */ val Individual: Individual with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 11 */ val Max: Max with scala.Double = js.native
  /* 2 */ val Multiseat: Multiseat with scala.Double = js.native
  /* 5 */ val Pending: Pending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EAccountType with scala.Double] = js.native
}

