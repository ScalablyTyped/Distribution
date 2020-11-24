package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType.credit12
import typings.stellarBase.mod.AssetType.credit4
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetRecord
  extends BaseResponse[scala.Nothing] {
  
  var amount: String = js.native
  
  var asset_code: String = js.native
  
  var asset_issuer: String = js.native
  
  var asset_type: credit4 | credit12 = js.native
  
  var flags: Flags = js.native
  
  var num_accounts: Double = js.native
  
  var paging_token: String = js.native
}
object AssetRecord {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    asset_code: String,
    asset_issuer: String,
    asset_type: credit4 | credit12,
    flags: Flags,
    num_accounts: Double,
    paging_token: String
  ): AssetRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], num_accounts = num_accounts.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetRecord]
  }
  
  @scala.inline
  implicit class AssetRecordOps[Self <: AssetRecord] (val x: Self) extends AnyVal {
    
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
    def setAsset_code(value: String): Self = this.set("asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_issuer(value: String): Self = this.set("asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_type(value: credit4 | credit12): Self = this.set("asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Flags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_accounts(value: Double): Self = this.set("num_accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaging_token(value: String): Self = this.set("paging_token", value.asInstanceOf[js.Any])
  }
}
