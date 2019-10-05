package typings.stellarDashSdk.stellarDashSdkMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.TradesCallBuilder")
@js.native
abstract class TradesCallBuilder () extends CallBuilder[TradeRecord] {
  def forAssetPair(
    base: typings.stellarDashBase.stellarDashBaseMod.Asset,
    counter: typings.stellarDashBase.stellarDashBaseMod.Asset
  ): this.type = js.native
  def forOffer(offerId: String): this.type = js.native
}

