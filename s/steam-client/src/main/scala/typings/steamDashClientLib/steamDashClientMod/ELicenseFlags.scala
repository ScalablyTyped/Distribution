package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELicenseFlags extends js.Object

@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends js.Object {
  @js.native
  sealed trait CancelledByAdmin
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait CancelledByUser
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait Expired
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait ForceRunRestriction
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait ImportedFromSteam2
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait LowViolenceContent
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait NotActivated
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait Pending
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait RegionRestrictionExpired
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait Renew
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  @js.native
  sealed trait RenewalFailed
    extends steamDashClientLib.steamDashClientMod.ELicenseFlags
  
  /* 0x20 */ val CancelledByAdmin: CancelledByAdmin with scala.Double = js.native
  /* 0x400 */ val CancelledByFriendlyFraudLock: CancelledByFriendlyFraudLock with scala.Double = js.native
  /* 0x10 */ val CancelledByUser: CancelledByUser with scala.Double = js.native
  /* 0x08 */ val Expired: Expired with scala.Double = js.native
  /* 0x100 */ val ForceRunRestriction: ForceRunRestriction with scala.Double = js.native
  /* 0x80 */ val ImportedFromSteam2: ImportedFromSteam2 with scala.Double = js.native
  /* 0x40 */ val LowViolenceContent: LowViolenceContent with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 0x800 */ val NotActivated: NotActivated with scala.Double = js.native
  /* 0x04 */ val Pending: Pending with scala.Double = js.native
  /* 0x200 */ val RegionRestrictionExpired: RegionRestrictionExpired with scala.Double = js.native
  /* 0x01 */ val Renew: Renew with scala.Double = js.native
  /* 0x02 */ val RenewalFailed: RenewalFailed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ELicenseFlags with scala.Double] = js.native
}

