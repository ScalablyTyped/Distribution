package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType.accountMerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse because Already inherited
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarDashSdk.stellarDashSdkMod.Horizon.AccountMergeOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined into */ @js.native
trait AccountMergeOperationRecord
  extends BaseOperationRecord[
      accountMerge, 
      typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI.accountMerge
    ]
     with OperationRecord {
  var into: String = js.native
}

