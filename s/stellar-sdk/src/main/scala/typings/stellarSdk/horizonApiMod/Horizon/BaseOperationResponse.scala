package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarSdk.stellarSdkStrings.effects
import typings.stellarSdk.stellarSdkStrings.precedes
import typings.stellarSdk.stellarSdkStrings.succeeds
import typings.stellarSdk.stellarSdkStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperationResponse[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseResponse[succeeds | precedes | effects | transaction] {
  var created_at: String
  var id: String
  var paging_token: String
  var source_account: String
  var transaction_hash: String
  var `type`: T
  var type_i: TI
}

object BaseOperationResponse {
  @scala.inline
  def apply[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */](
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: T,
    type_i: TI
  ): BaseOperationResponse[T, TI] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperationResponse[T, TI]]
  }
}

