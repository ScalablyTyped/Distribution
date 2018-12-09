package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server")
@js.native
class Server protected () extends js.Object {
  def this(serverURL: java.lang.String) = this()
  def this(serverURL: java.lang.String, options: stellarDashSdkLib.Anon_AllowHttp) = this()
  def accounts(): AccountCallBuilder = js.native
  def assets(): AssetsCallBuilder = js.native
  def effects(): EffectCallBuilder = js.native
  def ledgers(): LedgerCallBuilder = js.native
  def loadAccount(accountId: java.lang.String): js.Promise[AccountResponse] = js.native
  def offers(resource: java.lang.String, parameters: java.lang.String*): OfferCallBuilder = js.native
  def operations(): OperationCallBuilder = js.native
  def orderbook(selling: Asset, buying: Asset): OrderbookCallBuilder = js.native
  def paths(
    source: java.lang.String,
    destination: java.lang.String,
    destinationAsset: Asset,
    destinationAmount: java.lang.String
  ): PathCallBuilder = js.native
  def payments(): PaymentCallBuilder = js.native
  def submitTransaction(transaction: Transaction): js.Promise[_] = js.native
  def tradeAggregation(base: Asset, counter: Asset, startTime: stdLib.Date, endTime: stdLib.Date, resolution: stdLib.Date): TradeAggregationCallBuilder = js.native
  def trades(): TradesCallBuilder = js.native
  def transactions(): TransactionCallBuilder = js.native
}

