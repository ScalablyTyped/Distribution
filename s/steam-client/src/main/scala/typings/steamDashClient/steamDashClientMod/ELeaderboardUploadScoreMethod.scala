package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.ELeaderboardUploadScoreMethod.ForceUpdate
import typings.steamDashClient.steamDashClientMod.ELeaderboardUploadScoreMethod.KeepBest
import typings.steamDashClient.steamDashClientMod.ELeaderboardUploadScoreMethod.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardUploadScoreMethod with Double] = js.native
  /* 2 */ @js.native
  object ForceUpdate extends TopLevel[ForceUpdate with Double]
  
  /* 1 */ @js.native
  object KeepBest extends TopLevel[KeepBest with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

