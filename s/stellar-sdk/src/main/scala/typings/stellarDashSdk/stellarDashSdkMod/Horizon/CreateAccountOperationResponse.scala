package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.createAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountOperationResponse
  extends BaseOperationResponse[
      createAccount, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.createAccount
    ] {
  var account: String
  var funder: String
  var starting_balance: String
}

object CreateAccountOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    account: String,
    created_at: String,
    funder: String,
    id: String,
    paging_token: String,
    source_account: String,
    starting_balance: String,
    transaction_hash: String,
    `type`: createAccount,
    type_i: typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.createAccount
  ): CreateAccountOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links, account = account, created_at = created_at, funder = funder, id = id, paging_token = paging_token, source_account = source_account, starting_balance = starting_balance, transaction_hash = transaction_hash, type_i = type_i)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateAccountOperationResponse]
  }
}

