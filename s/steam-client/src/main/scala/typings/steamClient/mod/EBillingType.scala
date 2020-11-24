package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBillingType extends js.Object
@JSImport("steam-client", "EBillingType")
@js.native
object EBillingType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType with Double] = js.native
  
  @js.native
  sealed trait AutoGrant extends EBillingType
  /* 7 */ @js.native
  object AutoGrant extends TopLevel[AutoGrant with Double]
  
  @js.native
  sealed trait BillMonthly extends EBillingType
  /* 2 */ @js.native
  object BillMonthly extends TopLevel[BillMonthly with Double]
  
  @js.native
  sealed trait BillOnceOnly extends EBillingType
  /* 1 */ @js.native
  object BillOnceOnly extends TopLevel[BillOnceOnly with Double]
  
  @js.native
  sealed trait BillOnceOrCDKey extends EBillingType
  /* 10 */ @js.native
  object BillOnceOrCDKey extends TopLevel[BillOnceOrCDKey with Double]
  
  @js.native
  sealed trait CommercialLicense extends EBillingType
  /* 14 */ @js.native
  object CommercialLicense extends TopLevel[CommercialLicense with Double]
  
  @js.native
  sealed trait FreeCommercialLicense extends EBillingType
  /* 15 */ @js.native
  object FreeCommercialLicense extends TopLevel[FreeCommercialLicense with Double]
  
  @js.native
  sealed trait FreeOnDemand extends EBillingType
  /* 12 */ @js.native
  object FreeOnDemand extends TopLevel[FreeOnDemand with Double]
  
  @js.native
  sealed trait Gift extends EBillingType
  /* 6 */ @js.native
  object Gift extends TopLevel[Gift with Double]
  
  @js.native
  sealed trait GuestPass extends EBillingType
  /* 4 */ @js.native
  object GuestPass extends TopLevel[GuestPass with Double]
  
  @js.native
  sealed trait HardwarePromo extends EBillingType
  /* 5 */ @js.native
  object HardwarePromo extends TopLevel[HardwarePromo with Double]
  
  @js.native
  sealed trait NoCost extends EBillingType
  /* 0 */ @js.native
  object NoCost extends TopLevel[NoCost with Double]
  
  @js.native
  sealed trait NumBillingTypes extends EBillingType
  /* 16 */ @js.native
  object NumBillingTypes extends TopLevel[NumBillingTypes with Double]
  
  @js.native
  sealed trait OEMTicket extends EBillingType
  /* 8 */ @js.native
  object OEMTicket extends TopLevel[OEMTicket with Double]
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly extends EBillingType
  /* 3 */ @js.native
  object ProofOfPrepurchaseOnly extends TopLevel[ProofOfPrepurchaseOnly with Double]
  
  @js.native
  sealed trait RecurringOption extends EBillingType
  /* 9 */ @js.native
  object RecurringOption extends TopLevel[RecurringOption with Double]
  
  @js.native
  sealed trait Rental extends EBillingType
  /* 13 */ @js.native
  object Rental extends TopLevel[Rental with Double]
  
  @js.native
  sealed trait Repurchaseable extends EBillingType
  /* 11 */ @js.native
  object Repurchaseable extends TopLevel[Repurchaseable with Double]
}
