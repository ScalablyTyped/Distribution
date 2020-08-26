package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
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

@js.native
trait TransactionResponse
  extends SubmitTransactionResponse
     with BaseResponse[account | ledger | operations | effects | succeeds | precedes] {
  var created_at: String = js.native
  var fee_account: String = js.native
  var fee_bump_transaction: js.UndefOr[FeeBumpTransactionResponse] = js.native
  var fee_charged: Double | String = js.native
  var fee_meta_xdr: String = js.native
  var id: String = js.native
  var inner_transaction: js.UndefOr[InnerTransactionResponse] = js.native
  var max_fee: Double | String = js.native
  var memo: js.UndefOr[String] = js.native
  var memo_bytes: js.UndefOr[String] = js.native
  var memo_type: MemoType = js.native
  var operation_count: Double = js.native
  var paging_token: String = js.native
  var signatures: js.Array[String] = js.native
  var source_account: String = js.native
  var source_account_sequence: String = js.native
}

object TransactionResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    created_at: String,
    envelope_xdr: String,
    fee_account: String,
    fee_charged: Double | String,
    fee_meta_xdr: String,
    hash: String,
    id: String,
    ledger: Double,
    max_fee: Double | String,
    memo_type: MemoType,
    operation_count: Double,
    paging_token: String,
    result_meta_xdr: String,
    result_xdr: String,
    signatures: js.Array[String],
    source_account: String,
    source_account_sequence: String
  ): TransactionResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], envelope_xdr = envelope_xdr.asInstanceOf[js.Any], fee_account = fee_account.asInstanceOf[js.Any], fee_charged = fee_charged.asInstanceOf[js.Any], fee_meta_xdr = fee_meta_xdr.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], max_fee = max_fee.asInstanceOf[js.Any], memo_type = memo_type.asInstanceOf[js.Any], operation_count = operation_count.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], result_meta_xdr = result_meta_xdr.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], source_account_sequence = source_account_sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResponse]
  }
  @scala.inline
  implicit class TransactionResponseOps[Self <: TransactionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setFee_account(value: String): Self = this.set("fee_account", value.asInstanceOf[js.Any])
    @scala.inline
    def setFee_charged(value: Double | String): Self = this.set("fee_charged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFee_meta_xdr(value: String): Self = this.set("fee_meta_xdr", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_fee(value: Double | String): Self = this.set("max_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemo_type(value: MemoType): Self = this.set("memo_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation_count(value: Double): Self = this.set("operation_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaging_token(value: String): Self = this.set("paging_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource_account(value: String): Self = this.set("source_account", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource_account_sequence(value: String): Self = this.set("source_account_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setFee_bump_transaction(value: FeeBumpTransactionResponse): Self = this.set("fee_bump_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFee_bump_transaction: Self = this.set("fee_bump_transaction", js.undefined)
    @scala.inline
    def setInner_transaction(value: InnerTransactionResponse): Self = this.set("inner_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInner_transaction: Self = this.set("inner_transaction", js.undefined)
    @scala.inline
    def setMemo(value: String): Self = this.set("memo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemo: Self = this.set("memo", js.undefined)
    @scala.inline
    def setMemo_bytes(value: String): Self = this.set("memo_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemo_bytes: Self = this.set("memo_bytes", js.undefined)
  }
  
}

