package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDenyReason extends StObject
@JSImport("steam-user", "EDenyReason")
@js.native
object EDenyReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDenyReason & Double] = js.native
  
  @js.native
  sealed trait Cheater
    extends StObject
       with EDenyReason
  /* 5 */ val Cheater: typings.steamUser.mod.EDenyReason.Cheater & Double = js.native
  
  @js.native
  sealed trait Generic
    extends StObject
       with EDenyReason
  /* 2 */ val Generic: typings.steamUser.mod.EDenyReason.Generic & Double = js.native
  
  @js.native
  sealed trait IncompatibleAnticheat
    extends StObject
       with EDenyReason
  /* 8 */ val IncompatibleAnticheat: typings.steamUser.mod.EDenyReason.IncompatibleAnticheat & Double = js.native
  
  @js.native
  sealed trait IncompatibleSoftware
    extends StObject
       with EDenyReason
  /* 10 */ val IncompatibleSoftware: typings.steamUser.mod.EDenyReason.IncompatibleSoftware & Double = js.native
  
  @js.native
  sealed trait InvalidVersion
    extends StObject
       with EDenyReason
  /* 1 */ val InvalidVersion: typings.steamUser.mod.EDenyReason.InvalidVersion & Double = js.native
  
  @js.native
  sealed trait LoggedInElseWhere
    extends StObject
       with EDenyReason
  /* 6 */ val LoggedInElseWhere: typings.steamUser.mod.EDenyReason.LoggedInElseWhere & Double = js.native
  
  @js.native
  sealed trait MemoryCorruption
    extends StObject
       with EDenyReason
  /* 9 */ val MemoryCorruption: typings.steamUser.mod.EDenyReason.MemoryCorruption & Double = js.native
  
  @js.native
  sealed trait NoLicense
    extends StObject
       with EDenyReason
  /* 4 */ val NoLicense: typings.steamUser.mod.EDenyReason.NoLicense & Double = js.native
  
  @js.native
  sealed trait NotLoggedOn
    extends StObject
       with EDenyReason
  /* 3 */ val NotLoggedOn: typings.steamUser.mod.EDenyReason.NotLoggedOn & Double = js.native
  
  @js.native
  sealed trait SteamConnectionError
    extends StObject
       with EDenyReason
  /* 12 */ val SteamConnectionError: typings.steamUser.mod.EDenyReason.SteamConnectionError & Double = js.native
  
  @js.native
  sealed trait SteamConnectionLost
    extends StObject
       with EDenyReason
  /* 11 */ val SteamConnectionLost: typings.steamUser.mod.EDenyReason.SteamConnectionLost & Double = js.native
  
  @js.native
  sealed trait SteamOwnerLeftGuestUser
    extends StObject
       with EDenyReason
  /* 15 */ val SteamOwnerLeftGuestUser: typings.steamUser.mod.EDenyReason.SteamOwnerLeftGuestUser & Double = js.native
  
  @js.native
  sealed trait SteamResponseTimedOut
    extends StObject
       with EDenyReason
  /* 13 */ val SteamResponseTimedOut: typings.steamUser.mod.EDenyReason.SteamResponseTimedOut & Double = js.native
  
  @js.native
  sealed trait SteamValidationStalled
    extends StObject
       with EDenyReason
  /* 14 */ val SteamValidationStalled: typings.steamUser.mod.EDenyReason.SteamValidationStalled & Double = js.native
  
  @js.native
  sealed trait UnknownText
    extends StObject
       with EDenyReason
  /* 7 */ val UnknownText: typings.steamUser.mod.EDenyReason.UnknownText & Double = js.native
}
