package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperationResponseTypeI extends js.Object
@JSImport("stellar-sdk/lib/horizon_api", "Horizon.OperationResponseTypeI")
@js.native
object OperationResponseTypeI extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationResponseTypeI with Double] = js.native
  
  @js.native
  sealed trait accountMerge extends OperationResponseTypeI
  /* 8 */ @js.native
  object accountMerge extends TopLevel[accountMerge with Double]
  
  @js.native
  sealed trait allowTrust extends OperationResponseTypeI
  /* 7 */ @js.native
  object allowTrust extends TopLevel[allowTrust with Double]
  
  @js.native
  sealed trait beginSponsoringFutureReserves extends OperationResponseTypeI
  /* 16 */ @js.native
  object beginSponsoringFutureReserves extends TopLevel[beginSponsoringFutureReserves with Double]
  
  @js.native
  sealed trait bumpSequence extends OperationResponseTypeI
  /* 11 */ @js.native
  object bumpSequence extends TopLevel[bumpSequence with Double]
  
  @js.native
  sealed trait changeTrust extends OperationResponseTypeI
  /* 6 */ @js.native
  object changeTrust extends TopLevel[changeTrust with Double]
  
  @js.native
  sealed trait claimClaimableBalance extends OperationResponseTypeI
  /* 15 */ @js.native
  object claimClaimableBalance extends TopLevel[claimClaimableBalance with Double]
  
  @js.native
  sealed trait createAccount extends OperationResponseTypeI
  /* 0 */ @js.native
  object createAccount extends TopLevel[createAccount with Double]
  
  @js.native
  sealed trait createClaimableBalance extends OperationResponseTypeI
  /* 14 */ @js.native
  object createClaimableBalance extends TopLevel[createClaimableBalance with Double]
  
  @js.native
  sealed trait createPassiveOffer extends OperationResponseTypeI
  /* 3 */ @js.native
  object createPassiveOffer extends TopLevel[createPassiveOffer with Double]
  
  @js.native
  sealed trait endSponsoringFutureReserves extends OperationResponseTypeI
  /* 17 */ @js.native
  object endSponsoringFutureReserves extends TopLevel[endSponsoringFutureReserves with Double]
  
  @js.native
  sealed trait inflation extends OperationResponseTypeI
  /* 9 */ @js.native
  object inflation extends TopLevel[inflation with Double]
  
  @js.native
  sealed trait manageBuyOffer extends OperationResponseTypeI
  /* 12 */ @js.native
  object manageBuyOffer extends TopLevel[manageBuyOffer with Double]
  
  @js.native
  sealed trait manageData extends OperationResponseTypeI
  /* 10 */ @js.native
  object manageData extends TopLevel[manageData with Double]
  
  @js.native
  sealed trait manageOffer extends OperationResponseTypeI
  /* 4 */ @js.native
  object manageOffer extends TopLevel[manageOffer with Double]
  
  @js.native
  sealed trait pathPayment extends OperationResponseTypeI
  /* 2 */ @js.native
  object pathPayment extends TopLevel[pathPayment with Double]
  
  @js.native
  sealed trait pathPaymentStrictSend extends OperationResponseTypeI
  /* 13 */ @js.native
  object pathPaymentStrictSend extends TopLevel[pathPaymentStrictSend with Double]
  
  @js.native
  sealed trait payment extends OperationResponseTypeI
  /* 1 */ @js.native
  object payment extends TopLevel[payment with Double]
  
  @js.native
  sealed trait revokeSponsorship extends OperationResponseTypeI
  /* 18 */ @js.native
  object revokeSponsorship extends TopLevel[revokeSponsorship with Double]
  
  @js.native
  sealed trait setOptions extends OperationResponseTypeI
  /* 5 */ @js.native
  object setOptions extends TopLevel[setOptions with Double]
}
