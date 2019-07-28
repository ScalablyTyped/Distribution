package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELicenseFlags extends js.Object

@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends js.Object {
  @js.native
  sealed trait CancelledByAdmin extends ELicenseFlags
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock extends ELicenseFlags
  
  @js.native
  sealed trait CancelledByUser extends ELicenseFlags
  
  @js.native
  sealed trait Expired extends ELicenseFlags
  
  @js.native
  sealed trait ForceRunRestriction extends ELicenseFlags
  
  @js.native
  sealed trait ImportedFromSteam2 extends ELicenseFlags
  
  @js.native
  sealed trait LowViolenceContent extends ELicenseFlags
  
  @js.native
  sealed trait None extends ELicenseFlags
  
  @js.native
  sealed trait NotActivated extends ELicenseFlags
  
  @js.native
  sealed trait Pending extends ELicenseFlags
  
  @js.native
  sealed trait RegionRestrictionExpired extends ELicenseFlags
  
  @js.native
  sealed trait Renew extends ELicenseFlags
  
  @js.native
  sealed trait RenewalFailed extends ELicenseFlags
  
  /* 0x20 */ val CancelledByAdmin: typings.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByAdmin with Double = js.native
  /* 0x400 */ val CancelledByFriendlyFraudLock: typings.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByFriendlyFraudLock with Double = js.native
  /* 0x10 */ val CancelledByUser: typings.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByUser with Double = js.native
  /* 0x08 */ val Expired: typings.steamDashClient.steamDashClientMod.ELicenseFlags.Expired with Double = js.native
  /* 0x100 */ val ForceRunRestriction: typings.steamDashClient.steamDashClientMod.ELicenseFlags.ForceRunRestriction with Double = js.native
  /* 0x80 */ val ImportedFromSteam2: typings.steamDashClient.steamDashClientMod.ELicenseFlags.ImportedFromSteam2 with Double = js.native
  /* 0x40 */ val LowViolenceContent: typings.steamDashClient.steamDashClientMod.ELicenseFlags.LowViolenceContent with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.ELicenseFlags.None with Double = js.native
  /* 0x800 */ val NotActivated: typings.steamDashClient.steamDashClientMod.ELicenseFlags.NotActivated with Double = js.native
  /* 0x04 */ val Pending: typings.steamDashClient.steamDashClientMod.ELicenseFlags.Pending with Double = js.native
  /* 0x200 */ val RegionRestrictionExpired: typings.steamDashClient.steamDashClientMod.ELicenseFlags.RegionRestrictionExpired with Double = js.native
  /* 0x01 */ val Renew: typings.steamDashClient.steamDashClientMod.ELicenseFlags.Renew with Double = js.native
  /* 0x02 */ val RenewalFailed: typings.steamDashClient.steamDashClientMod.ELicenseFlags.RenewalFailed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags with Double] = js.native
}

