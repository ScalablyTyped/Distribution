package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELicenseType extends js.Object

@JSImport("steam-client", "ELicenseType")
@js.native
object ELicenseType extends js.Object {
  @js.native
  sealed trait LimitedUseDelayedActivation extends ELicenseType
  
  @js.native
  sealed trait NoLicense extends ELicenseType
  
  @js.native
  sealed trait RecurringCharge extends ELicenseType
  
  @js.native
  sealed trait RecurringChargeLimitedUse extends ELicenseType
  
  @js.native
  sealed trait RecurringChargeLimitedUseWithOverages extends ELicenseType
  
  @js.native
  sealed trait RecurringOption extends ELicenseType
  
  @js.native
  sealed trait SinglePurchase extends ELicenseType
  
  @js.native
  sealed trait SinglePurchaseLimitedUse extends ELicenseType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseType with Double] = js.native
  /* 7 */ @js.native
  object LimitedUseDelayedActivation extends TopLevel[LimitedUseDelayedActivation with Double]
  
  /* 0 */ @js.native
  object NoLicense extends TopLevel[NoLicense with Double]
  
  /* 3 */ @js.native
  object RecurringCharge extends TopLevel[RecurringCharge with Double]
  
  /* 4 */ @js.native
  object RecurringChargeLimitedUse extends TopLevel[RecurringChargeLimitedUse with Double]
  
  /* 5 */ @js.native
  object RecurringChargeLimitedUseWithOverages extends TopLevel[RecurringChargeLimitedUseWithOverages with Double]
  
  /* 6 */ @js.native
  object RecurringOption extends TopLevel[RecurringOption with Double]
  
  /* 1 */ @js.native
  object SinglePurchase extends TopLevel[SinglePurchase with Double]
  
  /* 2 */ @js.native
  object SinglePurchaseLimitedUse extends TopLevel[SinglePurchaseLimitedUse with Double]
  
}

