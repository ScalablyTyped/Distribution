package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.bumpSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequenceOperationResponse
  extends BaseOperationResponse[
      bumpSequence, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.bumpSequence
    ] {
  var bump_to: String
}

object BumpSequenceOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    bump_to: String,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: bumpSequence,
    type_i: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.bumpSequence
  ): BumpSequenceOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, bump_to = bump_to, created_at = created_at, id = id, paging_token = paging_token, source_account = source_account, transaction_hash = transaction_hash, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BumpSequenceOperationResponse]
  }
}

