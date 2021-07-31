package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMarketingMessageFlags extends StObject
@JSImport("steam-client", "EMarketingMessageFlags")
@js.native
object EMarketingMessageFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMarketingMessageFlags & Double] = js.native
  
  @js.native
  sealed trait HighPriority
    extends StObject
       with EMarketingMessageFlags
  /* 1 */ val HighPriority: typings.steamClient.mod.EMarketingMessageFlags.HighPriority & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EMarketingMessageFlags
  /* 0 */ val None: typings.steamClient.mod.EMarketingMessageFlags.None & Double = js.native
  
  @js.native
  sealed trait PlatformLinux
    extends StObject
       with EMarketingMessageFlags
  /* 8 */ val PlatformLinux: typings.steamClient.mod.EMarketingMessageFlags.PlatformLinux & Double = js.native
  
  @js.native
  sealed trait PlatformMac
    extends StObject
       with EMarketingMessageFlags
  /* 4 */ val PlatformMac: typings.steamClient.mod.EMarketingMessageFlags.PlatformMac & Double = js.native
  
  @js.native
  sealed trait PlatformRestrictions
    extends StObject
       with EMarketingMessageFlags
  /* 2 | 4 | 8 */ val PlatformRestrictions: typings.steamClient.mod.EMarketingMessageFlags.PlatformRestrictions & Double = js.native
  
  @js.native
  sealed trait PlatformWindows
    extends StObject
       with EMarketingMessageFlags
  /* 2 */ val PlatformWindows: typings.steamClient.mod.EMarketingMessageFlags.PlatformWindows & Double = js.native
}
