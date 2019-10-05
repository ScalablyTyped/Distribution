package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.createPassiveOffer
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.PriceR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse because Already inherited
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.PassiveOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
trait PassiveOfferOperationRecord
  extends BaseOperationRecord[
      createPassiveOffer, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.createPassiveOffer
    ]
     with OperationRecord {
  var amount: String = js.native
  var buying_asset_code: js.UndefOr[String] = js.native
  var buying_asset_issuer: js.UndefOr[String] = js.native
  var buying_asset_type: AssetType = js.native
  var offer_id: Double = js.native
  var price: String = js.native
  var price_r: PriceR = js.native
  var selling_asset_code: js.UndefOr[String] = js.native
  var selling_asset_issuer: js.UndefOr[String] = js.native
  var selling_asset_type: AssetType = js.native
}

