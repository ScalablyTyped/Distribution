package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.endSponsoringFutureReserves
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.EndSponsoringFutureReservesOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined begin_sponsor */ @js.native
trait EndSponsoringFutureReservesOperationRecord
  extends BaseOperationRecord[
      endSponsoringFutureReserves, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.endSponsoringFutureReserves
    ]
     with OperationRecord {
  
  var begin_sponsor: String = js.native
}
