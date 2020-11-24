package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDenyReason extends js.Object
@JSImport("steam-client", "EDenyReason")
@js.native
object EDenyReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDenyReason with Double] = js.native
  
  @js.native
  sealed trait Cheater extends EDenyReason
  /* 5 */ @js.native
  object Cheater extends TopLevel[Cheater with Double]
  
  @js.native
  sealed trait Generic extends EDenyReason
  /* 2 */ @js.native
  object Generic extends TopLevel[Generic with Double]
  
  @js.native
  sealed trait IncompatibleAnticheat extends EDenyReason
  /* 8 */ @js.native
  object IncompatibleAnticheat extends TopLevel[IncompatibleAnticheat with Double]
  
  @js.native
  sealed trait IncompatibleSoftware extends EDenyReason
  /* 10 */ @js.native
  object IncompatibleSoftware extends TopLevel[IncompatibleSoftware with Double]
  
  @js.native
  sealed trait InvalidVersion extends EDenyReason
  /* 1 */ @js.native
  object InvalidVersion extends TopLevel[InvalidVersion with Double]
  
  @js.native
  sealed trait LoggedInElseWhere extends EDenyReason
  /* 6 */ @js.native
  object LoggedInElseWhere extends TopLevel[LoggedInElseWhere with Double]
  
  @js.native
  sealed trait MemoryCorruption extends EDenyReason
  /* 9 */ @js.native
  object MemoryCorruption extends TopLevel[MemoryCorruption with Double]
  
  @js.native
  sealed trait NoLicense extends EDenyReason
  /* 4 */ @js.native
  object NoLicense extends TopLevel[NoLicense with Double]
  
  @js.native
  sealed trait NotLoggedOn extends EDenyReason
  /* 3 */ @js.native
  object NotLoggedOn extends TopLevel[NotLoggedOn with Double]
  
  @js.native
  sealed trait SteamConnectionError extends EDenyReason
  /* 12 */ @js.native
  object SteamConnectionError extends TopLevel[SteamConnectionError with Double]
  
  @js.native
  sealed trait SteamConnectionLost extends EDenyReason
  /* 11 */ @js.native
  object SteamConnectionLost extends TopLevel[SteamConnectionLost with Double]
  
  @js.native
  sealed trait SteamOwnerLeftGuestUser extends EDenyReason
  /* 15 */ @js.native
  object SteamOwnerLeftGuestUser extends TopLevel[SteamOwnerLeftGuestUser with Double]
  
  @js.native
  sealed trait SteamResponseTimedOut extends EDenyReason
  /* 13 */ @js.native
  object SteamResponseTimedOut extends TopLevel[SteamResponseTimedOut with Double]
  
  @js.native
  sealed trait SteamValidationStalled extends EDenyReason
  /* 14 */ @js.native
  object SteamValidationStalled extends TopLevel[SteamValidationStalled with Double]
  
  @js.native
  sealed trait UnknownText extends EDenyReason
  /* 7 */ @js.native
  object UnknownText extends TopLevel[UnknownText with Double]
}
