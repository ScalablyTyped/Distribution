package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "TradesCallBuilder")
@js.native
class TradesCallBuilder () extends CallBuilder[TradeRecord] {
  def forAssetPair(base: Asset, counter: Asset): this.type = js.native
  def forOffer(offerId: java.lang.String): this.type = js.native
}

