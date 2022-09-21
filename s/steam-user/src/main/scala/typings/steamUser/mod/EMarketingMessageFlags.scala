package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMarketingMessageFlags extends StObject
@JSImport("steam-user", "EMarketingMessageFlags")
@js.native
object EMarketingMessageFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMarketingMessageFlags & Double] = js.native
  
  @js.native
  sealed trait HighPriority
    extends StObject
       with EMarketingMessageFlags
  /* 1 */ val HighPriority: typings.steamUser.mod.EMarketingMessageFlags.HighPriority & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EMarketingMessageFlags
  /* 0 */ val None: typings.steamUser.mod.EMarketingMessageFlags.None & Double = js.native
  
  @js.native
  sealed trait PlatformLinux
    extends StObject
       with EMarketingMessageFlags
  /* 8 */ val PlatformLinux: typings.steamUser.mod.EMarketingMessageFlags.PlatformLinux & Double = js.native
  
  @js.native
  sealed trait PlatformMac
    extends StObject
       with EMarketingMessageFlags
  /* 4 */ val PlatformMac: typings.steamUser.mod.EMarketingMessageFlags.PlatformMac & Double = js.native
  
  @js.native
  sealed trait PlatformWindows
    extends StObject
       with EMarketingMessageFlags
  /* 2 */ val PlatformWindows: typings.steamUser.mod.EMarketingMessageFlags.PlatformWindows & Double = js.native
}
