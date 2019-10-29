package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typings.stellarDashSdk.Anon_Assetcode
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentPathRecord
  extends BaseResponse[scala.Nothing] {
  var destination_amount: String
  var destination_asset_code: String
  var destination_asset_issuer: String
  var destination_asset_type: String
  var path: js.Array[Anon_Assetcode]
  var source_amount: String
  var source_asset_code: String
  var source_asset_issuer: String
  var source_asset_type: String
}

object PaymentPathRecord {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    destination_amount: String,
    destination_asset_code: String,
    destination_asset_issuer: String,
    destination_asset_type: String,
    path: js.Array[Anon_Assetcode],
    source_amount: String,
    source_asset_code: String,
    source_asset_issuer: String,
    source_asset_type: String
  ): PaymentPathRecord = {
    val __obj = js.Dynamic.literal(_links = _links, destination_amount = destination_amount, destination_asset_code = destination_asset_code, destination_asset_issuer = destination_asset_issuer, destination_asset_type = destination_asset_type, path = path, source_amount = source_amount, source_asset_code = source_asset_code, source_asset_issuer = source_asset_issuer, source_asset_type = source_asset_type)
  
    __obj.asInstanceOf[PaymentPathRecord]
  }
}

