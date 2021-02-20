package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.Claimant
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createClaimableBalance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.CreateClaimableBalanceOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset, amount, sponsor, claimants */ @js.native
trait CreateClaimableBalanceOperationRecord
  extends BaseOperationRecord[
      createClaimableBalance, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createClaimableBalance
    ]
     with OperationRecord {
  
  var amount: String = js.native
  
  var asset: String = js.native
  
  var claimants: js.Array[Claimant] = js.native
  
  var sponsor: String = js.native
}
