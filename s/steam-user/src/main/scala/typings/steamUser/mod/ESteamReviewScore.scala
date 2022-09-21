package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESteamReviewScore extends StObject
@JSImport("steam-user", "ESteamReviewScore")
@js.native
object ESteamReviewScore extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESteamReviewScore & Double] = js.native
  
  @js.native
  sealed trait Mixed
    extends StObject
       with ESteamReviewScore
  /* 5 */ val Mixed: typings.steamUser.mod.ESteamReviewScore.Mixed & Double = js.native
  
  @js.native
  sealed trait MostlyNegative
    extends StObject
       with ESteamReviewScore
  /* 4 */ val MostlyNegative: typings.steamUser.mod.ESteamReviewScore.MostlyNegative & Double = js.native
  
  @js.native
  sealed trait MostlyPositive
    extends StObject
       with ESteamReviewScore
  /* 6 */ val MostlyPositive: typings.steamUser.mod.ESteamReviewScore.MostlyPositive & Double = js.native
  
  @js.native
  sealed trait Negative
    extends StObject
       with ESteamReviewScore
  /* 3 */ val Negative: typings.steamUser.mod.ESteamReviewScore.Negative & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ESteamReviewScore
  /* 0 */ val None: typings.steamUser.mod.ESteamReviewScore.None & Double = js.native
  
  @js.native
  sealed trait OverwhelminglyNegative
    extends StObject
       with ESteamReviewScore
  /* 1 */ val OverwhelminglyNegative: typings.steamUser.mod.ESteamReviewScore.OverwhelminglyNegative & Double = js.native
  
  @js.native
  sealed trait OverwhelminglyPositive
    extends StObject
       with ESteamReviewScore
  /* 9 */ val OverwhelminglyPositive: typings.steamUser.mod.ESteamReviewScore.OverwhelminglyPositive & Double = js.native
  
  @js.native
  sealed trait Positive
    extends StObject
       with ESteamReviewScore
  /* 7 */ val Positive: typings.steamUser.mod.ESteamReviewScore.Positive & Double = js.native
  
  @js.native
  sealed trait VeryNegative
    extends StObject
       with ESteamReviewScore
  /* 2 */ val VeryNegative: typings.steamUser.mod.ESteamReviewScore.VeryNegative & Double = js.native
  
  @js.native
  sealed trait VeryPositive
    extends StObject
       with ESteamReviewScore
  /* 8 */ val VeryPositive: typings.steamUser.mod.ESteamReviewScore.VeryPositive & Double = js.native
}
