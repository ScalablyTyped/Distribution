package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDenyReason extends js.Object

@JSImport("steam-client", "EDenyReason")
@js.native
object EDenyReason extends js.Object {
  @js.native
  sealed trait Cheater
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait Generic
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait IncompatibleAnticheat
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait IncompatibleSoftware
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait InvalidVersion
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait LoggedInElseWhere
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait MemoryCorruption
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait NoLicense
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait NotLoggedOn
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait SteamConnectionError
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait SteamConnectionLost
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait SteamOwnerLeftGuestUser
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait SteamResponseTimedOut
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait SteamValidationStalled
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  @js.native
  sealed trait UnknownText
    extends steamDashClientLib.steamDashClientMod.EDenyReason
  
  /* 5 */ val Cheater: Cheater with scala.Double = js.native
  /* 2 */ val Generic: Generic with scala.Double = js.native
  /* 8 */ val IncompatibleAnticheat: IncompatibleAnticheat with scala.Double = js.native
  /* 10 */ val IncompatibleSoftware: IncompatibleSoftware with scala.Double = js.native
  /* 1 */ val InvalidVersion: InvalidVersion with scala.Double = js.native
  /* 6 */ val LoggedInElseWhere: LoggedInElseWhere with scala.Double = js.native
  /* 9 */ val MemoryCorruption: MemoryCorruption with scala.Double = js.native
  /* 4 */ val NoLicense: NoLicense with scala.Double = js.native
  /* 3 */ val NotLoggedOn: NotLoggedOn with scala.Double = js.native
  /* 12 */ val SteamConnectionError: SteamConnectionError with scala.Double = js.native
  /* 11 */ val SteamConnectionLost: SteamConnectionLost with scala.Double = js.native
  /* 15 */ val SteamOwnerLeftGuestUser: SteamOwnerLeftGuestUser with scala.Double = js.native
  /* 13 */ val SteamResponseTimedOut: SteamResponseTimedOut with scala.Double = js.native
  /* 14 */ val SteamValidationStalled: SteamValidationStalled with scala.Double = js.native
  /* 7 */ val UnknownText: UnknownText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EDenyReason with scala.Double] = js.native
}

