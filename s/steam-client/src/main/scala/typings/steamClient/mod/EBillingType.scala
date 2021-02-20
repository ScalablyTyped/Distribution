package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBillingType extends StObject
@JSImport("steam-client", "EBillingType")
@js.native
object EBillingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType with Double] = js.native
  
  @js.native
  sealed trait AutoGrant extends EBillingType
  /* 7 */ val AutoGrant: typings.steamClient.mod.EBillingType.AutoGrant with Double = js.native
  
  @js.native
  sealed trait BillMonthly extends EBillingType
  /* 2 */ val BillMonthly: typings.steamClient.mod.EBillingType.BillMonthly with Double = js.native
  
  @js.native
  sealed trait BillOnceOnly extends EBillingType
  /* 1 */ val BillOnceOnly: typings.steamClient.mod.EBillingType.BillOnceOnly with Double = js.native
  
  @js.native
  sealed trait BillOnceOrCDKey extends EBillingType
  /* 10 */ val BillOnceOrCDKey: typings.steamClient.mod.EBillingType.BillOnceOrCDKey with Double = js.native
  
  @js.native
  sealed trait CommercialLicense extends EBillingType
  /* 14 */ val CommercialLicense: typings.steamClient.mod.EBillingType.CommercialLicense with Double = js.native
  
  @js.native
  sealed trait FreeCommercialLicense extends EBillingType
  /* 15 */ val FreeCommercialLicense: typings.steamClient.mod.EBillingType.FreeCommercialLicense with Double = js.native
  
  @js.native
  sealed trait FreeOnDemand extends EBillingType
  /* 12 */ val FreeOnDemand: typings.steamClient.mod.EBillingType.FreeOnDemand with Double = js.native
  
  @js.native
  sealed trait Gift extends EBillingType
  /* 6 */ val Gift: typings.steamClient.mod.EBillingType.Gift with Double = js.native
  
  @js.native
  sealed trait GuestPass extends EBillingType
  /* 4 */ val GuestPass: typings.steamClient.mod.EBillingType.GuestPass with Double = js.native
  
  @js.native
  sealed trait HardwarePromo extends EBillingType
  /* 5 */ val HardwarePromo: typings.steamClient.mod.EBillingType.HardwarePromo with Double = js.native
  
  @js.native
  sealed trait NoCost extends EBillingType
  /* 0 */ val NoCost: typings.steamClient.mod.EBillingType.NoCost with Double = js.native
  
  @js.native
  sealed trait NumBillingTypes extends EBillingType
  /* 16 */ val NumBillingTypes: typings.steamClient.mod.EBillingType.NumBillingTypes with Double = js.native
  
  @js.native
  sealed trait OEMTicket extends EBillingType
  /* 8 */ val OEMTicket: typings.steamClient.mod.EBillingType.OEMTicket with Double = js.native
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly extends EBillingType
  /* 3 */ val ProofOfPrepurchaseOnly: typings.steamClient.mod.EBillingType.ProofOfPrepurchaseOnly with Double = js.native
  
  @js.native
  sealed trait RecurringOption extends EBillingType
  /* 9 */ val RecurringOption: typings.steamClient.mod.EBillingType.RecurringOption with Double = js.native
  
  @js.native
  sealed trait Rental extends EBillingType
  /* 13 */ val Rental: typings.steamClient.mod.EBillingType.Rental with Double = js.native
  
  @js.native
  sealed trait Repurchaseable extends EBillingType
  /* 11 */ val Repurchaseable: typings.steamClient.mod.EBillingType.Repurchaseable with Double = js.native
}
