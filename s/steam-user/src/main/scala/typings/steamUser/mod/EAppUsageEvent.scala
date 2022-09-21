package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppUsageEvent extends StObject
@JSImport("steam-user", "EAppUsageEvent")
@js.native
object EAppUsageEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppUsageEvent & Double] = js.native
  
  @js.native
  sealed trait GameLaunch
    extends StObject
       with EAppUsageEvent
  /* 1 */ val GameLaunch: typings.steamUser.mod.EAppUsageEvent.GameLaunch & Double = js.native
  
  @js.native
  sealed trait GameLaunchFreeWeekend
    extends StObject
       with EAppUsageEvent
  /* 8 */ val GameLaunchFreeWeekend: typings.steamUser.mod.EAppUsageEvent.GameLaunchFreeWeekend & Double = js.native
  
  @js.native
  sealed trait GameLaunchTrial
    extends StObject
       with EAppUsageEvent
  /* 2 */ val GameLaunchTrial: typings.steamUser.mod.EAppUsageEvent.GameLaunchTrial & Double = js.native
  
  @js.native
  sealed trait InGameAdViewed
    extends StObject
       with EAppUsageEvent
  /* 7 */ val InGameAdViewed: typings.steamUser.mod.EAppUsageEvent.InGameAdViewed & Double = js.native
  
  @js.native
  sealed trait MarketingMessageView
    extends StObject
       with EAppUsageEvent
  /* 6 */ val MarketingMessageView: typings.steamUser.mod.EAppUsageEvent.MarketingMessageView & Double = js.native
  
  @js.native
  sealed trait Media
    extends StObject
       with EAppUsageEvent
  /* 3 */ val Media: typings.steamUser.mod.EAppUsageEvent.Media & Double = js.native
  
  @js.native
  sealed trait PreloadFinish
    extends StObject
       with EAppUsageEvent
  /* 5 */ val PreloadFinish: typings.steamUser.mod.EAppUsageEvent.PreloadFinish & Double = js.native
  
  @js.native
  sealed trait PreloadStart
    extends StObject
       with EAppUsageEvent
  /* 4 */ val PreloadStart: typings.steamUser.mod.EAppUsageEvent.PreloadStart & Double = js.native
}
