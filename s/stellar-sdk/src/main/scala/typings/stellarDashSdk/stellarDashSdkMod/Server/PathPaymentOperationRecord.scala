package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.pathPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse because Already inherited
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.PathPaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined from, to, asset_type, asset_code, asset_issuer, amount, source_asset_type, source_asset_code, source_asset_issuer, source_max, source_amount */ @js.native
trait PathPaymentOperationRecord
  extends BaseOperationRecord[
      pathPayment, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.pathPayment
    ]
     with OperationRecord {
  var amount: String = js.native
  var asset_code: js.UndefOr[String] = js.native
  var asset_issuer: js.UndefOr[String] = js.native
  var asset_type: AssetType = js.native
  var from: String = js.native
  var source_amount: String = js.native
  var source_asset_code: js.UndefOr[String] = js.native
  var source_asset_issuer: js.UndefOr[String] = js.native
  var source_asset_type: AssetType = js.native
  var source_max: String = js.native
  var to: String = js.native
}

