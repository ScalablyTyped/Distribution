package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationResponseType extends js.Object

@JSImport("stellar-sdk/lib/horizon_api", "Horizon.OperationResponseType")
@js.native
object OperationResponseType extends js.Object {
  @js.native
  sealed trait accountMerge extends OperationResponseType
  
  @js.native
  sealed trait allowTrust extends OperationResponseType
  
  @js.native
  sealed trait bumpSequence extends OperationResponseType
  
  @js.native
  sealed trait changeTrust extends OperationResponseType
  
  @js.native
  sealed trait createAccount extends OperationResponseType
  
  @js.native
  sealed trait createPassiveOffer extends OperationResponseType
  
  @js.native
  sealed trait inflation extends OperationResponseType
  
  @js.native
  sealed trait manageBuyOffer extends OperationResponseType
  
  @js.native
  sealed trait manageData extends OperationResponseType
  
  @js.native
  sealed trait manageOffer extends OperationResponseType
  
  @js.native
  sealed trait pathPayment extends OperationResponseType
  
  @js.native
  sealed trait pathPaymentStrictSend extends OperationResponseType
  
  @js.native
  sealed trait payment extends OperationResponseType
  
  @js.native
  sealed trait setOptions extends OperationResponseType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OperationResponseType with String] = js.native
  /* "account_merge" */ @js.native
  object accountMerge extends TopLevel[accountMerge with String]
  
  /* "allow_trust" */ @js.native
  object allowTrust extends TopLevel[allowTrust with String]
  
  /* "bump_sequence" */ @js.native
  object bumpSequence extends TopLevel[bumpSequence with String]
  
  /* "change_trust" */ @js.native
  object changeTrust extends TopLevel[changeTrust with String]
  
  /* "create_account" */ @js.native
  object createAccount extends TopLevel[createAccount with String]
  
  /* "create_passive_sell_offer" */ @js.native
  object createPassiveOffer extends TopLevel[createPassiveOffer with String]
  
  /* "inflation" */ @js.native
  object inflation extends TopLevel[inflation with String]
  
  /* "manage_buy_offer" */ @js.native
  object manageBuyOffer extends TopLevel[manageBuyOffer with String]
  
  /* "manage_data" */ @js.native
  object manageData extends TopLevel[manageData with String]
  
  /* "manage_sell_offer" */ @js.native
  object manageOffer extends TopLevel[manageOffer with String]
  
  /* "path_payment_strict_receive" */ @js.native
  object pathPayment extends TopLevel[pathPayment with String]
  
  /* "path_payment_strict_send" */ @js.native
  object pathPaymentStrictSend extends TopLevel[pathPaymentStrictSend with String]
  
  /* "payment" */ @js.native
  object payment extends TopLevel[payment with String]
  
  /* "set_options" */ @js.native
  object setOptions extends TopLevel[setOptions with String]
  
}

