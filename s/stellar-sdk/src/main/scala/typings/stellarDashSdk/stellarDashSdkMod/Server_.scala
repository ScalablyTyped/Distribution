package typings.stellarDashSdk.stellarDashSdkMod

import typings.std.Date
import typings.stellarDashBase.stellarDashBaseMod.MemoType
import typings.stellarDashBase.stellarDashBaseMod.Operation
import typings.stellarDashSdk.stellarDashSdkMod.Server.AccountCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.AccountResponse
import typings.stellarDashSdk.stellarDashSdkMod.Server.AssetsCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.EffectCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.LedgerCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.OfferCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.OperationCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.Options
import typings.stellarDashSdk.stellarDashSdkMod.Server.OrderbookCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.PathCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.PaymentCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.TradeAggregationCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.TradesCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.TransactionCallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.Server.TransactionRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server")
@js.native
class Server_ protected () extends js.Object {
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

