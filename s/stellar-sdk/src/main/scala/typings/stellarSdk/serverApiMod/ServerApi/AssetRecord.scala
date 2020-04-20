package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType.credit12
import typings.stellarBase.mod.AssetType.credit4
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetRecord
  extends BaseResponse[scala.Nothing] {
  var amount: String
  var asset_code: String
  var asset_issuer: String
  var asset_type: credit4 | credit12
  var flags: Flags
  var num_accounts: Double
  var paging_token: String
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
}

