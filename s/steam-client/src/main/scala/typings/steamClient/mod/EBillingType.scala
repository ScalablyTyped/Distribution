package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBillingType extends js.Object

@JSImport("steam-client", "EBillingType")
@js.native
object EBillingType extends js.Object {
  @js.native
  sealed trait AutoGrant extends EBillingType
  
  @js.native
  sealed trait BillMonthly extends EBillingType
  
  @js.native
  sealed trait BillOnceOnly extends EBillingType
  
  @js.native
  sealed trait BillOnceOrCDKey extends EBillingType
  
  @js.native
  sealed trait CommercialLicense extends EBillingType
  
  @js.native
  sealed trait FreeCommercialLicense extends EBillingType
  
  @js.native
  sealed trait FreeOnDemand extends EBillingType
  
  @js.native
  sealed trait Gift extends EBillingType
  
  @js.native
  sealed trait GuestPass extends EBillingType
  
  @js.native
  sealed trait HardwarePromo extends EBillingType
  
  @js.native
  sealed trait NoCost extends EBillingType
  
  @js.native
  sealed trait NumBillingTypes extends EBillingType
  
  @js.native
  sealed trait OEMTicket extends EBillingType
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly extends EBillingType
  
  @js.native
  sealed trait RecurringOption extends EBillingType
  
  @js.native
  sealed trait Rental extends EBillingType
  
  @js.native
  sealed trait Repurchaseable extends EBillingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType with Double] = js.native
  /* 7 */ @js.native
  object AutoGrant extends TopLevel[AutoGrant with Double]
  
  /* 2 */ @js.native
  object BillMonthly extends TopLevel[BillMonthly with Double]
  
  /* 1 */ @js.native
  object BillOnceOnly extends TopLevel[BillOnceOnly with Double]
  
  /* 10 */ @js.native
  object BillOnceOrCDKey extends TopLevel[BillOnceOrCDKey with Double]
  
  /* 14 */ @js.native
  object CommercialLicense extends TopLevel[CommercialLicense with Double]
  
  /* 15 */ @js.native
  object FreeCommercialLicense extends TopLevel[FreeCommercialLicense with Double]
  
  /* 12 */ @js.native
  object FreeOnDemand extends TopLevel[FreeOnDemand with Double]
  
  /* 6 */ @js.native
  object Gift extends TopLevel[Gift with Double]
  
  /* 4 */ @js.native
  object GuestPass extends TopLevel[GuestPass with Double]
  
  /* 5 */ @js.native
  object HardwarePromo extends TopLevel[HardwarePromo with Double]
  
  /* 0 */ @js.native
  object NoCost extends TopLevel[NoCost with Double]
  
  /* 16 */ @js.native
  object NumBillingTypes extends TopLevel[NumBillingTypes with Double]
  
  /* 8 */ @js.native
  object OEMTicket extends TopLevel[OEMTicket with Double]
  
  /* 3 */ @js.native
  object ProofOfPrepurchaseOnly extends TopLevel[ProofOfPrepurchaseOnly with Double]
  
  /* 9 */ @js.native
  object RecurringOption extends TopLevel[RecurringOption with Double]
  
  /* 13 */ @js.native
  object Rental extends TopLevel[Rental with Double]
  
  /* 11 */ @js.native
  object Repurchaseable extends TopLevel[Repurchaseable with Double]
  
}

