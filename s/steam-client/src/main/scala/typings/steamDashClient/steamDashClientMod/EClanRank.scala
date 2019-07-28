package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClanRank extends js.Object

@JSImport("steam-client", "EClanRank")
@js.native
object EClanRank extends js.Object {
  @js.native
  sealed trait Member extends EClanRank
  
  @js.native
  sealed trait Moderator extends EClanRank
  
  @js.native
  sealed trait None extends EClanRank
  
  @js.native
  sealed trait Officer extends EClanRank
  
  @js.native
  sealed trait Owner extends EClanRank
  
  /* 3 */ val Member: typings.steamDashClient.steamDashClientMod.EClanRank.Member with Double = js.native
  /* 4 */ val Moderator: typings.steamDashClient.steamDashClientMod.EClanRank.Moderator with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.EClanRank.None with Double = js.native
  /* 2 */ val Officer: typings.steamDashClient.steamDashClientMod.EClanRank.Officer with Double = js.native
  /* 1 */ val Owner: typings.steamDashClient.steamDashClientMod.EClanRank.Owner with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClanRank with Double] = js.native
}

