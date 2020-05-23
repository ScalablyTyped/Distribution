package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.AssetType.credit12
import typings.stellarBase.mod.AssetType.credit4
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.changeTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.ChangeTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, trustee, trustor, limit */ @js.native
trait ChangeTrustOperationRecord
  extends BaseOperationRecord[
      changeTrust, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.changeTrust
    ]
     with OperationRecord {
  var asset_code: String = js.native
  var asset_issuer: String = js.native
  var asset_type: credit4 | credit12 = js.native
  var limit: String = js.native
  var trustee: String = js.native
  var trustor: String = js.native
}

