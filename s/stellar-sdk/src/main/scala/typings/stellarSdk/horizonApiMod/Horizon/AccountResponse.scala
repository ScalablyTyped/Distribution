package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType
import typings.stellarSdk.stellarSdkStrings.data
import typings.stellarSdk.stellarSdkStrings.effects
import typings.stellarSdk.stellarSdkStrings.offers
import typings.stellarSdk.stellarSdkStrings.operations
import typings.stellarSdk.stellarSdkStrings.payments
import typings.stellarSdk.stellarSdkStrings.trades
import typings.stellarSdk.stellarSdkStrings.transactions
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
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account_id = account_id.asInstanceOf[js.Any], balances = balances.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], subentry_count = subentry_count.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountResponse]
  }
}

