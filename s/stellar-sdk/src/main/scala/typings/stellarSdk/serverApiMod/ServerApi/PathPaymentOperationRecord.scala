package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.AssetType
import typings.stellarSdk.AnonAssetcode
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.PathPaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined amount, asset_code, asset_issuer, asset_type, from, path, source_amount, source_asset_code, source_asset_issuer, source_asset_type, source_max, to */ @js.native
trait PathPaymentOperationRecord
  extends BaseOperationRecord[
      pathPayment, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPayment
    ]
     with OperationRecord {
  var amount: String = js.native
  var asset_code: js.UndefOr[String] = js.native
  var asset_issuer: js.UndefOr[String] = js.native
  var asset_type: AssetType = js.native
  var from: String = js.native
  var path: js.Array[AnonAssetcode] = js.native
  var source_amount: String = js.native
  var source_asset_code: js.UndefOr[String] = js.native
  var source_asset_issuer: js.UndefOr[String] = js.native
  var source_asset_type: AssetType = js.native
  var source_max: String = js.native
  var to: String = js.native
}

