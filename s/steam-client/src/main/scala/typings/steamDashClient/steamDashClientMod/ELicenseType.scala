package typings.steamDashClient.steamDashClientMod

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
  
  /* 7 */ val LimitedUseDelayedActivation: typings.steamDashClient.steamDashClientMod.ELicenseType.LimitedUseDelayedActivation with Double = js.native
  /* 0 */ val NoLicense: typings.steamDashClient.steamDashClientMod.ELicenseType.NoLicense with Double = js.native
  /* 3 */ val RecurringCharge: typings.steamDashClient.steamDashClientMod.ELicenseType.RecurringCharge with Double = js.native
  /* 4 */ val RecurringChargeLimitedUse: typings.steamDashClient.steamDashClientMod.ELicenseType.RecurringChargeLimitedUse with Double = js.native
  /* 5 */ val RecurringChargeLimitedUseWithOverages: typings.steamDashClient.steamDashClientMod.ELicenseType.RecurringChargeLimitedUseWithOverages with Double = js.native
  /* 6 */ val RecurringOption: typings.steamDashClient.steamDashClientMod.ELicenseType.RecurringOption with Double = js.native
  /* 1 */ val SinglePurchase: typings.steamDashClient.steamDashClientMod.ELicenseType.SinglePurchase with Double = js.native
  /* 2 */ val SinglePurchaseLimitedUse: typings.steamDashClient.steamDashClientMod.ELicenseType.SinglePurchaseLimitedUse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseType with Double] = js.native
}

