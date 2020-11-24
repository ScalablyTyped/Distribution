package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OperationResponseType extends js.Object
@JSImport("stellar-sdk/lib/horizon_api", "Horizon.OperationResponseType")
@js.native
object OperationResponseType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OperationResponseType with String] = js.native
  
  @js.native
  sealed trait accountMerge extends OperationResponseType
  /* "account_merge" */ @js.native
  object accountMerge extends TopLevel[accountMerge with String]
  
  @js.native
  sealed trait allowTrust extends OperationResponseType
  /* "allow_trust" */ @js.native
  object allowTrust extends TopLevel[allowTrust with String]
  
  @js.native
  sealed trait beginSponsoringFutureReserves extends OperationResponseType
  /* "begin_sponsoring_future_reserves" */ @js.native
  object beginSponsoringFutureReserves extends TopLevel[beginSponsoringFutureReserves with String]
  
  @js.native
  sealed trait bumpSequence extends OperationResponseType
  /* "bump_sequence" */ @js.native
  object bumpSequence extends TopLevel[bumpSequence with String]
  
  @js.native
  sealed trait changeTrust extends OperationResponseType
  /* "change_trust" */ @js.native
  object changeTrust extends TopLevel[changeTrust with String]
  
  @js.native
  sealed trait claimClaimableBalance extends OperationResponseType
  /* "claim_claimable_balance" */ @js.native
  object claimClaimableBalance extends TopLevel[claimClaimableBalance with String]
  
  @js.native
  sealed trait createAccount extends OperationResponseType
  /* "create_account" */ @js.native
  object createAccount extends TopLevel[createAccount with String]
  
  @js.native
  sealed trait createClaimableBalance extends OperationResponseType
  /* "create_claimable_balance" */ @js.native
  object createClaimableBalance extends TopLevel[createClaimableBalance with String]
  
  @js.native
  sealed trait createPassiveOffer extends OperationResponseType
  /* "create_passive_sell_offer" */ @js.native
  object createPassiveOffer extends TopLevel[createPassiveOffer with String]
  
  @js.native
  sealed trait endSponsoringFutureReserves extends OperationResponseType
  /* "end_sponsoring_future_reserves" */ @js.native
  object endSponsoringFutureReserves extends TopLevel[endSponsoringFutureReserves with String]
  
  @js.native
  sealed trait inflation extends OperationResponseType
  /* "inflation" */ @js.native
  object inflation extends TopLevel[inflation with String]
  
  @js.native
  sealed trait manageBuyOffer extends OperationResponseType
  /* "manage_buy_offer" */ @js.native
  object manageBuyOffer extends TopLevel[manageBuyOffer with String]
  
  @js.native
  sealed trait manageData extends OperationResponseType
  /* "manage_data" */ @js.native
  object manageData extends TopLevel[manageData with String]
  
  @js.native
  sealed trait manageOffer extends OperationResponseType
  /* "manage_sell_offer" */ @js.native
  object manageOffer extends TopLevel[manageOffer with String]
  
  @js.native
  sealed trait pathPayment extends OperationResponseType
  /* "path_payment_strict_receive" */ @js.native
  object pathPayment extends TopLevel[pathPayment with String]
  
  @js.native
  sealed trait pathPaymentStrictSend extends OperationResponseType
  /* "path_payment_strict_send" */ @js.native
  object pathPaymentStrictSend extends TopLevel[pathPaymentStrictSend with String]
  
  @js.native
  sealed trait payment extends OperationResponseType
  /* "payment" */ @js.native
  object payment extends TopLevel[payment with String]
  
  @js.native
  sealed trait revokeSponsorship extends OperationResponseType
  /* "revoke_sponsorship" */ @js.native
  object revokeSponsorship extends TopLevel[revokeSponsorship with String]
  
  @js.native
  sealed trait setOptions extends OperationResponseType
  /* "set_options" */ @js.native
  object setOptions extends TopLevel[setOptions with String]
}
