package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBillingType extends StObject
@JSImport("steam-client", "EBillingType")
@js.native
object EBillingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType & Double] = js.native
  
  @js.native
  sealed trait AutoGrant
    extends StObject
       with EBillingType
  /* 7 */ val AutoGrant: typings.steamClient.mod.EBillingType.AutoGrant & Double = js.native
  
  @js.native
  sealed trait BillMonthly
    extends StObject
       with EBillingType
  /* 2 */ val BillMonthly: typings.steamClient.mod.EBillingType.BillMonthly & Double = js.native
  
  @js.native
  sealed trait BillOnceOnly
    extends StObject
       with EBillingType
  /* 1 */ val BillOnceOnly: typings.steamClient.mod.EBillingType.BillOnceOnly & Double = js.native
  
  @js.native
  sealed trait BillOnceOrCDKey
    extends StObject
       with EBillingType
  /* 10 */ val BillOnceOrCDKey: typings.steamClient.mod.EBillingType.BillOnceOrCDKey & Double = js.native
  
  @js.native
  sealed trait CommercialLicense
    extends StObject
       with EBillingType
  /* 14 */ val CommercialLicense: typings.steamClient.mod.EBillingType.CommercialLicense & Double = js.native
  
  @js.native
  sealed trait FreeCommercialLicense
    extends StObject
       with EBillingType
  /* 15 */ val FreeCommercialLicense: typings.steamClient.mod.EBillingType.FreeCommercialLicense & Double = js.native
  
  @js.native
  sealed trait FreeOnDemand
    extends StObject
       with EBillingType
  /* 12 */ val FreeOnDemand: typings.steamClient.mod.EBillingType.FreeOnDemand & Double = js.native
  
  @js.native
  sealed trait Gift
    extends StObject
       with EBillingType
  /* 6 */ val Gift: typings.steamClient.mod.EBillingType.Gift & Double = js.native
  
  @js.native
  sealed trait GuestPass
    extends StObject
       with EBillingType
  /* 4 */ val GuestPass: typings.steamClient.mod.EBillingType.GuestPass & Double = js.native
  
  @js.native
  sealed trait HardwarePromo
    extends StObject
       with EBillingType
  /* 5 */ val HardwarePromo: typings.steamClient.mod.EBillingType.HardwarePromo & Double = js.native
  
  @js.native
  sealed trait NoCost
    extends StObject
       with EBillingType
  /* 0 */ val NoCost: typings.steamClient.mod.EBillingType.NoCost & Double = js.native
  
  @js.native
  sealed trait NumBillingTypes
    extends StObject
       with EBillingType
  /* 16 */ val NumBillingTypes: typings.steamClient.mod.EBillingType.NumBillingTypes & Double = js.native
  
  @js.native
  sealed trait OEMTicket
    extends StObject
       with EBillingType
  /* 8 */ val OEMTicket: typings.steamClient.mod.EBillingType.OEMTicket & Double = js.native
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly
    extends StObject
       with EBillingType
  /* 3 */ val ProofOfPrepurchaseOnly: typings.steamClient.mod.EBillingType.ProofOfPrepurchaseOnly & Double = js.native
  
  @js.native
  sealed trait RecurringOption
    extends StObject
       with EBillingType
  /* 9 */ val RecurringOption: typings.steamClient.mod.EBillingType.RecurringOption & Double = js.native
  
  @js.native
  sealed trait Rental
    extends StObject
       with EBillingType
  /* 13 */ val Rental: typings.steamClient.mod.EBillingType.Rental & Double = js.native
  
  @js.native
  sealed trait Repurchaseable
    extends StObject
       with EBillingType
  /* 11 */ val Repurchaseable: typings.steamClient.mod.EBillingType.Repurchaseable & Double = js.native
}
