package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByAdmin
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByFriendlyFraudLock
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.CancelledByUser
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.Expired
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.ForceRunRestriction
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.ImportedFromSteam2
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.LowViolenceContent
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.None
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.NotActivated
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.Pending
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.RegionRestrictionExpired
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.Renew
import typings.steamDashClient.steamDashClientMod.ELicenseFlags.RenewalFailed
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags with Double] = js.native
  /* 0x20 */ @js.native
  object CancelledByAdmin extends TopLevel[CancelledByAdmin with Double]
  
  /* 0x400 */ @js.native
  object CancelledByFriendlyFraudLock extends TopLevel[CancelledByFriendlyFraudLock with Double]
  
  /* 0x10 */ @js.native
  object CancelledByUser extends TopLevel[CancelledByUser with Double]
  
  /* 0x08 */ @js.native
  object Expired extends TopLevel[Expired with Double]
  
  /* 0x100 */ @js.native
  object ForceRunRestriction extends TopLevel[ForceRunRestriction with Double]
  
  /* 0x80 */ @js.native
  object ImportedFromSteam2 extends TopLevel[ImportedFromSteam2 with Double]
  
  /* 0x40 */ @js.native
  object LowViolenceContent extends TopLevel[LowViolenceContent with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 0x800 */ @js.native
  object NotActivated extends TopLevel[NotActivated with Double]
  
  /* 0x04 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 0x200 */ @js.native
  object RegionRestrictionExpired extends TopLevel[RegionRestrictionExpired with Double]
  
  /* 0x01 */ @js.native
  object Renew extends TopLevel[Renew with Double]
  
  /* 0x02 */ @js.native
  object RenewalFailed extends TopLevel[RenewalFailed with Double]
  
}

