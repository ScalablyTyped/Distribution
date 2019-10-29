package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.bumpSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BumpSequenceOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined bump_to */ @js.native
trait BumpSequenceOperationRecord
  extends BaseOperationRecord[
      bumpSequence, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.bumpSequence
    ]
     with OperationRecord {
  var bump_to: String = js.native
}

