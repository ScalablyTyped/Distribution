package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.revokeSponsorship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.RevokeSponsorshipOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined account_id, claimable_balance_id, data_account_id, data_name, offer_id, trustline_account_id, trustline_asset, signer_account_id, signer_key */ @js.native
trait RevokeSponsorshipOperationRecord
  extends BaseOperationRecord[
      revokeSponsorship, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.revokeSponsorship
    ]
     with OperationRecord {
  
  var account_id: js.UndefOr[String] = js.native
  
  var claimable_balance_id: js.UndefOr[String] = js.native
  
  var data_account_id: js.UndefOr[String] = js.native
  
  var data_name: js.UndefOr[String] = js.native
  
  var offer_id: js.UndefOr[String] = js.native
  
  var signer_account_id: js.UndefOr[String] = js.native
  
  var signer_key: js.UndefOr[String] = js.native
  
  var trustline_account_id: js.UndefOr[String] = js.native
  
  var trustline_asset: js.UndefOr[String] = js.native
}
