package typings.steamDashClient.steamDashClientMod

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
  
  /* 5 */ val Cheater: typings.steamDashClient.steamDashClientMod.EDenyReason.Cheater with Double = js.native
  /* 2 */ val Generic: typings.steamDashClient.steamDashClientMod.EDenyReason.Generic with Double = js.native
  /* 8 */ val IncompatibleAnticheat: typings.steamDashClient.steamDashClientMod.EDenyReason.IncompatibleAnticheat with Double = js.native
  /* 10 */ val IncompatibleSoftware: typings.steamDashClient.steamDashClientMod.EDenyReason.IncompatibleSoftware with Double = js.native
  /* 1 */ val InvalidVersion: typings.steamDashClient.steamDashClientMod.EDenyReason.InvalidVersion with Double = js.native
  /* 6 */ val LoggedInElseWhere: typings.steamDashClient.steamDashClientMod.EDenyReason.LoggedInElseWhere with Double = js.native
  /* 9 */ val MemoryCorruption: typings.steamDashClient.steamDashClientMod.EDenyReason.MemoryCorruption with Double = js.native
  /* 4 */ val NoLicense: typings.steamDashClient.steamDashClientMod.EDenyReason.NoLicense with Double = js.native
  /* 3 */ val NotLoggedOn: typings.steamDashClient.steamDashClientMod.EDenyReason.NotLoggedOn with Double = js.native
  /* 12 */ val SteamConnectionError: typings.steamDashClient.steamDashClientMod.EDenyReason.SteamConnectionError with Double = js.native
  /* 11 */ val SteamConnectionLost: typings.steamDashClient.steamDashClientMod.EDenyReason.SteamConnectionLost with Double = js.native
  /* 15 */ val SteamOwnerLeftGuestUser: typings.steamDashClient.steamDashClientMod.EDenyReason.SteamOwnerLeftGuestUser with Double = js.native
  /* 13 */ val SteamResponseTimedOut: typings.steamDashClient.steamDashClientMod.EDenyReason.SteamResponseTimedOut with Double = js.native
  /* 14 */ val SteamValidationStalled: typings.steamDashClient.steamDashClientMod.EDenyReason.SteamValidationStalled with Double = js.native
  /* 7 */ val UnknownText: typings.steamDashClient.steamDashClientMod.EDenyReason.UnknownText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDenyReason with Double] = js.native
}

