package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationResponseType extends js.Object

@JSImport("stellar-sdk", "Horizon.OperationResponseType")
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
  sealed trait manageData extends OperationResponseType
  
  @js.native
  sealed trait manageOffer extends OperationResponseType
  
  @js.native
  sealed trait pathPayment extends OperationResponseType
  
  @js.native
  sealed trait payment extends OperationResponseType
  
  @js.native
  sealed trait setOptions extends OperationResponseType
  
  /* "account_merge" */ val accountMerge: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.accountMerge with String = js.native
  /* "allow_trust" */ val allowTrust: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.allowTrust with String = js.native
  /* "bump_sequence" */ val bumpSequence: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.bumpSequence with String = js.native
  /* "change_trust" */ val changeTrust: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.changeTrust with String = js.native
  /* "create_account" */ val createAccount: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.createAccount with String = js.native
  /* "create_passive_offer" */ val createPassiveOffer: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.createPassiveOffer with String = js.native
  /* "inflation" */ val inflation: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.inflation with String = js.native
  /* "manage_data" */ val manageData: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.manageData with String = js.native
  /* "manage_offer" */ val manageOffer: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.manageOffer with String = js.native
  /* "path_payment" */ val pathPayment: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.pathPayment with String = js.native
  /* "payment" */ val payment: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.payment with String = js.native
  /* "set_options" */ val setOptions: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.setOptions with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OperationResponseType with String] = js.native
}

