package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.accountMerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountMergeOperationResponse
  extends BaseOperationResponse[
      accountMerge, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.accountMerge
    ] {
  var into: String
}

object AccountMergeOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    created_at: String,
    id: String,
    into: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: accountMerge,
    type_i: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.accountMerge
  ): AccountMergeOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, created_at = created_at, id = id, into = into, paging_token = paging_token, source_account = source_account, transaction_hash = transaction_hash, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AccountMergeOperationResponse]
  }
}

