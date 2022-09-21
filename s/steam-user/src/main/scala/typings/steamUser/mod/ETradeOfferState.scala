package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ETradeOfferState extends StObject
@JSImport("steam-user", "ETradeOfferState")
@js.native
object ETradeOfferState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ETradeOfferState & Double] = js.native
  
  @js.native
  sealed trait Accepted
    extends StObject
       with ETradeOfferState
  /* 3 */ val Accepted: typings.steamUser.mod.ETradeOfferState.Accepted & Double = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with ETradeOfferState
  /* 2 */ val Active: typings.steamUser.mod.ETradeOfferState.Active & Double = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with ETradeOfferState
  /* 6 */ val Canceled: typings.steamUser.mod.ETradeOfferState.Canceled & Double = js.native
  
  @js.native
  sealed trait CanceledBySecondFactor
    extends StObject
       with ETradeOfferState
  /* 10 */ val CanceledBySecondFactor: typings.steamUser.mod.ETradeOfferState.CanceledBySecondFactor & Double = js.native
  
  @js.native
  sealed trait Countered
    extends StObject
       with ETradeOfferState
  /* 4 */ val Countered: typings.steamUser.mod.ETradeOfferState.Countered & Double = js.native
  
  @js.native
  sealed trait CreatedNeedsConfirmation
    extends StObject
       with ETradeOfferState
  /* 9 */ val CreatedNeedsConfirmation: typings.steamUser.mod.ETradeOfferState.CreatedNeedsConfirmation & Double = js.native
  
  @js.native
  sealed trait Declined
    extends StObject
       with ETradeOfferState
  /* 7 */ val Declined: typings.steamUser.mod.ETradeOfferState.Declined & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with ETradeOfferState
  /* 5 */ val Expired: typings.steamUser.mod.ETradeOfferState.Expired & Double = js.native
  
  @js.native
  sealed trait InEscrow
    extends StObject
       with ETradeOfferState
  /* 11 */ val InEscrow: typings.steamUser.mod.ETradeOfferState.InEscrow & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ETradeOfferState
  /* 1 */ val Invalid: typings.steamUser.mod.ETradeOfferState.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidItems
    extends StObject
       with ETradeOfferState
  /* 8 */ val InvalidItems: typings.steamUser.mod.ETradeOfferState.InvalidItems & Double = js.native
}
