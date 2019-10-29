package typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit12
import typings.stellarDashBase.stellarDashBaseMod.AssetType.credit4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalanceLineAsset[T /* <: credit4 | credit12 */] extends js.Object {
  var asset_code: String
  var asset_issuer: String
  var asset_type: T
  var balance: String
  var buying_liabilities: String
  var last_modified_ledger: Double
  var limit: String
  var selling_liabilities: String
}

object BalanceLineAsset {
  @scala.inline
  def apply[T /* <: credit4 | credit12 */](
    asset_code: String,
    asset_issuer: String,
    asset_type: T,
    balance: String,
    buying_liabilities: String,
    last_modified_ledger: Double,
    limit: String,
    selling_liabilities: String
  ): BalanceLineAsset[T] = {
    val __obj = js.Dynamic.literal(asset_code = asset_code, asset_issuer = asset_issuer, asset_type = asset_type.asInstanceOf[js.Any], balance = balance, buying_liabilities = buying_liabilities, last_modified_ledger = last_modified_ledger, limit = limit, selling_liabilities = selling_liabilities)
  
    __obj.asInstanceOf[BalanceLineAsset[T]]
  }
}

