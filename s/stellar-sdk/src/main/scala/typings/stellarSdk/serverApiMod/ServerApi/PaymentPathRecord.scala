package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.anon.Assetissuer
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentPathRecord
  extends BaseResponse[scala.Nothing] {
  var destination_amount: String
  var destination_asset_code: String
  var destination_asset_issuer: String
  var destination_asset_type: String
  var path: js.Array[Assetissuer]
  var source_amount: String
  var source_asset_code: String
  var source_asset_issuer: String
  var source_asset_type: String
}

object PaymentPathRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    destination_amount: String,
    destination_asset_code: String,
    destination_asset_issuer: String,
    destination_asset_type: String,
    path: js.Array[Assetissuer],
    source_amount: String,
    source_asset_code: String,
    source_asset_issuer: String,
    source_asset_type: String
  ): PaymentPathRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], destination_amount = destination_amount.asInstanceOf[js.Any], destination_asset_code = destination_asset_code.asInstanceOf[js.Any], destination_asset_issuer = destination_asset_issuer.asInstanceOf[js.Any], destination_asset_type = destination_asset_type.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], source_amount = source_amount.asInstanceOf[js.Any], source_asset_code = source_asset_code.asInstanceOf[js.Any], source_asset_issuer = source_asset_issuer.asInstanceOf[js.Any], source_asset_type = source_asset_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPathRecord]
  }
}

