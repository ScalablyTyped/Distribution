package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDataRequest with Double] = js.native
  /* 2 */ @js.native
  object Friends extends TopLevel[Friends with Double]
  
  /* 0 */ @js.native
  object Global extends TopLevel[Global with Double]
  
  /* 1 */ @js.native
  object GlobalAroundUser extends TopLevel[GlobalAroundUser with Double]
  
  /* 3 */ @js.native
  object Users extends TopLevel[Users with Double]
  
}

