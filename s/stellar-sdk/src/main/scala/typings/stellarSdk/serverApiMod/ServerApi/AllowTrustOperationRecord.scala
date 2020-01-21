package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.AssetType
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.allowTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.AllowTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, authorize, trustee, trustor */ @js.native
trait AllowTrustOperationRecord
  extends BaseOperationRecord[
      allowTrust, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.allowTrust
    ]
     with OperationRecord {
  var asset_code: String = js.native
  var asset_issuer: String = js.native
  var asset_type: AssetType = js.native
  var authorize: Boolean = js.native
  var trustee: String = js.native
  var trustor: String = js.native
}

