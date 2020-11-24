package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMarketingMessageFlags extends js.Object
@JSImport("steam-client", "EMarketingMessageFlags")
@js.native
object EMarketingMessageFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMarketingMessageFlags with Double] = js.native
  
  @js.native
  sealed trait HighPriority extends EMarketingMessageFlags
  /* 1 */ @js.native
  object HighPriority extends TopLevel[HighPriority with Double]
  
  @js.native
  sealed trait None extends EMarketingMessageFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait PlatformLinux extends EMarketingMessageFlags
  /* 8 */ @js.native
  object PlatformLinux extends TopLevel[PlatformLinux with Double]
  
  @js.native
  sealed trait PlatformMac extends EMarketingMessageFlags
  /* 4 */ @js.native
  object PlatformMac extends TopLevel[PlatformMac with Double]
  
  @js.native
  sealed trait PlatformRestrictions extends EMarketingMessageFlags
  /* 2 | 4 | 8 */ @js.native
  object PlatformRestrictions extends TopLevel[PlatformRestrictions with Double]
  
  @js.native
  sealed trait PlatformWindows extends EMarketingMessageFlags
  /* 2 */ @js.native
  object PlatformWindows extends TopLevel[PlatformWindows with Double]
}
