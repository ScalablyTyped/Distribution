package typings.stellarSdk.serverMod

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.Operation
import typings.stellarBase.mod.Transaction
import typings.stellarSdk.accountCallBuilderMod.AccountCallBuilder
import typings.stellarSdk.accountResponseMod.AccountResponse
import typings.stellarSdk.assetsCallBuilderMod.AssetsCallBuilder
import typings.stellarSdk.effectCallBuilderMod.EffectCallBuilder
import typings.stellarSdk.friendbotBuilderMod.FriendbotBuilder
import typings.stellarSdk.horizonApiMod.Horizon.FeeStatsResponse
import typings.stellarSdk.horizonApiMod.Horizon.SubmitTransactionResponse
import typings.stellarSdk.ledgerCallBuilderMod.LedgerCallBuilder
import typings.stellarSdk.offerCallBuilderMod.OfferCallBuilder
import typings.stellarSdk.operationCallBuilderMod.OperationCallBuilder
import typings.stellarSdk.orderbookCallBuilderMod.OrderbookCallBuilder
import typings.stellarSdk.pathCallBuilderMod.PathCallBuilder
import typings.stellarSdk.paymentCallBuilderMod.PaymentCallBuilder
import typings.stellarSdk.serverMod.Server.Options
import typings.stellarSdk.serverMod.Server.SubmitTransactionOptions
import typings.stellarSdk.serverMod.Server.Timebounds
import typings.stellarSdk.tradeAggregationCallBuilderMod.TradeAggregationCallBuilder
import typings.stellarSdk.tradesCallBuilderMod.TradesCallBuilder
import typings.stellarSdk.transactionCallBuilderMod.TransactionCallBuilder
import typings.urijs.mod.URI
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
  def checkMemoRequired(transaction: Transaction[Memo[MemoType], js.Array[Operation]]): js.Promise[Unit] = js.native
  def effects(): EffectCallBuilder = js.native
  def feeStats(): js.Promise[FeeStatsResponse] = js.native
  def fetchBaseFee(): js.Promise[Double] = js.native
  def fetchTimebounds(seconds: Double): js.Promise[Timebounds] = js.native
  def fetchTimebounds(seconds: Double, _isRetry: Boolean): js.Promise[Timebounds] = js.native
  def friendbot(address: String): FriendbotBuilder = js.native
  def ledgers(): LedgerCallBuilder = js.native
  def loadAccount(accountId: String): js.Promise[AccountResponse] = js.native
  def offers(): OfferCallBuilder = js.native
  def operations(): OperationCallBuilder = js.native
  def orderbook(selling: Asset, buying: Asset): OrderbookCallBuilder = js.native
  def paths(source: String, destination: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def payments(): PaymentCallBuilder = js.native
  def strictReceivePaths(source: String, destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictReceivePaths(source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: String): PathCallBuilder = js.native
  def strictSendPaths(sourceAsset: Asset, sourceAmount: String, destination: js.Array[Asset]): PathCallBuilder = js.native
  def submitTransaction(transaction: Transaction[Memo[MemoType], js.Array[Operation]]): js.Promise[SubmitTransactionResponse] = js.native
  def submitTransaction(transaction: Transaction[Memo[MemoType], js.Array[Operation]], opts: SubmitTransactionOptions): js.Promise[SubmitTransactionResponse] = js.native
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

