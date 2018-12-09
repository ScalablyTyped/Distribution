package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerRecord extends Record {
  var base_fee: scala.Double = js.native
  var base_fee_in_stroops: scala.Double = js.native
  var base_reserve: java.lang.String = js.native
  var base_reserve_in_stroops: scala.Double = js.native
  var closed_at: java.lang.String = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var fee_pool: java.lang.String = js.native
  var hash: java.lang.String = js.native
  var header_xdr: java.lang.String = js.native
  var id: java.lang.String = js.native
  var max_tx_set_size: scala.Double = js.native
  var operation_count: scala.Double = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  var paging_token: java.lang.String = js.native
  var prev_hash: java.lang.String = js.native
  var protocol_version: scala.Double = js.native
  @JSName("self")
  var self_Original: CallFunction[LedgerRecord] = js.native
  var sequence: scala.Double = js.native
  var total_coins: java.lang.String = js.native
  var transaction_count: scala.Double = js.native
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

