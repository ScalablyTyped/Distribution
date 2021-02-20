package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardDataRequest extends StObject
@JSImport("steam-client", "ELeaderboardDataRequest")
@js.native
object ELeaderboardDataRequest extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDataRequest with Double] = js.native
  
  @js.native
  sealed trait Friends extends ELeaderboardDataRequest
  /* 2 */ val Friends: typings.steamClient.mod.ELeaderboardDataRequest.Friends with Double = js.native
  
  @js.native
  sealed trait Global extends ELeaderboardDataRequest
  /* 0 */ val Global: typings.steamClient.mod.ELeaderboardDataRequest.Global with Double = js.native
  
  @js.native
  sealed trait GlobalAroundUser extends ELeaderboardDataRequest
  /* 1 */ val GlobalAroundUser: typings.steamClient.mod.ELeaderboardDataRequest.GlobalAroundUser with Double = js.native
  
  @js.native
  sealed trait Users extends ELeaderboardDataRequest
  /* 3 */ val Users: typings.steamClient.mod.ELeaderboardDataRequest.Users with Double = js.native
}
