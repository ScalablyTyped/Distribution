package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ManageDataOperationResponseMutableBuilder[Self <: ManageDataOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
