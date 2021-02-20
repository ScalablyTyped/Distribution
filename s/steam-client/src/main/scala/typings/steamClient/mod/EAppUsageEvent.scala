package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppUsageEvent extends StObject
@JSImport("steam-client", "EAppUsageEvent")
@js.native
object EAppUsageEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppUsageEvent with Double] = js.native
  
  @js.native
  sealed trait GameLaunch extends EAppUsageEvent
  /* 1 */ val GameLaunch: typings.steamClient.mod.EAppUsageEvent.GameLaunch with Double = js.native
  
  @js.native
  sealed trait GameLaunchFreeWeekend extends EAppUsageEvent
  /* 8 */ val GameLaunchFreeWeekend: typings.steamClient.mod.EAppUsageEvent.GameLaunchFreeWeekend with Double = js.native
  
  @js.native
  sealed trait GameLaunchTrial extends EAppUsageEvent
  /* 2 */ val GameLaunchTrial: typings.steamClient.mod.EAppUsageEvent.GameLaunchTrial with Double = js.native
  
  @js.native
  sealed trait InGameAdViewed extends EAppUsageEvent
  /* 7 */ val InGameAdViewed: typings.steamClient.mod.EAppUsageEvent.InGameAdViewed with Double = js.native
  
  @js.native
  sealed trait MarketingMessageView extends EAppUsageEvent
  /* 6 */ val MarketingMessageView: typings.steamClient.mod.EAppUsageEvent.MarketingMessageView with Double = js.native
  
  @js.native
  sealed trait Media extends EAppUsageEvent
  /* 3 */ val Media: typings.steamClient.mod.EAppUsageEvent.Media with Double = js.native
  
  @js.native
  sealed trait PreloadFinish extends EAppUsageEvent
  /* 5 */ val PreloadFinish: typings.steamClient.mod.EAppUsageEvent.PreloadFinish with Double = js.native
  
  @js.native
  sealed trait PreloadStart extends EAppUsageEvent
  /* 4 */ val PreloadStart: typings.steamClient.mod.EAppUsageEvent.PreloadStart with Double = js.native
}
