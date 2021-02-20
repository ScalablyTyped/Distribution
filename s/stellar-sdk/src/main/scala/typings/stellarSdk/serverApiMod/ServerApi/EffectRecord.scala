package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.Predicate
import org.scalablytyped.runtime.StObject
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
  implicit class EffectRecordMutableBuilder[Self <: EffectRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: js.Any): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    @scala.inline
    def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_codeUndefined: Self = StObject.set(x, "asset_code", js.undefined)
    
    @scala.inline
    def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_issuerUndefined: Self = StObject.set(x, "asset_issuer", js.undefined)
    
    @scala.inline
    def setAsset_type(value: String): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_typeUndefined: Self = StObject.set(x, "asset_type", js.undefined)
    
    @scala.inline
    def setAuth_required_flag(value: Boolean): Self = StObject.set(x, "auth_required_flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_required_flagUndefined: Self = StObject.set(x, "auth_required_flag", js.undefined)
    
    @scala.inline
    def setAuth_revokable_flag(value: Boolean): Self = StObject.set(x, "auth_revokable_flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_revokable_flagUndefined: Self = StObject.set(x, "auth_revokable_flag", js.undefined)
    
    @scala.inline
    def setBalance_id(value: String): Self = StObject.set(x, "balance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance_idUndefined: Self = StObject.set(x, "balance_id", js.undefined)
    
    @scala.inline
    def setBought_amount(value: String): Self = StObject.set(x, "bought_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBought_amountUndefined: Self = StObject.set(x, "bought_amount", js.undefined)
    
    @scala.inline
    def setBought_asset_code(value: String): Self = StObject.set(x, "bought_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBought_asset_codeUndefined: Self = StObject.set(x, "bought_asset_code", js.undefined)
    
    @scala.inline
    def setBought_asset_issuer(value: String): Self = StObject.set(x, "bought_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBought_asset_issuerUndefined: Self = StObject.set(x, "bought_asset_issuer", js.undefined)
    
    @scala.inline
    def setBought_asset_type(value: String): Self = StObject.set(x, "bought_asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBought_asset_typeUndefined: Self = StObject.set(x, "bought_asset_type", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_name(value: String): Self = StObject.set(x, "data_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_nameUndefined: Self = StObject.set(x, "data_name", js.undefined)
    
    @scala.inline
    def setFormer_sponsor(value: String): Self = StObject.set(x, "former_sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormer_sponsorUndefined: Self = StObject.set(x, "former_sponsor", js.undefined)
    
    @scala.inline
    def setHigh_threshold(value: Double): Self = StObject.set(x, "high_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh_thresholdUndefined: Self = StObject.set(x, "high_threshold", js.undefined)
    
    @scala.inline
    def setHome_domain(value: String): Self = StObject.set(x, "home_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHome_domainUndefined: Self = StObject.set(x, "home_domain", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLow_threshold(value: Double): Self = StObject.set(x, "low_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow_thresholdUndefined: Self = StObject.set(x, "low_threshold", js.undefined)
    
    @scala.inline
    def setMed_threshold(value: Double): Self = StObject.set(x, "med_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMed_thresholdUndefined: Self = StObject.set(x, "med_threshold", js.undefined)
    
    @scala.inline
    def setNew_seq(value: Double | String): Self = StObject.set(x, "new_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_seqUndefined: Self = StObject.set(x, "new_seq", js.undefined)
    
    @scala.inline
    def setNew_sponsor(value: String): Self = StObject.set(x, "new_sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_sponsorUndefined: Self = StObject.set(x, "new_sponsor", js.undefined)
    
    @scala.inline
    def setOffer_id(value: Double | String): Self = StObject.set(x, "offer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffer_idUndefined: Self = StObject.set(x, "offer_id", js.undefined)
    
    @scala.inline
    def setOperation(value: () => js.Promise[OperationRecord]): Self = StObject.set(x, "operation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setPaging_token(value: String): Self = StObject.set(x, "paging_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedes(value: () => js.Promise[EffectRecord]): Self = StObject.set(x, "precedes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrecedesUndefined: Self = StObject.set(x, "precedes", js.undefined)
    
    @scala.inline
    def setPredicate(value: Predicate): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    @scala.inline
    def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    @scala.inline
    def setSigner(value: String): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    @scala.inline
    def setSold_amount(value: String): Self = StObject.set(x, "sold_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSold_amountUndefined: Self = StObject.set(x, "sold_amount", js.undefined)
    
    @scala.inline
    def setSold_asset_code(value: String): Self = StObject.set(x, "sold_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSold_asset_codeUndefined: Self = StObject.set(x, "sold_asset_code", js.undefined)
    
    @scala.inline
    def setSold_asset_issuer(value: String): Self = StObject.set(x, "sold_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSold_asset_issuerUndefined: Self = StObject.set(x, "sold_asset_issuer", js.undefined)
    
    @scala.inline
    def setSold_asset_type(value: String): Self = StObject.set(x, "sold_asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSold_asset_typeUndefined: Self = StObject.set(x, "sold_asset_type", js.undefined)
    
    @scala.inline
    def setSponsor(value: String): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
    
    @scala.inline
    def setStarting_balance(value: String): Self = StObject.set(x, "starting_balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarting_balanceUndefined: Self = StObject.set(x, "starting_balance", js.undefined)
    
    @scala.inline
    def setSucceeds(value: () => js.Promise[EffectRecord]): Self = StObject.set(x, "succeeds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSucceedsUndefined: Self = StObject.set(x, "succeeds", js.undefined)
    
    @scala.inline
    def setTrustor(value: String): Self = StObject.set(x, "trustor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustorUndefined: Self = StObject.set(x, "trustor", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_i(value: String): Self = StObject.set(x, "type_i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
