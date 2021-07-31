package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseFlags extends StObject
@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags & Double] = js.native
  
  @js.native
  sealed trait CancelledByAdmin
    extends StObject
       with ELicenseFlags
  /* 0x20 */ val CancelledByAdmin: typings.steamClient.mod.ELicenseFlags.CancelledByAdmin & Double = js.native
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock
    extends StObject
       with ELicenseFlags
  /* 0x400 */ val CancelledByFriendlyFraudLock: typings.steamClient.mod.ELicenseFlags.CancelledByFriendlyFraudLock & Double = js.native
  
  @js.native
  sealed trait CancelledByUser
    extends StObject
       with ELicenseFlags
  /* 0x10 */ val CancelledByUser: typings.steamClient.mod.ELicenseFlags.CancelledByUser & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with ELicenseFlags
  /* 0x08 */ val Expired: typings.steamClient.mod.ELicenseFlags.Expired & Double = js.native
  
  @js.native
  sealed trait ForceRunRestriction
    extends StObject
       with ELicenseFlags
  /* 0x100 */ val ForceRunRestriction: typings.steamClient.mod.ELicenseFlags.ForceRunRestriction & Double = js.native
  
  @js.native
  sealed trait ImportedFromSteam2
    extends StObject
       with ELicenseFlags
  /* 0x80 */ val ImportedFromSteam2: typings.steamClient.mod.ELicenseFlags.ImportedFromSteam2 & Double = js.native
  
  @js.native
  sealed trait LowViolenceContent
    extends StObject
       with ELicenseFlags
  /* 0x40 */ val LowViolenceContent: typings.steamClient.mod.ELicenseFlags.LowViolenceContent & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ELicenseFlags
  /* 0 */ val None: typings.steamClient.mod.ELicenseFlags.None & Double = js.native
  
  @js.native
  sealed trait NotActivated
    extends StObject
       with ELicenseFlags
  /* 0x800 */ val NotActivated: typings.steamClient.mod.ELicenseFlags.NotActivated & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with ELicenseFlags
  /* 0x04 */ val Pending: typings.steamClient.mod.ELicenseFlags.Pending & Double = js.native
  
  @js.native
  sealed trait RegionRestrictionExpired
    extends StObject
       with ELicenseFlags
  /* 0x200 */ val RegionRestrictionExpired: typings.steamClient.mod.ELicenseFlags.RegionRestrictionExpired & Double = js.native
  
  @js.native
  sealed trait Renew
    extends StObject
       with ELicenseFlags
  /* 0x01 */ val Renew: typings.steamClient.mod.ELicenseFlags.Renew & Double = js.native
  
  @js.native
  sealed trait RenewalFailed
    extends StObject
       with ELicenseFlags
  /* 0x02 */ val RenewalFailed: typings.steamClient.mod.ELicenseFlags.RenewalFailed & Double = js.native
}
