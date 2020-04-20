package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarBase.mod.AssetType.native
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalanceLineNative extends js.Object {
  var asset_type: native
  var balance: String
  var buying_liabilities: String
  var selling_liabilities: String
}

object BalanceLineNative {
  @scala.inline
  def apply(asset_type: native, balance: String, buying_liabilities: String, selling_liabilities: String): BalanceLineNative = {
    val __obj = js.Dynamic.literal(asset_type = asset_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], buying_liabilities = buying_liabilities.asInstanceOf[js.Any], selling_liabilities = selling_liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalanceLineNative]
  }
}

