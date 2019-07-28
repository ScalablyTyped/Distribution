package typings.steamDashClient.steamDashClientMod

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
  
  /* 1 */ val GameLaunch: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.GameLaunch with Double = js.native
  /* 8 */ val GameLaunchFreeWeekend: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.GameLaunchFreeWeekend with Double = js.native
  /* 2 */ val GameLaunchTrial: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.GameLaunchTrial with Double = js.native
  /* 7 */ val InGameAdViewed: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.InGameAdViewed with Double = js.native
  /* 6 */ val MarketingMessageView: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.MarketingMessageView with Double = js.native
  /* 3 */ val Media: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.Media with Double = js.native
  /* 5 */ val PreloadFinish: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.PreloadFinish with Double = js.native
  /* 4 */ val PreloadStart: typings.steamDashClient.steamDashClientMod.EAppUsageEvent.PreloadStart with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppUsageEvent with Double] = js.native
}

