package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardUploadScoreMethod extends js.Object

@JSImport("steam-client", "ELeaderboardUploadScoreMethod")
@js.native
object ELeaderboardUploadScoreMethod extends js.Object {
  @js.native
  sealed trait ForceUpdate extends ELeaderboardUploadScoreMethod
  
  @js.native
  sealed trait KeepBest extends ELeaderboardUploadScoreMethod
  
  @js.native
  sealed trait None extends ELeaderboardUploadScoreMethod
  
  /* 2 */ val ForceUpdate: typings.steamDashClient.steamDashClientMod.ELeaderboardUploadScoreMethod.ForceUpdate with Double = js.native
  /* 1 */ val KeepBest: typings.steamDashClient.steamDashClientMod.ELeaderboardUploadScoreMethod.KeepBest with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.ELeaderboardUploadScoreMethod.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardUploadScoreMethod with Double] = js.native
}

