package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMarketingMessageFlags with Double] = js.native
  /* 1 */ @js.native
  object HighPriority extends TopLevel[HighPriority with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 8 */ @js.native
  object PlatformLinux extends TopLevel[PlatformLinux with Double]
  
  /* 4 */ @js.native
  object PlatformMac extends TopLevel[PlatformMac with Double]
  
  /* 2 | 4 | 8 */ @js.native
  object PlatformRestrictions extends TopLevel[PlatformRestrictions with Double]
  
  /* 2 */ @js.native
  object PlatformWindows extends TopLevel[PlatformWindows with Double]
  
}

