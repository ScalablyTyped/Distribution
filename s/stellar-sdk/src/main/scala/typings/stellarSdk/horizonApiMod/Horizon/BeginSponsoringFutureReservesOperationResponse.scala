package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.beginSponsoringFutureReserves
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginSponsoringFutureReservesOperationResponse
  extends BaseOperationResponse[
      beginSponsoringFutureReserves, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.beginSponsoringFutureReserves
    ] {
  
  var sponsored_id: String = js.native
}
object BeginSponsoringFutureReservesOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    sponsored_id: String,
    transaction_hash: String,
    `type`: beginSponsoringFutureReserves,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.beginSponsoringFutureReserves
  ): BeginSponsoringFutureReservesOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], sponsored_id = sponsored_id.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginSponsoringFutureReservesOperationResponse]
  }
  
  @scala.inline
  implicit class BeginSponsoringFutureReservesOperationResponseMutableBuilder[Self <: BeginSponsoringFutureReservesOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSponsored_id(value: String): Self = StObject.set(x, "sponsored_id", value.asInstanceOf[js.Any])
  }
}
