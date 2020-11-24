package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardDataRequest extends js.Object
@JSImport("steam-client", "ELeaderboardDataRequest")
@js.native
object ELeaderboardDataRequest extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardDataRequest with Double] = js.native
  
  @js.native
  sealed trait Friends extends ELeaderboardDataRequest
  /* 2 */ @js.native
  object Friends extends TopLevel[Friends with Double]
  
  @js.native
  sealed trait Global extends ELeaderboardDataRequest
  /* 0 */ @js.native
  object Global extends TopLevel[Global with Double]
  
  @js.native
  sealed trait GlobalAroundUser extends ELeaderboardDataRequest
  /* 1 */ @js.native
  object GlobalAroundUser extends TopLevel[GlobalAroundUser with Double]
  
  @js.native
  sealed trait Users extends ELeaderboardDataRequest
  /* 3 */ @js.native
  object Users extends TopLevel[Users with Double]
}
