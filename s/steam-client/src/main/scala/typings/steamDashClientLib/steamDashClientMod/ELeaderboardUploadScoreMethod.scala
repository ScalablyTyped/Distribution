package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELeaderboardUploadScoreMethod extends js.Object

@JSImport("steam-client", "ELeaderboardUploadScoreMethod")
@js.native
object ELeaderboardUploadScoreMethod extends js.Object {
  @js.native
  sealed trait ForceUpdate
    extends steamDashClientLib.steamDashClientMod.ELeaderboardUploadScoreMethod
  
  @js.native
  sealed trait KeepBest
    extends steamDashClientLib.steamDashClientMod.ELeaderboardUploadScoreMethod
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.ELeaderboardUploadScoreMethod
  
  /* 2 */ val ForceUpdate: ForceUpdate with scala.Double = js.native
  /* 1 */ val KeepBest: KeepBest with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    steamDashClientLib.steamDashClientMod.ELeaderboardUploadScoreMethod with scala.Double
  ] = js.native
}

