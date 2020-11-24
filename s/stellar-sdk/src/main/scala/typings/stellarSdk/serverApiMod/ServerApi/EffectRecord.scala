package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectRecord
  extends BaseResponse[scala.Nothing] {
  
  var account: String = js.native
  
  var amount: js.UndefOr[js.Any] = js.native
  
  var asset: js.UndefOr[String] = js.native
  
  var asset_code: js.UndefOr[String] = js.native
  
  var asset_issuer: js.UndefOr[String] = js.native
  
  var asset_type: js.UndefOr[String] = js.native
  
  var auth_required_flag: js.UndefOr[Boolean] = js.native
  
  var auth_revokable_flag: js.UndefOr[Boolean] = js.native
  
  var balance_id: js.UndefOr[String] = js.native
  
  var bought_amount: js.UndefOr[String] = js.native
  
  var bought_asset_code: js.UndefOr[String] = js.native
  
  var bought_asset_issuer: js.UndefOr[String] = js.native
  
  var bought_asset_type: js.UndefOr[String] = js.native
  
  var created_at: String = js.native
  
  var data_name: js.UndefOr[String] = js.native
  
  var former_sponsor: js.UndefOr[String] = js.native
  
  var high_threshold: js.UndefOr[Double] = js.native
  
  var home_domain: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[String] = js.native
  
  var low_threshold: js.UndefOr[Double] = js.native
  
  var med_threshold: js.UndefOr[Double] = js.native
  
  var new_seq: js.UndefOr[Double | String] = js.native
  
  var new_sponsor: js.UndefOr[String] = js.native
  
  var offer_id: js.UndefOr[Double | String] = js.native
  
  var operation: js.UndefOr[CallFunction[OperationRecord]] = js.native
  
  var paging_token: String = js.native
  
  var precedes: js.UndefOr[CallFunction[EffectRecord]] = js.native
  
  var predicate: js.UndefOr[Predicate] = js.native
  
  var public_key: js.UndefOr[String] = js.native
  
  var signer: js.UndefOr[String] = js.native
  
  var sold_amount: js.UndefOr[String] = js.native
  
  var sold_asset_code: js.UndefOr[String] = js.native
  
  var sold_asset_issuer: js.UndefOr[String] = js.native
  
  var sold_asset_type: js.UndefOr[String] = js.native
  
  var sponsor: js.UndefOr[String] = js.native
  
  var starting_balance: js.UndefOr[String] = js.native
  
  var succeeds: js.UndefOr[CallFunction[EffectRecord]] = js.native
  
  var trustor: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
  
  var type_i: String = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object EffectRecord {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    account: String,
    created_at: String,
    id: String,
    paging_token: String,
    `type`: String,
    type_i: String
  ): EffectRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectRecord]
  }
  
  @scala.inline
  implicit class EffectRecordOps[Self <: EffectRecord] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaging_token(value: String): Self = this.set("paging_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_i(value: String): Self = this.set("type_i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: js.Any): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setAsset(value: String): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setAsset_code(value: String): Self = this.set("asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset_code: Self = this.set("asset_code", js.undefined)
    
    @scala.inline
    def setAsset_issuer(value: String): Self = this.set("asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset_issuer: Self = this.set("asset_issuer", js.undefined)
    
    @scala.inline
    def setAsset_type(value: String): Self = this.set("asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset_type: Self = this.set("asset_type", js.undefined)
    
    @scala.inline
    def setAuth_required_flag(value: Boolean): Self = this.set("auth_required_flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth_required_flag: Self = this.set("auth_required_flag", js.undefined)
    
    @scala.inline
    def setAuth_revokable_flag(value: Boolean): Self = this.set("auth_revokable_flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth_revokable_flag: Self = this.set("auth_revokable_flag", js.undefined)
    
    @scala.inline
    def setBalance_id(value: String): Self = this.set("balance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalance_id: Self = this.set("balance_id", js.undefined)
    
    @scala.inline
    def setBought_amount(value: String): Self = this.set("bought_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBought_amount: Self = this.set("bought_amount", js.undefined)
    
    @scala.inline
    def setBought_asset_code(value: String): Self = this.set("bought_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBought_asset_code: Self = this.set("bought_asset_code", js.undefined)
    
    @scala.inline
    def setBought_asset_issuer(value: String): Self = this.set("bought_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBought_asset_issuer: Self = this.set("bought_asset_issuer", js.undefined)
    
    @scala.inline
    def setBought_asset_type(value: String): Self = this.set("bought_asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBought_asset_type: Self = this.set("bought_asset_type", js.undefined)
    
    @scala.inline
    def setData_name(value: String): Self = this.set("data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_name: Self = this.set("data_name", js.undefined)
    
    @scala.inline
    def setFormer_sponsor(value: String): Self = this.set("former_sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormer_sponsor: Self = this.set("former_sponsor", js.undefined)
    
    @scala.inline
    def setHigh_threshold(value: Double): Self = this.set("high_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh_threshold: Self = this.set("high_threshold", js.undefined)
    
    @scala.inline
    def setHome_domain(value: String): Self = this.set("home_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHome_domain: Self = this.set("home_domain", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLow_threshold(value: Double): Self = this.set("low_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow_threshold: Self = this.set("low_threshold", js.undefined)
    
    @scala.inline
    def setMed_threshold(value: Double): Self = this.set("med_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMed_threshold: Self = this.set("med_threshold", js.undefined)
    
    @scala.inline
    def setNew_seq(value: Double | String): Self = this.set("new_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_seq: Self = this.set("new_seq", js.undefined)
    
    @scala.inline
    def setNew_sponsor(value: String): Self = this.set("new_sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_sponsor: Self = this.set("new_sponsor", js.undefined)
    
    @scala.inline
    def setOffer_id(value: Double | String): Self = this.set("offer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffer_id: Self = this.set("offer_id", js.undefined)
    
    @scala.inline
    def setOperation(value: () => js.Promise[OperationRecord]): Self = this.set("operation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setPrecedes(value: () => js.Promise[EffectRecord]): Self = this.set("precedes", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePrecedes: Self = this.set("precedes", js.undefined)
    
    @scala.inline
    def setPredicate(value: Predicate): Self = this.set("predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    
    @scala.inline
    def setPublic_key(value: String): Self = this.set("public_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic_key: Self = this.set("public_key", js.undefined)
    
    @scala.inline
    def setSigner(value: String): Self = this.set("signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigner: Self = this.set("signer", js.undefined)
    
    @scala.inline
    def setSold_amount(value: String): Self = this.set("sold_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSold_amount: Self = this.set("sold_amount", js.undefined)
    
    @scala.inline
    def setSold_asset_code(value: String): Self = this.set("sold_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSold_asset_code: Self = this.set("sold_asset_code", js.undefined)
    
    @scala.inline
    def setSold_asset_issuer(value: String): Self = this.set("sold_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSold_asset_issuer: Self = this.set("sold_asset_issuer", js.undefined)
    
    @scala.inline
    def setSold_asset_type(value: String): Self = this.set("sold_asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSold_asset_type: Self = this.set("sold_asset_type", js.undefined)
    
    @scala.inline
    def setSponsor(value: String): Self = this.set("sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSponsor: Self = this.set("sponsor", js.undefined)
    
    @scala.inline
    def setStarting_balance(value: String): Self = this.set("starting_balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarting_balance: Self = this.set("starting_balance", js.undefined)
    
    @scala.inline
    def setSucceeds(value: () => js.Promise[EffectRecord]): Self = this.set("succeeds", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSucceeds: Self = this.set("succeeds", js.undefined)
    
    @scala.inline
    def setTrustor(value: String): Self = this.set("trustor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustor: Self = this.set("trustor", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
