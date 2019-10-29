package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.node.Buffer
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.manageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageDataOperationResponse
  extends BaseOperationResponse[
      manageData, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageData
    ] {
  var name: String
  var value: Buffer
}

object ManageDataOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    created_at: String,
    id: String,
    name: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: manageData,
    type_i: typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageData,
    value: Buffer
  ): ManageDataOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, created_at = created_at, id = id, name = name, paging_token = paging_token, source_account = source_account, transaction_hash = transaction_hash, type_i = type_i, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ManageDataOperationResponse]
  }
}

