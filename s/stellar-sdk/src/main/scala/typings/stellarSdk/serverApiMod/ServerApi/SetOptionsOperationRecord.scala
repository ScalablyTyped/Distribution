package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.setOptions
import typings.stellarSdk.stellarSdkNumbers.`1`
import typings.stellarSdk.stellarSdkNumbers.`2`
import typings.stellarSdk.stellarSdkStrings.auth_required_flag
import typings.stellarSdk.stellarSdkStrings.auth_revocable_flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarSdk.horizonApiMod.Horizon.SetOptionsOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined signer_key, signer_weight, master_key_weight, low_threshold, med_threshold, high_threshold, home_domain, set_flags, set_flags_s, clear_flags, clear_flags_s */ @js.native
trait SetOptionsOperationRecord
  extends BaseOperationRecord[
      setOptions, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.setOptions
    ]
     with OperationRecord {
  
  var clear_flags: js.Array[`1` | `2`] = js.native
  
  var clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag] = js.native
  
  var high_threshold: js.UndefOr[Double] = js.native
  
  var home_domain: js.UndefOr[String] = js.native
  
  var low_threshold: js.UndefOr[Double] = js.native
  
  var master_key_weight: js.UndefOr[Double] = js.native
  
  var med_threshold: js.UndefOr[Double] = js.native
  
  var set_flags: js.Array[`1` | `2`] = js.native
  
  var set_flags_s: js.Array[auth_required_flag | auth_revocable_flag] = js.native
  
  var signer_key: js.UndefOr[String] = js.native
  
  var signer_weight: js.UndefOr[Double] = js.native
}
