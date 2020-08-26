package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageDataOperationResponse
  extends BaseOperationResponse[
      manageData, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageData
    ] {
  var name: String = js.native
  var value: Buffer = js.native
}

object ManageDataOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    created_at: String,
    id: String,
    name: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: manageData,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageData,
    value: Buffer
  ): ManageDataOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageDataOperationResponse]
  }
  @scala.inline
  implicit class ManageDataOperationResponseOps[Self <: ManageDataOperationResponse] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

