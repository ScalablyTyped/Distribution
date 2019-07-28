package typings.steamDashClient.steamDashClientMod

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
  
  /* 7 */ val AutoGrant: typings.steamDashClient.steamDashClientMod.EBillingType.AutoGrant with Double = js.native
  /* 2 */ val BillMonthly: typings.steamDashClient.steamDashClientMod.EBillingType.BillMonthly with Double = js.native
  /* 1 */ val BillOnceOnly: typings.steamDashClient.steamDashClientMod.EBillingType.BillOnceOnly with Double = js.native
  /* 10 */ val BillOnceOrCDKey: typings.steamDashClient.steamDashClientMod.EBillingType.BillOnceOrCDKey with Double = js.native
  /* 14 */ val CommercialLicense: typings.steamDashClient.steamDashClientMod.EBillingType.CommercialLicense with Double = js.native
  /* 15 */ val FreeCommercialLicense: typings.steamDashClient.steamDashClientMod.EBillingType.FreeCommercialLicense with Double = js.native
  /* 12 */ val FreeOnDemand: typings.steamDashClient.steamDashClientMod.EBillingType.FreeOnDemand with Double = js.native
  /* 6 */ val Gift: typings.steamDashClient.steamDashClientMod.EBillingType.Gift with Double = js.native
  /* 4 */ val GuestPass: typings.steamDashClient.steamDashClientMod.EBillingType.GuestPass with Double = js.native
  /* 5 */ val HardwarePromo: typings.steamDashClient.steamDashClientMod.EBillingType.HardwarePromo with Double = js.native
  /* 0 */ val NoCost: typings.steamDashClient.steamDashClientMod.EBillingType.NoCost with Double = js.native
  /* 16 */ val NumBillingTypes: typings.steamDashClient.steamDashClientMod.EBillingType.NumBillingTypes with Double = js.native
  /* 8 */ val OEMTicket: typings.steamDashClient.steamDashClientMod.EBillingType.OEMTicket with Double = js.native
  /* 3 */ val ProofOfPrepurchaseOnly: typings.steamDashClient.steamDashClientMod.EBillingType.ProofOfPrepurchaseOnly with Double = js.native
  /* 9 */ val RecurringOption: typings.steamDashClient.steamDashClientMod.EBillingType.RecurringOption with Double = js.native
  /* 13 */ val Rental: typings.steamDashClient.steamDashClientMod.EBillingType.Rental with Double = js.native
  /* 11 */ val Repurchaseable: typings.steamDashClient.steamDashClientMod.EBillingType.Repurchaseable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType with Double] = js.native
}

