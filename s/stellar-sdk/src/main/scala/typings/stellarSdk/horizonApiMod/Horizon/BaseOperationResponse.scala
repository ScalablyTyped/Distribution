package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.stellarSdkStrings.effects
import typings.stellarSdk.stellarSdkStrings.precedes
import typings.stellarSdk.stellarSdkStrings.succeeds
import typings.stellarSdk.stellarSdkStrings.transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOperationResponse[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseResponse[succeeds | precedes | effects | transaction] {
  
  var created_at: String = js.native
  
  var id: String = js.native
  
  var paging_token: String = js.native
  
  var source_account: String = js.native
  
  var transaction_hash: String = js.native
  
  var `type`: T = js.native
  
  var type_i: TI = js.native
}
object BaseOperationResponse {
  
  @scala.inline
  def apply[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */](
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
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
  
  @scala.inline
  implicit class BaseOperationResponseMutableBuilder[Self <: BaseOperationResponse[_, _], T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] (val x: Self with (BaseOperationResponse[T, TI])) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaging_token(value: String): Self = StObject.set(x, "paging_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_hash(value: String): Self = StObject.set(x, "transaction_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_i(value: TI): Self = StObject.set(x, "type_i", value.asInstanceOf[js.Any])
  }
}
