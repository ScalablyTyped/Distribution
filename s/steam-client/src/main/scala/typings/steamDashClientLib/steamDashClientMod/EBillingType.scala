package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBillingType extends js.Object

@JSImport("steam-client", "EBillingType")
@js.native
object EBillingType extends js.Object {
  @js.native
  sealed trait AutoGrant
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait BillMonthly
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait BillOnceOnly
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait BillOnceOrCDKey
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait CommercialLicense
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait FreeCommercialLicense
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait FreeOnDemand
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait Gift
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait GuestPass
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait HardwarePromo
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait NoCost
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait NumBillingTypes
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait OEMTicket
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait RecurringOption
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait Rental
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  @js.native
  sealed trait Repurchaseable
    extends steamDashClientLib.steamDashClientMod.EBillingType
  
  /* 7 */ val AutoGrant: AutoGrant with scala.Double = js.native
  /* 2 */ val BillMonthly: BillMonthly with scala.Double = js.native
  /* 1 */ val BillOnceOnly: BillOnceOnly with scala.Double = js.native
  /* 10 */ val BillOnceOrCDKey: BillOnceOrCDKey with scala.Double = js.native
  /* 14 */ val CommercialLicense: CommercialLicense with scala.Double = js.native
  /* 15 */ val FreeCommercialLicense: FreeCommercialLicense with scala.Double = js.native
  /* 12 */ val FreeOnDemand: FreeOnDemand with scala.Double = js.native
  /* 6 */ val Gift: Gift with scala.Double = js.native
  /* 4 */ val GuestPass: GuestPass with scala.Double = js.native
  /* 5 */ val HardwarePromo: HardwarePromo with scala.Double = js.native
  /* 0 */ val NoCost: NoCost with scala.Double = js.native
  /* 16 */ val NumBillingTypes: NumBillingTypes with scala.Double = js.native
  /* 8 */ val OEMTicket: OEMTicket with scala.Double = js.native
  /* 3 */ val ProofOfPrepurchaseOnly: ProofOfPrepurchaseOnly with scala.Double = js.native
  /* 9 */ val RecurringOption: RecurringOption with scala.Double = js.native
  /* 13 */ val Rental: Rental with scala.Double = js.native
  /* 11 */ val Repurchaseable: Repurchaseable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EBillingType with scala.Double] = js.native
}

