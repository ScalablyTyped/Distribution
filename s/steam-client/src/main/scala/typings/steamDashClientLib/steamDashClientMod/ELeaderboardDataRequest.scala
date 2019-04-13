package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardDataRequest extends js.Object

@JSImport("steam-client", "ELeaderboardDataRequest")
@js.native
object ELeaderboardDataRequest extends js.Object {
  @js.native
  sealed trait Friends
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDataRequest
  
  @js.native
  sealed trait Global
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDataRequest
  
  @js.native
  sealed trait GlobalAroundUser
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDataRequest
  
  @js.native
  sealed trait Users
    extends steamDashClientLib.steamDashClientMod.ELeaderboardDataRequest
  
  /* 2 */ val Friends: Friends with scala.Double = js.native
  /* 0 */ val Global: Global with scala.Double = js.native
  /* 1 */ val GlobalAroundUser: GlobalAroundUser with scala.Double = js.native
  /* 3 */ val Users: Users with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ELeaderboardDataRequest with scala.Double] = js.native
}

