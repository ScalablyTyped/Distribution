package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit12
import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit4
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.changeTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ChangeTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, trustee, trustor, limit */ @js.native
trait ChangeTrustOperationRecord
  extends BaseOperationRecord[
      changeTrust, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.changeTrust
    ]
     with OperationRecord {
  var asset_code: String = js.native
  var asset_issuer: String = js.native
  var asset_type: credit4 | credit12 = js.native
  var limit: String = js.native
  var trustee: String = js.native
  var trustor: String = js.native
}

