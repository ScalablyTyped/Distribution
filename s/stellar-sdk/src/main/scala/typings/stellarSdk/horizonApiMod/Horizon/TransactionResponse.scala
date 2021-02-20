package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.MemoType
import typings.stellarSdk.stellarSdkStrings.account
import typings.stellarSdk.stellarSdkStrings.effects
import typings.stellarSdk.stellarSdkStrings.ledger
import typings.stellarSdk.stellarSdkStrings.operations
import typings.stellarSdk.stellarSdkStrings.precedes
import typings.stellarSdk.stellarSdkStrings.succeeds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TransactionResponseMutableBuilder[Self <: TransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee_account(value: String): Self = StObject.set(x, "fee_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee_bump_transaction(value: FeeBumpTransactionResponse): Self = StObject.set(x, "fee_bump_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee_bump_transactionUndefined: Self = StObject.set(x, "fee_bump_transaction", js.undefined)
    
    @scala.inline
    def setFee_charged(value: Double | String): Self = StObject.set(x, "fee_charged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee_meta_xdr(value: String): Self = StObject.set(x, "fee_meta_xdr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInner_transaction(value: InnerTransactionResponse): Self = StObject.set(x, "inner_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInner_transactionUndefined: Self = StObject.set(x, "inner_transaction", js.undefined)
    
    @scala.inline
    def setMax_fee(value: Double | String): Self = StObject.set(x, "max_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
    
    @scala.inline
    def setMemo_bytes(value: String): Self = StObject.set(x, "memo_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemo_bytesUndefined: Self = StObject.set(x, "memo_bytes", js.undefined)
    
    @scala.inline
    def setMemo_type(value: MemoType): Self = StObject.set(x, "memo_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation_count(value: Double): Self = StObject.set(x, "operation_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaging_token(value: String): Self = StObject.set(x, "paging_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_account_sequence(value: String): Self = StObject.set(x, "source_account_sequence", value.asInstanceOf[js.Any])
  }
}
