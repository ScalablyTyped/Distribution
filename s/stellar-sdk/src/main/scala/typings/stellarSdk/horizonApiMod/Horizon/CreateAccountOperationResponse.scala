package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountOperationResponse
  extends BaseOperationResponse[
      createAccount, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createAccount
    ] {
  var account: String = js.native
  var funder: String = js.native
  var starting_balance: String = js.native
}

object CreateAccountOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    account: String,
    created_at: String,
    funder: String,
    id: String,
    paging_token: String,
    source_account: String,
    starting_balance: String,
    transaction_hash: String,
    `type`: createAccount,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createAccount
  ): CreateAccountOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], funder = funder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], starting_balance = starting_balance.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOperationResponse]
  }
  @scala.inline
  implicit class CreateAccountOperationResponseOps[Self <: CreateAccountOperationResponse] (val x: Self) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunder(value: String): Self = this.set("funder", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarting_balance(value: String): Self = this.set("starting_balance", value.asInstanceOf[js.Any])
  }
  
}

