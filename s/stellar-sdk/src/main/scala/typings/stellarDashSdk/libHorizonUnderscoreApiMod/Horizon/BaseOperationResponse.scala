package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.stellarDashSdk.stellarDashSdkStrings.effects
import typings.stellarDashSdk.stellarDashSdkStrings.precedes
import typings.stellarDashSdk.stellarDashSdkStrings.succeeds
import typings.stellarDashSdk.stellarDashSdkStrings.transaction
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
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: T,
    type_i: TI
  ): BaseOperationResponse[T, TI] = {
    val __obj = js.Dynamic.literal(_links = _links, created_at = created_at, id = id, paging_token = paging_token, source_account = source_account, transaction_hash = transaction_hash, type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperationResponse[T, TI]]
  }
}

