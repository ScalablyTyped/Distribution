package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDenyReason extends js.Object

@JSImport("steam-client", "EDenyReason")
@js.native
object EDenyReason extends js.Object {
  @js.native
  sealed trait Cheater extends EDenyReason
  
  @js.native
  sealed trait Generic extends EDenyReason
  
  @js.native
  sealed trait IncompatibleAnticheat extends EDenyReason
  
  @js.native
  sealed trait IncompatibleSoftware extends EDenyReason
  
  @js.native
  sealed trait InvalidVersion extends EDenyReason
  
  @js.native
  sealed trait LoggedInElseWhere extends EDenyReason
  
  @js.native
  sealed trait MemoryCorruption extends EDenyReason
  
  @js.native
  sealed trait NoLicense extends EDenyReason
  
  @js.native
  sealed trait NotLoggedOn extends EDenyReason
  
  @js.native
  sealed trait SteamConnectionError extends EDenyReason
  
  @js.native
  sealed trait SteamConnectionLost extends EDenyReason
  
  @js.native
  sealed trait SteamOwnerLeftGuestUser extends EDenyReason
  
  @js.native
  sealed trait SteamResponseTimedOut extends EDenyReason
  
  @js.native
  sealed trait SteamValidationStalled extends EDenyReason
  
  @js.native
  sealed trait UnknownText extends EDenyReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDenyReason with Double] = js.native
  /* 5 */ @js.native
  object Cheater extends TopLevel[Cheater with Double]
  
  /* 2 */ @js.native
  object Generic extends TopLevel[Generic with Double]
  
  /* 8 */ @js.native
  object IncompatibleAnticheat extends TopLevel[IncompatibleAnticheat with Double]
  
  /* 10 */ @js.native
  object IncompatibleSoftware extends TopLevel[IncompatibleSoftware with Double]
  
  /* 1 */ @js.native
  object InvalidVersion extends TopLevel[InvalidVersion with Double]
  
  /* 6 */ @js.native
  object LoggedInElseWhere extends TopLevel[LoggedInElseWhere with Double]
  
  /* 9 */ @js.native
  object MemoryCorruption extends TopLevel[MemoryCorruption with Double]
  
  /* 4 */ @js.native
  object NoLicense extends TopLevel[NoLicense with Double]
  
  /* 3 */ @js.native
  object NotLoggedOn extends TopLevel[NotLoggedOn with Double]
  
  /* 12 */ @js.native
  object SteamConnectionError extends TopLevel[SteamConnectionError with Double]
  
  /* 11 */ @js.native
  object SteamConnectionLost extends TopLevel[SteamConnectionLost with Double]
  
  /* 15 */ @js.native
  object SteamOwnerLeftGuestUser extends TopLevel[SteamOwnerLeftGuestUser with Double]
  
  /* 13 */ @js.native
  object SteamResponseTimedOut extends TopLevel[SteamResponseTimedOut with Double]
  
  /* 14 */ @js.native
  object SteamValidationStalled extends TopLevel[SteamValidationStalled with Double]
  
  /* 7 */ @js.native
  object UnknownText extends TopLevel[UnknownText with Double]
  
}

