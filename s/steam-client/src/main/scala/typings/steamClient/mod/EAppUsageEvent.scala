package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppUsageEvent extends js.Object
@JSImport("steam-client", "EAppUsageEvent")
@js.native
object EAppUsageEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppUsageEvent with Double] = js.native
  
  @js.native
  sealed trait GameLaunch extends EAppUsageEvent
  /* 1 */ @js.native
  object GameLaunch extends TopLevel[GameLaunch with Double]
  
  @js.native
  sealed trait GameLaunchFreeWeekend extends EAppUsageEvent
  /* 8 */ @js.native
  object GameLaunchFreeWeekend extends TopLevel[GameLaunchFreeWeekend with Double]
  
  @js.native
  sealed trait GameLaunchTrial extends EAppUsageEvent
  /* 2 */ @js.native
  object GameLaunchTrial extends TopLevel[GameLaunchTrial with Double]
  
  @js.native
  sealed trait InGameAdViewed extends EAppUsageEvent
  /* 7 */ @js.native
  object InGameAdViewed extends TopLevel[InGameAdViewed with Double]
  
  @js.native
  sealed trait MarketingMessageView extends EAppUsageEvent
  /* 6 */ @js.native
  object MarketingMessageView extends TopLevel[MarketingMessageView with Double]
  
  @js.native
  sealed trait Media extends EAppUsageEvent
  /* 3 */ @js.native
  object Media extends TopLevel[Media with Double]
  
  @js.native
  sealed trait PreloadFinish extends EAppUsageEvent
  /* 5 */ @js.native
  object PreloadFinish extends TopLevel[PreloadFinish with Double]
  
  @js.native
  sealed trait PreloadStart extends EAppUsageEvent
  /* 4 */ @js.native
  object PreloadStart extends TopLevel[PreloadStart with Double]
}
