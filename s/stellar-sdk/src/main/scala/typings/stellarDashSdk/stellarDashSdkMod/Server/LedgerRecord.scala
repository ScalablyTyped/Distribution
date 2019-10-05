package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerRecord
  extends BaseResponse[scala.Nothing] {
  var base_fee: Double = js.native
  var base_fee_in_stroops: Double = js.native
  var base_reserve: String = js.native
  var base_reserve_in_stroops: Double = js.native
  var closed_at: String = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var fee_pool: String = js.native
  var hash: String = js.native
  var header_xdr: String = js.native
  var id: String = js.native
  var max_tx_set_size: Double = js.native
  var operation_count: Double = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  var paging_token: String = js.native
  var prev_hash: String = js.native
  var protocol_version: Double = js.native
  @JSName("self")
  var self_Original: CallFunction[LedgerRecord] = js.native
  var sequence: Double = js.native
  var total_coins: String = js.native
  var transaction_count: Double = js.native
  @JSName("transactions")
  var transactions_Original: CallCollectionFunction[TransactionRecord] = js.native
  def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def operations(): js.Promise[CollectionRecord[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OperationRecord]] = js.native
  def self(): js.Promise[LedgerRecord] = js.native
  def transactions(): js.Promise[CollectionRecord[TransactionRecord]] = js.native
  def transactions(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[TransactionRecord]] = js.native
}

