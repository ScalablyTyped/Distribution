package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseFlags extends js.Object
@JSImport("steam-client", "ELicenseFlags")
@js.native
object ELicenseFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseFlags with Double] = js.native
  
  @js.native
  sealed trait CancelledByAdmin extends ELicenseFlags
  /* 0x20 */ @js.native
  object CancelledByAdmin extends TopLevel[CancelledByAdmin with Double]
  
  @js.native
  sealed trait CancelledByFriendlyFraudLock extends ELicenseFlags
  /* 0x400 */ @js.native
  object CancelledByFriendlyFraudLock extends TopLevel[CancelledByFriendlyFraudLock with Double]
  
  @js.native
  sealed trait CancelledByUser extends ELicenseFlags
  /* 0x10 */ @js.native
  object CancelledByUser extends TopLevel[CancelledByUser with Double]
  
  @js.native
  sealed trait Expired extends ELicenseFlags
  /* 0x08 */ @js.native
  object Expired extends TopLevel[Expired with Double]
  
  @js.native
  sealed trait ForceRunRestriction extends ELicenseFlags
  /* 0x100 */ @js.native
  object ForceRunRestriction extends TopLevel[ForceRunRestriction with Double]
  
  @js.native
  sealed trait ImportedFromSteam2 extends ELicenseFlags
  /* 0x80 */ @js.native
  object ImportedFromSteam2 extends TopLevel[ImportedFromSteam2 with Double]
  
  @js.native
  sealed trait LowViolenceContent extends ELicenseFlags
  /* 0x40 */ @js.native
  object LowViolenceContent extends TopLevel[LowViolenceContent with Double]
  
  @js.native
  sealed trait None extends ELicenseFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait NotActivated extends ELicenseFlags
  /* 0x800 */ @js.native
  object NotActivated extends TopLevel[NotActivated with Double]
  
  @js.native
  sealed trait Pending extends ELicenseFlags
  /* 0x04 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  @js.native
  sealed trait RegionRestrictionExpired extends ELicenseFlags
  /* 0x200 */ @js.native
  object RegionRestrictionExpired extends TopLevel[RegionRestrictionExpired with Double]
  
  @js.native
  sealed trait Renew extends ELicenseFlags
  /* 0x01 */ @js.native
  object Renew extends TopLevel[Renew with Double]
  
  @js.native
  sealed trait RenewalFailed extends ELicenseFlags
  /* 0x02 */ @js.native
  object RenewalFailed extends TopLevel[RenewalFailed with Double]
}
