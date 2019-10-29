package typings.stellarDashSdk.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Horizon")
@js.native
object Horizon extends js.Object {
  @js.native
  object OperationResponseType extends js.Object {
    /* "account_merge" */ val accountMerge: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.accountMerge with String = js.native
    /* "allow_trust" */ val allowTrust: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.allowTrust with String = js.native
    /* "bump_sequence" */ val bumpSequence: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.bumpSequence with String = js.native
    /* "change_trust" */ val changeTrust: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.changeTrust with String = js.native
    /* "create_account" */ val createAccount: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.createAccount with String = js.native
    /* "create_passive_offer" */ val createPassiveOffer: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.createPassiveOffer with String = js.native
    /* "inflation" */ val inflation: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.inflation with String = js.native
    /* "manage_data" */ val manageData: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.manageData with String = js.native
    /* "manage_offer" */ val manageOffer: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.manageOffer with String = js.native
    /* "path_payment" */ val pathPayment: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.pathPayment with String = js.native
    /* "payment" */ val payment: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.payment with String = js.native
    /* "set_options" */ val setOptions: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.setOptions with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType with String
      ] = js.native
  }
  
  @js.native
  object OperationResponseTypeI extends js.Object {
    /* 8 */ val accountMerge: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.accountMerge with Double = js.native
    /* 7 */ val allowTrust: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.allowTrust with Double = js.native
    /* 11 */ val bumpSequence: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.bumpSequence with Double = js.native
    /* 6 */ val changeTrust: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.changeTrust with Double = js.native
    /* 0 */ val createAccount: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.createAccount with Double = js.native
    /* 3 */ val createPassiveOffer: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.createPassiveOffer with Double = js.native
    /* 9 */ val inflation: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.inflation with Double = js.native
    /* 10 */ val manageData: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageData with Double = js.native
    /* 4 */ val manageOffer: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageOffer with Double = js.native
    /* 2 */ val pathPayment: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.pathPayment with Double = js.native
    /* 1 */ val payment: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.payment with Double = js.native
    /* 5 */ val setOptions: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.setOptions with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI with Double
      ] = js.native
  }
  
  @js.native
  object TransactionFailedResultCodes extends js.Object {
    /* "tx_bad_auth" */ val TX_BAD_AUTH: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_AUTH with String = js.native
    /* "tx_bad_auth_extra" */ val TX_BAD_AUTH_EXTRA: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_AUTH_EXTRA with String = js.native
    /* "tx_bad_seq" */ val TX_BAD_SEQ: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_SEQ with String = js.native
    /* "tx_failed" */ val TX_FAILED: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes.TX_FAILED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes with String
      ] = js.native
  }
  
}

