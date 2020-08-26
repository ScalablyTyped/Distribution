package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.OperationResponseType.setOptions
import typings.stellarSdk.stellarSdkNumbers.`1`
import typings.stellarSdk.stellarSdkNumbers.`2`
import typings.stellarSdk.stellarSdkStrings.auth_required_flag
import typings.stellarSdk.stellarSdkStrings.auth_revocable_flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptionsOperationResponse
  extends BaseOperationResponse[
      setOptions, 
      typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.setOptions
    ] {
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

object SetOptionsOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    clear_flags: js.Array[`1` | `2`],
    clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag],
    created_at: String,
    id: String,
    paging_token: String,
    set_flags: js.Array[`1` | `2`],
    set_flags_s: js.Array[auth_required_flag | auth_revocable_flag],
    source_account: String,
    transaction_hash: String,
    `type`: setOptions,
    type_i: typings.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.setOptions
  ): SetOptionsOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], clear_flags = clear_flags.asInstanceOf[js.Any], clear_flags_s = clear_flags_s.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], set_flags = set_flags.asInstanceOf[js.Any], set_flags_s = set_flags_s.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptionsOperationResponse]
  }
  @scala.inline
  implicit class SetOptionsOperationResponseOps[Self <: SetOptionsOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear_flagsVarargs(value: (`1` | `2`)*): Self = this.set("clear_flags", js.Array(value :_*))
    @scala.inline
    def setClear_flags(value: js.Array[`1` | `2`]): Self = this.set("clear_flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear_flags_sVarargs(value: (auth_required_flag | auth_revocable_flag)*): Self = this.set("clear_flags_s", js.Array(value :_*))
    @scala.inline
    def setClear_flags_s(value: js.Array[auth_required_flag | auth_revocable_flag]): Self = this.set("clear_flags_s", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet_flagsVarargs(value: (`1` | `2`)*): Self = this.set("set_flags", js.Array(value :_*))
    @scala.inline
    def setSet_flags(value: js.Array[`1` | `2`]): Self = this.set("set_flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet_flags_sVarargs(value: (auth_required_flag | auth_revocable_flag)*): Self = this.set("set_flags_s", js.Array(value :_*))
    @scala.inline
    def setSet_flags_s(value: js.Array[auth_required_flag | auth_revocable_flag]): Self = this.set("set_flags_s", value.asInstanceOf[js.Any])
    @scala.inline
    def setHigh_threshold(value: Double): Self = this.set("high_threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh_threshold: Self = this.set("high_threshold", js.undefined)
    @scala.inline
    def setHome_domain(value: String): Self = this.set("home_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHome_domain: Self = this.set("home_domain", js.undefined)
    @scala.inline
    def setLow_threshold(value: Double): Self = this.set("low_threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow_threshold: Self = this.set("low_threshold", js.undefined)
    @scala.inline
    def setMaster_key_weight(value: Double): Self = this.set("master_key_weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_key_weight: Self = this.set("master_key_weight", js.undefined)
    @scala.inline
    def setMed_threshold(value: Double): Self = this.set("med_threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMed_threshold: Self = this.set("med_threshold", js.undefined)
    @scala.inline
    def setSigner_key(value: String): Self = this.set("signer_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigner_key: Self = this.set("signer_key", js.undefined)
    @scala.inline
    def setSigner_weight(value: Double): Self = this.set("signer_weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigner_weight: Self = this.set("signer_weight", js.undefined)
  }
  
}

