package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import org.scalablytyped.runtime.StringDictionary
import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.stellarDashSdkStrings.data
import typings.stellarDashSdk.stellarDashSdkStrings.effects
import typings.stellarDashSdk.stellarDashSdkStrings.offers
import typings.stellarDashSdk.stellarDashSdkStrings.operations
import typings.stellarDashSdk.stellarDashSdkStrings.payments
import typings.stellarDashSdk.stellarDashSdkStrings.trades
import typings.stellarDashSdk.stellarDashSdkStrings.transactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountResponse extends BaseResponse[transactions | operations | payments | effects | offers | trades | data] {
  var account_id: String
  var balances: js.Array[BalanceLine[AssetType]]
  var data: StringDictionary[String]
  var flags: Flags
  var id: String
  var paging_token: String
  var sequence: String
  var signers: js.Array[AccountSigner]
  var subentry_count: Double
  var thresholds: AccountThresholds
}

object AccountResponse {
  @scala.inline
  def apply(
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any,
    account_id: String,
    balances: js.Array[BalanceLine[AssetType]],
    data: StringDictionary[String],
    flags: Flags,
    id: String,
    paging_token: String,
    sequence: String,
    signers: js.Array[AccountSigner],
    subentry_count: Double,
    thresholds: AccountThresholds
  ): AccountResponse = {
    val __obj = js.Dynamic.literal(_links = _links, account_id = account_id, balances = balances, data = data, flags = flags, id = id, paging_token = paging_token, sequence = sequence, signers = signers, subentry_count = subentry_count, thresholds = thresholds)
  
    __obj.asInstanceOf[AccountResponse]
  }
}

