package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAppUsageEvent extends js.Object

@JSImport("steam-client", "EAppUsageEvent")
@js.native
object EAppUsageEvent extends js.Object {
  @js.native
  sealed trait GameLaunch extends EAppUsageEvent
  
  @js.native
  sealed trait GameLaunchFreeWeekend extends EAppUsageEvent
  
  @js.native
  sealed trait GameLaunchTrial extends EAppUsageEvent
  
  @js.native
  sealed trait InGameAdViewed extends EAppUsageEvent
  
  @js.native
  sealed trait MarketingMessageView extends EAppUsageEvent
  
  @js.native
  sealed trait Media extends EAppUsageEvent
  
  @js.native
  sealed trait PreloadFinish extends EAppUsageEvent
  
  @js.native
  sealed trait PreloadStart extends EAppUsageEvent
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppUsageEvent with Double] = js.native
  /* 1 */ @js.native
  object GameLaunch extends TopLevel[GameLaunch with Double]
  
  /* 8 */ @js.native
  object GameLaunchFreeWeekend extends TopLevel[GameLaunchFreeWeekend with Double]
  
  /* 2 */ @js.native
  object GameLaunchTrial extends TopLevel[GameLaunchTrial with Double]
  
  /* 7 */ @js.native
  object InGameAdViewed extends TopLevel[InGameAdViewed with Double]
  
  /* 6 */ @js.native
  object MarketingMessageView extends TopLevel[MarketingMessageView with Double]
  
  /* 3 */ @js.native
  object Media extends TopLevel[Media with Double]
  
  /* 5 */ @js.native
  object PreloadFinish extends TopLevel[PreloadFinish with Double]
  
  /* 4 */ @js.native
  object PreloadStart extends TopLevel[PreloadStart with Double]
  
}

