package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMarketingMessageFlags extends js.Object

@JSImport("steam-client", "EMarketingMessageFlags")
@js.native
object EMarketingMessageFlags extends js.Object {
  @js.native
  sealed trait HighPriority
    extends steamDashClientLib.steamDashClientMod.EMarketingMessageFlags
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformLinux
    extends steamDashClientLib.steamDashClientMod.EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformMac
    extends steamDashClientLib.steamDashClientMod.EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformRestrictions
    extends steamDashClientLib.steamDashClientMod.EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformWindows
    extends steamDashClientLib.steamDashClientMod.EMarketingMessageFlags
  
  /* 1 */ val HighPriority: HighPriority with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8 */ val PlatformLinux: PlatformLinux with scala.Double = js.native
  /* 4 */ val PlatformMac: PlatformMac with scala.Double = js.native
  /* PlatformWindows | PlatformMac | PlatformLinux */ val PlatformRestrictions: PlatformRestrictions with scala.Double = js.native
  /* 2 */ val PlatformWindows: PlatformWindows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EMarketingMessageFlags with scala.Double] = js.native
}

