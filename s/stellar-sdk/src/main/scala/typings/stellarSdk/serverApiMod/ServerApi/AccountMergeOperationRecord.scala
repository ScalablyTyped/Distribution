package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.accountMerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.AccountMergeOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined into */ @js.native
trait AccountMergeOperationRecord
  extends BaseOperationRecord[
      accountMerge, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.accountMerge
    ]
     with OperationRecord {
  var into: String = js.native
}

