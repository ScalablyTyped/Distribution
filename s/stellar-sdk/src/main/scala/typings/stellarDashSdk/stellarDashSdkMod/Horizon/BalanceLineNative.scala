package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashBase.stellarDashBaseMod.AssetType.native
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalanceLineNative extends js.Object {
  var asset_type: native
  var balance: String
}

object BalanceLineNative {
  @scala.inline
  def apply(asset_type: native, balance: String): BalanceLineNative = {
    val __obj = js.Dynamic.literal(asset_type = asset_type, balance = balance)
  
    __obj.asInstanceOf[BalanceLineNative]
  }
}

