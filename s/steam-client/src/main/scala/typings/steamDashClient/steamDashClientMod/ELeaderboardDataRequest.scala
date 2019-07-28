package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardDataRequest extends js.Object

@JSImport("steam-client", "ELeaderboardDataRequest")
@js.native
object ELeaderboardDataRequest extends js.Object {
  @js.native
  sealed trait Friends extends ELeaderboardDataRequest
  
  @js.native
  sealed trait Global extends ELeaderboardDataRequest
  
  @js.native
  sealed trait GlobalAroundUser extends ELeaderboardDataRequest
  
  @js.native
  sealed trait Users extends ELeaderboardDataRequest
  
  /* 2 */ val Friends: typings.steamDashClient.steamDashClientMod.ELeaderboardDataRequest.Friends with Double = js.native
  /* 0 */ val Global: typings.steamDashClient.steamDashClientMod.ELeaderboardDataRequest.Global with Double = js.native
  /* 1 */ val GlobalAroundUser: typings.steamDashClient.steamDashClientMod.ELeaderboardDataRequest.GlobalAroundUser with Double = js.native
  /* 3 */ val Users: typings.steamDashClient.steamDashClientMod.ELeaderboardDataRequest.Users with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDataRequest with Double] = js.native
}

