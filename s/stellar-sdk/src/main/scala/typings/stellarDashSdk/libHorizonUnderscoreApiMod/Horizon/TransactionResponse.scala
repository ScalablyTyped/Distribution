package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.MemoType
import typings.stellarDashSdk.stellarDashSdkStrings.account
import typings.stellarDashSdk.stellarDashSdkStrings.effects
import typings.stellarDashSdk.stellarDashSdkStrings.ledger
import typings.stellarDashSdk.stellarDashSdkStrings.operations
import typings.stellarDashSdk.stellarDashSdkStrings.precedes
import typings.stellarDashSdk.stellarDashSdkStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResponse
  extends SubmitTransactionResponse
     with BaseResponse[account | ledger | operations | effects | succeeds | precedes] {
  var created_at: String
  var fee_meta_xdr: String
  var fee_paid: Double
  var id: String
  var memo: js.UndefOr[String] = js.undefined
  var memo_type: MemoType
  var operation_count: Double
  var paging_token: String
  var signatures: js.Array[String]
  var source_account: String
  var source_account_sequence: String
}

object TransactionResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    created_at: String,
    envelope_xdr: String,
    fee_meta_xdr: String,
    fee_paid: Double,
    hash: String,
    id: String,
    ledger: Double,
    memo_type: MemoType,
    operation_count: Double,
    paging_token: String,
    result_meta_xdr: String,
    result_xdr: String,
    signatures: js.Array[String],
    source_account: String,
    source_account_sequence: String,
    memo: String = null
  ): TransactionResponse = {
    val __obj = js.Dynamic.literal(_links = _links, created_at = created_at, envelope_xdr = envelope_xdr, fee_meta_xdr = fee_meta_xdr, fee_paid = fee_paid, hash = hash, id = id, ledger = ledger, memo_type = memo_type.asInstanceOf[js.Any], operation_count = operation_count, paging_token = paging_token, result_meta_xdr = result_meta_xdr, result_xdr = result_xdr, signatures = signatures, source_account = source_account, source_account_sequence = source_account_sequence)
    if (memo != null) __obj.updateDynamic("memo")(memo)
    __obj.asInstanceOf[TransactionResponse]
  }
}

