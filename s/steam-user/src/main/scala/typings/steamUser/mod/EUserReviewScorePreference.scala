package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUserReviewScorePreference extends StObject
@JSImport("steam-user", "EUserReviewScorePreference")
@js.native
object EUserReviewScorePreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUserReviewScorePreference & Double] = js.native
  
  @js.native
  sealed trait ExcludeBombs
    extends StObject
       with EUserReviewScorePreference
  /* 2 */ val ExcludeBombs: typings.steamUser.mod.EUserReviewScorePreference.ExcludeBombs & Double = js.native
  
  @js.native
  sealed trait IncludeAll
    extends StObject
       with EUserReviewScorePreference
  /* 1 */ val IncludeAll: typings.steamUser.mod.EUserReviewScorePreference.IncludeAll & Double = js.native
  
  @js.native
  sealed trait Unset
    extends StObject
       with EUserReviewScorePreference
  /* 0 */ val Unset: typings.steamUser.mod.EUserReviewScorePreference.Unset & Double = js.native
}
