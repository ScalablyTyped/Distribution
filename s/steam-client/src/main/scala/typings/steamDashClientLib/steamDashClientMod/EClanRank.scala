package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanRank extends js.Object

@JSImport("steam-client", "EClanRank")
@js.native
object EClanRank extends js.Object {
  @js.native
  sealed trait Member
    extends steamDashClientLib.steamDashClientMod.EClanRank
  
  @js.native
  sealed trait Moderator
    extends steamDashClientLib.steamDashClientMod.EClanRank
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.EClanRank
  
  @js.native
  sealed trait Officer
    extends steamDashClientLib.steamDashClientMod.EClanRank
  
  @js.native
  sealed trait Owner
    extends steamDashClientLib.steamDashClientMod.EClanRank
  
  /* 3 */ val Member: Member with scala.Double = js.native
  /* 4 */ val Moderator: Moderator with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Officer: Officer with scala.Double = js.native
  /* 1 */ val Owner: Owner with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EClanRank with scala.Double] = js.native
}

