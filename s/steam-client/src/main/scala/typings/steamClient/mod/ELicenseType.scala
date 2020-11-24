package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseType extends js.Object
@JSImport("steam-client", "ELicenseType")
@js.native
object ELicenseType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseType with Double] = js.native
  
  @js.native
  sealed trait LimitedUseDelayedActivation extends ELicenseType
  /* 7 */ @js.native
  object LimitedUseDelayedActivation extends TopLevel[LimitedUseDelayedActivation with Double]
  
  @js.native
  sealed trait NoLicense extends ELicenseType
  /* 0 */ @js.native
  object NoLicense extends TopLevel[NoLicense with Double]
  
  @js.native
  sealed trait RecurringCharge extends ELicenseType
  /* 3 */ @js.native
  object RecurringCharge extends TopLevel[RecurringCharge with Double]
  
  @js.native
  sealed trait RecurringChargeLimitedUse extends ELicenseType
  /* 4 */ @js.native
  object RecurringChargeLimitedUse extends TopLevel[RecurringChargeLimitedUse with Double]
  
  @js.native
  sealed trait RecurringChargeLimitedUseWithOverages extends ELicenseType
  /* 5 */ @js.native
  object RecurringChargeLimitedUseWithOverages extends TopLevel[RecurringChargeLimitedUseWithOverages with Double]
  
  @js.native
  sealed trait RecurringOption extends ELicenseType
  /* 6 */ @js.native
  object RecurringOption extends TopLevel[RecurringOption with Double]
  
  @js.native
  sealed trait SinglePurchase extends ELicenseType
  /* 1 */ @js.native
  object SinglePurchase extends TopLevel[SinglePurchase with Double]
  
  @js.native
  sealed trait SinglePurchaseLimitedUse extends ELicenseType
  /* 2 */ @js.native
  object SinglePurchaseLimitedUse extends TopLevel[SinglePurchaseLimitedUse with Double]
}
