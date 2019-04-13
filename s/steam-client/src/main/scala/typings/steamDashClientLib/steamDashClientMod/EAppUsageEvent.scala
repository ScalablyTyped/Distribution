package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAppUsageEvent extends js.Object

@JSImport("steam-client", "EAppUsageEvent")
@js.native
object EAppUsageEvent extends js.Object {
  @js.native
  sealed trait GameLaunch
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  @js.native
  sealed trait GameLaunchFreeWeekend
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  @js.native
  sealed trait GameLaunchTrial
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  @js.native
  sealed trait InGameAdViewed
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  @js.native
  sealed trait MarketingMessageView
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  @js.native
  sealed trait Media
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  @js.native
  sealed trait PreloadFinish
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  @js.native
  sealed trait PreloadStart
    extends steamDashClientLib.steamDashClientMod.EAppUsageEvent
  
  /* 1 */ val GameLaunch: GameLaunch with scala.Double = js.native
  /* 8 */ val GameLaunchFreeWeekend: GameLaunchFreeWeekend with scala.Double = js.native
  /* 2 */ val GameLaunchTrial: GameLaunchTrial with scala.Double = js.native
  /* 7 */ val InGameAdViewed: InGameAdViewed with scala.Double = js.native
  /* 6 */ val MarketingMessageView: MarketingMessageView with scala.Double = js.native
  /* 3 */ val Media: Media with scala.Double = js.native
  /* 5 */ val PreloadFinish: PreloadFinish with scala.Double = js.native
  /* 4 */ val PreloadStart: PreloadStart with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EAppUsageEvent with scala.Double] = js.native
}

