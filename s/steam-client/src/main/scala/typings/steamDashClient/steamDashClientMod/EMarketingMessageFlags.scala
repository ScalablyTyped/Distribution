package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EMarketingMessageFlags extends js.Object

@JSImport("steam-client", "EMarketingMessageFlags")
@js.native
object EMarketingMessageFlags extends js.Object {
  @js.native
  sealed trait HighPriority extends EMarketingMessageFlags
  
  @js.native
  sealed trait None extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformLinux extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformMac extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformRestrictions extends EMarketingMessageFlags
  
  @js.native
  sealed trait PlatformWindows extends EMarketingMessageFlags
  
  /* 1 */ val HighPriority: typings.steamDashClient.steamDashClientMod.EMarketingMessageFlags.HighPriority with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.EMarketingMessageFlags.None with Double = js.native
  /* 8 */ val PlatformLinux: typings.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformLinux with Double = js.native
  /* 4 */ val PlatformMac: typings.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformMac with Double = js.native
  /* 2 | 4 | 8 */ val PlatformRestrictions: typings.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformRestrictions with Double = js.native
  /* 2 */ val PlatformWindows: typings.steamDashClient.steamDashClientMod.EMarketingMessageFlags.PlatformWindows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMarketingMessageFlags with Double] = js.native
}

