package typings.stellarDashSdk.stellarDashSdkMod

import typings.std.Date
import typings.stellarDashBase.stellarDashBaseMod.MemoType
import typings.stellarDashBase.stellarDashBaseMod.Operation
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.AccountCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.AccountResponse
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.AssetsCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.EffectCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.LedgerCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.OfferCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.OperationCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.Options
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.OrderbookCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.PathCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.PaymentCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.TradeAggregationCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.TradesCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.TransactionCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.TransactionRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server")
@js.native
class Server protected () extends js.Object {
  def this(serverURL: String) = this()
  def this(serverURL: String, options: Options) = this()
  var serverURL: js.Any = js.native
  def accounts(): AccountCallBuilder = js.native
  def assets(): AssetsCallBuilder = js.native
  def effects(): EffectCallBuilder = js.native
  def ledgers(): LedgerCallBuilder = js.native
  def loadAccount(accountId: String): js.Promise[AccountResponse] = js.native
  def offers(resource: String, parameters: String*): OfferCallBuilder = js.native
  def operations(): OperationCallBuilder = js.native
  def orderbook(
    selling: typings.stellarDashBase.stellarDashBaseMod.Asset,
    buying: typings.stellarDashBase.stellarDashBaseMod.Asset
  ): OrderbookCallBuilder = js.native
  def paths(
    source: String,
    destination: String,
    destinationAsset: typings.stellarDashBase.stellarDashBaseMod.Asset,
    destinationAmount: String
  ): PathCallBuilder = js.native
  def payments(): PaymentCallBuilder = js.native
  def submitTransaction(
    transaction: typings.stellarDashBase.stellarDashBaseMod.Transaction[typings.stellarDashBase.stellarDashBaseMod.Memo[MemoType], js.Array[Operation]]
  ): js.Promise[TransactionRecord] = js.native
  def tradeAggregation(
    base: typings.stellarDashBase.stellarDashBaseMod.Asset,
    counter: typings.stellarDashBase.stellarDashBaseMod.Asset,
    startTime: Date,
    endTime: Date,
    resolution: Date
  ): TradeAggregationCallBuilder = js.native
  def trades(): TradesCallBuilder = js.native
  def transactions(): TransactionCallBuilder = js.native
}

