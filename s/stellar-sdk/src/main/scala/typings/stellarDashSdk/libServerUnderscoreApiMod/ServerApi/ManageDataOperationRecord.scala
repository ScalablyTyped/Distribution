package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typings.node.Buffer
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.manageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ManageDataOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined name, value */ @js.native
trait ManageDataOperationRecord
  extends BaseOperationRecord[
      manageData, 
      typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageData
    ]
     with OperationRecord {
  var name: String = js.native
  var value: Buffer = js.native
}

