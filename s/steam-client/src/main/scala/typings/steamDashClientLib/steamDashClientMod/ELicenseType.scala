package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ELicenseType extends js.Object

@JSImport("steam-client", "ELicenseType")
@js.native
object ELicenseType extends js.Object {
  @js.native
  sealed trait LimitedUseDelayedActivation
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  @js.native
  sealed trait NoLicense
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  @js.native
  sealed trait RecurringCharge
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  @js.native
  sealed trait RecurringChargeLimitedUse
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  @js.native
  sealed trait RecurringChargeLimitedUseWithOverages
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  @js.native
  sealed trait RecurringOption
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  @js.native
  sealed trait SinglePurchase
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  @js.native
  sealed trait SinglePurchaseLimitedUse
    extends steamDashClientLib.steamDashClientMod.ELicenseType
  
  /* 7 */ val LimitedUseDelayedActivation: LimitedUseDelayedActivation with scala.Double = js.native
  /* 0 */ val NoLicense: NoLicense with scala.Double = js.native
  /* 3 */ val RecurringCharge: RecurringCharge with scala.Double = js.native
  /* 4 */ val RecurringChargeLimitedUse: RecurringChargeLimitedUse with scala.Double = js.native
  /* 5 */ val RecurringChargeLimitedUseWithOverages: RecurringChargeLimitedUseWithOverages with scala.Double = js.native
  /* 6 */ val RecurringOption: RecurringOption with scala.Double = js.native
  /* 1 */ val SinglePurchase: SinglePurchase with scala.Double = js.native
  /* 2 */ val SinglePurchaseLimitedUse: SinglePurchaseLimitedUse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ELicenseType with scala.Double] = js.native
}

