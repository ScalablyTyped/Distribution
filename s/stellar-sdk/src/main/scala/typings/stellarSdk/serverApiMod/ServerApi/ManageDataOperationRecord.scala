package typings.stellarSdk.serverApiMod.ServerApi

import typings.node.Buffer
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.ManageDataOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined name, value */ @js.native
trait ManageDataOperationRecord
  extends BaseOperationRecord[
      manageData, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageData
    ]
     with OperationRecord {
  var name: String = js.native
  var value: Buffer = js.native
}

