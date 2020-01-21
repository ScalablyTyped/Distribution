package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarBase.mod.MemoType
import typings.stellarSdk.stellarSdkStrings.account
import typings.stellarSdk.stellarSdkStrings.effects
import typings.stellarSdk.stellarSdkStrings.ledger
import typings.stellarSdk.stellarSdkStrings.operations
import typings.stellarSdk.stellarSdkStrings.precedes
import typings.stellarSdk.stellarSdkStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResponse
  extends SubmitTransactionResponse
     with BaseResponse[account | ledger | operations | effects | succeeds | precedes] {
  var created_at: String
  var fee_charged: Double
  var fee_meta_xdr: String
  var fee_paid: Double
  var id: String
  var max_fee: Double
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
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
    created_at: String,
    envelope_xdr: String,
    fee_charged: Double,
    fee_meta_xdr: String,
    fee_paid: Double,
    hash: String,
    id: String,
    ledger: Double,
    max_fee: Double,
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], envelope_xdr = envelope_xdr.asInstanceOf[js.Any], fee_charged = fee_charged.asInstanceOf[js.Any], fee_meta_xdr = fee_meta_xdr.asInstanceOf[js.Any], fee_paid = fee_paid.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], max_fee = max_fee.asInstanceOf[js.Any], memo_type = memo_type.asInstanceOf[js.Any], operation_count = operation_count.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], result_meta_xdr = result_meta_xdr.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], source_account_sequence = source_account_sequence.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResponse]
  }
}

