package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardSortMethod extends js.Object

@JSImport("steam-client", "ELeaderboardSortMethod")
@js.native
object ELeaderboardSortMethod extends js.Object {
  @js.native
  sealed trait Ascending extends ELeaderboardSortMethod
  
  @js.native
  sealed trait Descending extends ELeaderboardSortMethod
  
  @js.native
  sealed trait None extends ELeaderboardSortMethod
  
  /* 1 */ val Ascending: typings.steamDashClient.steamDashClientMod.ELeaderboardSortMethod.Ascending with Double = js.native
  /* 2 */ val Descending: typings.steamDashClient.steamDashClientMod.ELeaderboardSortMethod.Descending with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.ELeaderboardSortMethod.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardSortMethod with Double] = js.native
}

