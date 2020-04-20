package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectRecord
  extends BaseResponse[scala.Nothing] {
  var account: String
  var amount: js.UndefOr[js.Any] = js.undefined
  var asset_code: js.UndefOr[String] = js.undefined
  var asset_issuer: js.UndefOr[String] = js.undefined
  var asset_type: js.UndefOr[String] = js.undefined
  var auth_required_flag: js.UndefOr[Boolean] = js.undefined
  var auth_revokable_flag: js.UndefOr[Boolean] = js.undefined
  var bought_amount: js.UndefOr[String] = js.undefined
  var bought_asset_code: js.UndefOr[String] = js.undefined
  var bought_asset_issuer: js.UndefOr[String] = js.undefined
  var bought_asset_type: js.UndefOr[String] = js.undefined
  var created_at: String
  var high_threshold: js.UndefOr[Double] = js.undefined
  var home_domain: js.UndefOr[String] = js.undefined
  var id: String
  var key: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[String] = js.undefined
  var low_threshold: js.UndefOr[Double] = js.undefined
  var med_threshold: js.UndefOr[Double] = js.undefined
  var new_seq: js.UndefOr[Double | String] = js.undefined
  var offer_id: js.UndefOr[Double | String] = js.undefined
  var operation: js.UndefOr[CallFunction[OperationRecord]] = js.undefined
  var paging_token: String
  var precedes: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
  var public_key: js.UndefOr[String] = js.undefined
  var sold_amount: js.UndefOr[String] = js.undefined
  var sold_asset_code: js.UndefOr[String] = js.undefined
  var sold_asset_issuer: js.UndefOr[String] = js.undefined
  var sold_asset_type: js.UndefOr[String] = js.undefined
  var starting_balance: js.UndefOr[String] = js.undefined
  var succeeds: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
  var trustor: js.UndefOr[String] = js.undefined
  var `type`: String
  var type_i: String
  var weight: js.UndefOr[Double] = js.undefined
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
    type_i: String,
    amount: js.Any = null,
    asset_code: String = null,
    asset_issuer: String = null,
    asset_type: String = null,
    auth_required_flag: js.UndefOr[Boolean] = js.undefined,
    auth_revokable_flag: js.UndefOr[Boolean] = js.undefined,
    bought_amount: String = null,
    bought_asset_code: String = null,
    bought_asset_issuer: String = null,
    bought_asset_type: String = null,
    high_threshold: Int | Double = null,
    home_domain: String = null,
    key: String = null,
    limit: String = null,
    low_threshold: Int | Double = null,
    med_threshold: Int | Double = null,
    new_seq: Double | String = null,
    offer_id: Double | String = null,
    operation: () => js.Promise[OperationRecord] = null,
    precedes: () => js.Promise[EffectRecord] = null,
    public_key: String = null,
    sold_amount: String = null,
    sold_asset_code: String = null,
    sold_asset_issuer: String = null,
    sold_asset_type: String = null,
    starting_balance: String = null,
    succeeds: () => js.Promise[EffectRecord] = null,
    trustor: String = null,
    weight: Int | Double = null
  ): EffectRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (asset_code != null) __obj.updateDynamic("asset_code")(asset_code.asInstanceOf[js.Any])
    if (asset_issuer != null) __obj.updateDynamic("asset_issuer")(asset_issuer.asInstanceOf[js.Any])
    if (asset_type != null) __obj.updateDynamic("asset_type")(asset_type.asInstanceOf[js.Any])
    if (!js.isUndefined(auth_required_flag)) __obj.updateDynamic("auth_required_flag")(auth_required_flag.asInstanceOf[js.Any])
    if (!js.isUndefined(auth_revokable_flag)) __obj.updateDynamic("auth_revokable_flag")(auth_revokable_flag.asInstanceOf[js.Any])
    if (bought_amount != null) __obj.updateDynamic("bought_amount")(bought_amount.asInstanceOf[js.Any])
    if (bought_asset_code != null) __obj.updateDynamic("bought_asset_code")(bought_asset_code.asInstanceOf[js.Any])
    if (bought_asset_issuer != null) __obj.updateDynamic("bought_asset_issuer")(bought_asset_issuer.asInstanceOf[js.Any])
    if (bought_asset_type != null) __obj.updateDynamic("bought_asset_type")(bought_asset_type.asInstanceOf[js.Any])
    if (high_threshold != null) __obj.updateDynamic("high_threshold")(high_threshold.asInstanceOf[js.Any])
    if (home_domain != null) __obj.updateDynamic("home_domain")(home_domain.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (low_threshold != null) __obj.updateDynamic("low_threshold")(low_threshold.asInstanceOf[js.Any])
    if (med_threshold != null) __obj.updateDynamic("med_threshold")(med_threshold.asInstanceOf[js.Any])
    if (new_seq != null) __obj.updateDynamic("new_seq")(new_seq.asInstanceOf[js.Any])
    if (offer_id != null) __obj.updateDynamic("offer_id")(offer_id.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(js.Any.fromFunction0(operation))
    if (precedes != null) __obj.updateDynamic("precedes")(js.Any.fromFunction0(precedes))
    if (public_key != null) __obj.updateDynamic("public_key")(public_key.asInstanceOf[js.Any])
    if (sold_amount != null) __obj.updateDynamic("sold_amount")(sold_amount.asInstanceOf[js.Any])
    if (sold_asset_code != null) __obj.updateDynamic("sold_asset_code")(sold_asset_code.asInstanceOf[js.Any])
    if (sold_asset_issuer != null) __obj.updateDynamic("sold_asset_issuer")(sold_asset_issuer.asInstanceOf[js.Any])
    if (sold_asset_type != null) __obj.updateDynamic("sold_asset_type")(sold_asset_type.asInstanceOf[js.Any])
    if (starting_balance != null) __obj.updateDynamic("starting_balance")(starting_balance.asInstanceOf[js.Any])
    if (succeeds != null) __obj.updateDynamic("succeeds")(js.Any.fromFunction0(succeeds))
    if (trustor != null) __obj.updateDynamic("trustor")(trustor.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectRecord]
  }
}

