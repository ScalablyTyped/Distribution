package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createClaimableBalance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClaimableBalanceOperationResponse
  extends BaseOperationResponse[
      createClaimableBalance, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createClaimableBalance
    ] {
  
  var amount: String = js.native
  
  var asset: String = js.native
  
  var claimants: js.Array[Claimant] = js.native
  
  var sponsor: String = js.native
}
object CreateClaimableBalanceOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    asset: String,
    claimants: js.Array[Claimant],
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    sponsor: String,
    transaction_hash: String,
    `type`: createClaimableBalance,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createClaimableBalance
  ): CreateClaimableBalanceOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], claimants = claimants.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], sponsor = sponsor.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClaimableBalanceOperationResponse]
  }
  
  @scala.inline
  implicit class CreateClaimableBalanceOperationResponseOps[Self <: CreateClaimableBalanceOperationResponse] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: String): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimantsVarargs(value: Claimant*): Self = this.set("claimants", js.Array(value :_*))
    
    @scala.inline
    def setClaimants(value: js.Array[Claimant]): Self = this.set("claimants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsor(value: String): Self = this.set("sponsor", value.asInstanceOf[js.Any])
  }
}
