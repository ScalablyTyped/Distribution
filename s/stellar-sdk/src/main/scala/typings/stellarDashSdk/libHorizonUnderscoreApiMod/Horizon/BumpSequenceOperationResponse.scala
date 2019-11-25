package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.bumpSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BumpSequenceOperationResponse
  extends BaseOperationResponse[
      bumpSequence, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.bumpSequence
    ] {
  var bump_to: String
}

object BumpSequenceOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    bump_to: String,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: bumpSequence,
    type_i: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.bumpSequence
  ): BumpSequenceOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], bump_to = bump_to.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequenceOperationResponse]
  }
}

