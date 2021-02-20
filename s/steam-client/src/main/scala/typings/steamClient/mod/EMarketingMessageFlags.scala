package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMarketingMessageFlags extends StObject
@JSImport("steam-client", "EMarketingMessageFlags")
@js.native
object EMarketingMessageFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMarketingMessageFlags with Double] = js.native
  
  @js.native
  sealed trait HighPriority extends EMarketingMessageFlags
  /* 1 */ val HighPriority: typings.steamClient.mod.EMarketingMessageFlags.HighPriority with Double = js.native
  
  @js.native
  sealed trait None extends EMarketingMessageFlags
  /* 0 */ val None: typings.steamClient.mod.EMarketingMessageFlags.None with Double = js.native
  
  @js.native
  sealed trait PlatformLinux extends EMarketingMessageFlags
  /* 8 */ val PlatformLinux: typings.steamClient.mod.EMarketingMessageFlags.PlatformLinux with Double = js.native
  
  @js.native
  sealed trait PlatformMac extends EMarketingMessageFlags
  /* 4 */ val PlatformMac: typings.steamClient.mod.EMarketingMessageFlags.PlatformMac with Double = js.native
  
  @js.native
  sealed trait PlatformRestrictions extends EMarketingMessageFlags
  /* 2 | 4 | 8 */ val PlatformRestrictions: typings.steamClient.mod.EMarketingMessageFlags.PlatformRestrictions with Double = js.native
  
  @js.native
  sealed trait PlatformWindows extends EMarketingMessageFlags
  /* 2 */ val PlatformWindows: typings.steamClient.mod.EMarketingMessageFlags.PlatformWindows with Double = js.native
}
