package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELeaderboardUploadScoreMethod extends js.Object
@JSImport("steam-client", "ELeaderboardUploadScoreMethod")
@js.native
object ELeaderboardUploadScoreMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELeaderboardUploadScoreMethod with Double] = js.native
  
  @js.native
  sealed trait ForceUpdate extends ELeaderboardUploadScoreMethod
  /* 2 */ @js.native
  object ForceUpdate extends TopLevel[ForceUpdate with Double]
  
  @js.native
  sealed trait KeepBest extends ELeaderboardUploadScoreMethod
  /* 1 */ @js.native
  object KeepBest extends TopLevel[KeepBest with Double]
  
  @js.native
  sealed trait None extends ELeaderboardUploadScoreMethod
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
