package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseFlags extends StObject
@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags with Double] = js.native
  
  @js.native
  sealed trait CancelledByAdmin extends ELicenseFlags
  /* 0x20 */ val CancelledByAdmin: typings.steamClient.mod.ELicenseFlags.CancelledByAdmin with Double = js.native
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock extends ELicenseFlags
  /* 0x400 */ val CancelledByFriendlyFraudLock: typings.steamClient.mod.ELicenseFlags.CancelledByFriendlyFraudLock with Double = js.native
  
  @js.native
  sealed trait CancelledByUser extends ELicenseFlags
  /* 0x10 */ val CancelledByUser: typings.steamClient.mod.ELicenseFlags.CancelledByUser with Double = js.native
  
  @js.native
  sealed trait Expired extends ELicenseFlags
  /* 0x08 */ val Expired: typings.steamClient.mod.ELicenseFlags.Expired with Double = js.native
  
  @js.native
  sealed trait ForceRunRestriction extends ELicenseFlags
  /* 0x100 */ val ForceRunRestriction: typings.steamClient.mod.ELicenseFlags.ForceRunRestriction with Double = js.native
  
  @js.native
  sealed trait ImportedFromSteam2 extends ELicenseFlags
  /* 0x80 */ val ImportedFromSteam2: typings.steamClient.mod.ELicenseFlags.ImportedFromSteam2 with Double = js.native
  
  @js.native
  sealed trait LowViolenceContent extends ELicenseFlags
  /* 0x40 */ val LowViolenceContent: typings.steamClient.mod.ELicenseFlags.LowViolenceContent with Double = js.native
  
  @js.native
  sealed trait None extends ELicenseFlags
  /* 0 */ val None: typings.steamClient.mod.ELicenseFlags.None with Double = js.native
  
  @js.native
  sealed trait NotActivated extends ELicenseFlags
  /* 0x800 */ val NotActivated: typings.steamClient.mod.ELicenseFlags.NotActivated with Double = js.native
  
  @js.native
  sealed trait Pending extends ELicenseFlags
  /* 0x04 */ val Pending: typings.steamClient.mod.ELicenseFlags.Pending with Double = js.native
  
  @js.native
  sealed trait RegionRestrictionExpired extends ELicenseFlags
  /* 0x200 */ val RegionRestrictionExpired: typings.steamClient.mod.ELicenseFlags.RegionRestrictionExpired with Double = js.native
  
  @js.native
  sealed trait Renew extends ELicenseFlags
  /* 0x01 */ val Renew: typings.steamClient.mod.ELicenseFlags.Renew with Double = js.native
  
  @js.native
  sealed trait RenewalFailed extends ELicenseFlags
  /* 0x02 */ val RenewalFailed: typings.steamClient.mod.ELicenseFlags.RenewalFailed with Double = js.native
}
