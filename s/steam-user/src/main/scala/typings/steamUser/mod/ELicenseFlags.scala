package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseFlags extends StObject
@JSImport("steam-user", "ELicenseFlags")
@js.native
object ELicenseFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags & Double] = js.native
  
  @js.native
  sealed trait CancelledByAdmin
    extends StObject
       with ELicenseFlags
  /* 32 */ val CancelledByAdmin: typings.steamUser.mod.ELicenseFlags.CancelledByAdmin & Double = js.native
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock
    extends StObject
       with ELicenseFlags
  /* 1024 */ val CancelledByFriendlyFraudLock: typings.steamUser.mod.ELicenseFlags.CancelledByFriendlyFraudLock & Double = js.native
  
  @js.native
  sealed trait CancelledByUser
    extends StObject
       with ELicenseFlags
  /* 16 */ val CancelledByUser: typings.steamUser.mod.ELicenseFlags.CancelledByUser & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with ELicenseFlags
  /* 8 */ val Expired: typings.steamUser.mod.ELicenseFlags.Expired & Double = js.native
  
  @js.native
  sealed trait ForceRunRestriction
    extends StObject
       with ELicenseFlags
  /* 256 */ val ForceRunRestriction: typings.steamUser.mod.ELicenseFlags.ForceRunRestriction & Double = js.native
  
  @js.native
  sealed trait ImportedFromSteam2
    extends StObject
       with ELicenseFlags
  /* 128 */ val ImportedFromSteam2: typings.steamUser.mod.ELicenseFlags.ImportedFromSteam2 & Double = js.native
  
  @js.native
  sealed trait LowViolenceContent
    extends StObject
       with ELicenseFlags
  /* 64 */ val LowViolenceContent: typings.steamUser.mod.ELicenseFlags.LowViolenceContent & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ELicenseFlags
  /* 0 */ val None: typings.steamUser.mod.ELicenseFlags.None & Double = js.native
  
  @js.native
  sealed trait NotActivated
    extends StObject
       with ELicenseFlags
  /* 2048 */ val NotActivated: typings.steamUser.mod.ELicenseFlags.NotActivated & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with ELicenseFlags
  /* 4 */ val Pending: typings.steamUser.mod.ELicenseFlags.Pending & Double = js.native
  
  @js.native
  sealed trait RegionRestrictionExpired
    extends StObject
       with ELicenseFlags
  /* 512 */ val RegionRestrictionExpired: typings.steamUser.mod.ELicenseFlags.RegionRestrictionExpired & Double = js.native
  
  @js.native
  sealed trait Renew
    extends StObject
       with ELicenseFlags
  /* 1 */ val Renew: typings.steamUser.mod.ELicenseFlags.Renew & Double = js.native
  
  @js.native
  sealed trait RenewalFailed
    extends StObject
       with ELicenseFlags
  /* 2 */ val RenewalFailed: typings.steamUser.mod.ELicenseFlags.RenewalFailed & Double = js.native
}
