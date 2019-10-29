package typings.stellarDashSdk.libServerMod

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashBase.stellarDashBaseMod.Memo
import typings.stellarDashBase.stellarDashBaseMod.MemoType
import typings.stellarDashBase.stellarDashBaseMod.Operation
import typings.stellarDashBase.stellarDashBaseMod.Transaction
import typings.stellarDashSdk.libAccountUnderscoreCallUnderscoreBuilderMod.AccountCallBuilder
import typings.stellarDashSdk.libAccountUnderscoreResponseMod.AccountResponse
import typings.stellarDashSdk.libAssetsUnderscoreCallUnderscoreBuilderMod.AssetsCallBuilder
import typings.stellarDashSdk.libEffectUnderscoreCallUnderscoreBuilderMod.EffectCallBuilder
import typings.stellarDashSdk.libFriendbotUnderscoreBuilderMod.FriendbotBuilder
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.FeeStatsResponse
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.SubmitTransactionResponse
import typings.stellarDashSdk.libLedgerUnderscoreCallUnderscoreBuilderMod.LedgerCallBuilder
import typings.stellarDashSdk.libOfferUnderscoreCallUnderscoreBuilderMod.OfferCallBuilder
import typings.stellarDashSdk.libOperationUnderscoreCallUnderscoreBuilderMod.OperationCallBuilder
import typings.stellarDashSdk.libOrderbookUnderscoreCallUnderscoreBuilderMod.OrderbookCallBuilder
import typings.stellarDashSdk.libPathUnderscoreCallUnderscoreBuilderMod.PathCallBuilder
import typings.stellarDashSdk.libPaymentUnderscoreCallUnderscoreBuilderMod.PaymentCallBuilder
import typings.stellarDashSdk.libServerMod.Server.Options
import typings.stellarDashSdk.libServerMod.Server.Timebounds
import typings.stellarDashSdk.libTradeUnderscoreAggregationUnderscoreCallUnderscoreBuilderMod.TradeAggregationCallBuilder
import typings.stellarDashSdk.libTradesUnderscoreCallUnderscoreBuilderMod.TradesCallBuilder
import typings.stellarDashSdk.libTransactionUnderscoreCallUnderscoreBuilderMod.TransactionCallBuilder
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/server", "Server")
@js.native
class Server_ protected () extends js.Object {
  def this(serverURL: String) = this()
  def this(serverURL: String, opts: Options) = this()
  val serverURL: URI = js.native
  def accounts(): AccountCallBuilder = js.native
  def assets(): AssetsCallBuilder = js.native
  def effects(): EffectCallBuilder = js.native
  def feeStats(): js.Promise[FeeStatsResponse] = js.native
  def fetchBaseFee(): js.Promise[Double] = js.native
  def fetchTimebounds(seconds: Double): js.Promise[Timebounds] = js.native
  def fetchTimebounds(seconds: Double, _isRetry: Boolean): js.Promise[Timebounds] = js.native
  def friendbot(address: String): FriendbotBuilder = js.native
  def ledgers(): LedgerCallBuilder = js.native
  def loadAccount(accountId: String): js.Promise[AccountResponse] = js.native
  def offers(resource: String, resourceParams: String*): OfferCallBuilder = js.native
  def operations(): OperationCallBuilder = js.native
  def orderbook(selling: Asset, buying: Asset): OrderbookCallBuilder = js.native
  def paths(source: String, destination: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def payments(): PaymentCallBuilder = js.native
  def strictReceivePaths(source: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictReceivePaths(source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: js.Array[Asset]): PathCallBuilder = js.native
  def submitTransaction(transaction: Transaction[Memo[MemoType], js.Array[Operation]]): js.Promise[SubmitTransactionResponse] = js.native
  def tradeAggregation(
    base: Asset,
    counter: Asset,
    start_time: Double,
    end_time: Double,
    resolution: Double,
    offset: Double
  ): TradeAggregationCallBuilder = js.native
  def trades(): TradesCallBuilder = js.native
  def transactions(): TransactionCallBuilder = js.native
}

