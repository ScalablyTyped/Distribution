package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server")
@js.native
class Server protected () extends js.Object {
  def this(serverURL: java.lang.String) = this()
  def this(serverURL: java.lang.String, options: stellarDashSdkLib.stellarDashSdkMod.ServerNs.Options) = this()
  var serverURL: js.Any = js.native
  def accounts(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.AccountCallBuilder = js.native
  def assets(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.AssetsCallBuilder = js.native
  def effects(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.EffectCallBuilder = js.native
  def ledgers(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.LedgerCallBuilder = js.native
  def loadAccount(accountId: java.lang.String): js.Promise[stellarDashSdkLib.stellarDashSdkMod.ServerNs.AccountResponse] = js.native
  def offers(resource: java.lang.String, parameters: java.lang.String*): stellarDashSdkLib.stellarDashSdkMod.ServerNs.OfferCallBuilder = js.native
  def operations(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.OperationCallBuilder = js.native
  def orderbook(selling: Asset, buying: Asset): stellarDashSdkLib.stellarDashSdkMod.ServerNs.OrderbookCallBuilder = js.native
  def paths(
    source: java.lang.String,
    destination: java.lang.String,
    destinationAsset: Asset,
    destinationAmount: java.lang.String
  ): stellarDashSdkLib.stellarDashSdkMod.ServerNs.PathCallBuilder = js.native
  def payments(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.PaymentCallBuilder = js.native
  def submitTransaction(transaction: Transaction): js.Promise[stellarDashSdkLib.stellarDashSdkMod.ServerNs.TransactionRecord] = js.native
  def tradeAggregation(base: Asset, counter: Asset, startTime: stdLib.Date, endTime: stdLib.Date, resolution: stdLib.Date): stellarDashSdkLib.stellarDashSdkMod.ServerNs.TradeAggregationCallBuilder = js.native
  def trades(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.TradesCallBuilder = js.native
  def transactions(): stellarDashSdkLib.stellarDashSdkMod.ServerNs.TransactionCallBuilder = js.native
}

