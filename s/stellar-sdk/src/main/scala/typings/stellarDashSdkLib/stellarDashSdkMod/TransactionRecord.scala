package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionRecord extends Record {
  @JSName("account")
  var account_Original: CallFunction[AccountRecord] = js.native
  var created_at: java.lang.String = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var envelope: js.Any = js.native
  var envelope_xdr: java.lang.String = js.native
  var fee_paid: scala.Double = js.native
  var hash: java.lang.String = js.native
  var id: java.lang.String = js.native
  @JSName("ledger")
  var ledger_Original: CallFunction[LedgerRecord] = js.native
  var ledger_attr: scala.Double = js.native
  var max_fee: scala.Double = js.native
  var memo: java.lang.String = js.native
  var memo_type: js.Any = js.native
  var operation_count: scala.Double = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  var paging_token: java.lang.String = js.native
  @JSName("precedes")
  var precedes_Original: CallFunction[TransactionRecord] = js.native
  var result_code: scala.Double = js.native
  var result_code_s: java.lang.String = js.native
  var result_meta_xdr: java.lang.String = js.native
  var result_xdr: java.lang.String = js.native
  @JSName("self")
  var self_Original: CallFunction[TransactionRecord] = js.native
  var source_account: java.lang.String = js.native
  var source_account_sequence: java.lang.String = js.native
  @JSName("succeeds")
  var succeeds_Original: CallFunction[TransactionRecord] = js.native
  def account(): js.Promise[AccountRecord] = js.native
  def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def ledger(): js.Promise[LedgerRecord] = js.native
  def operations(): js.Promise[CollectionRecord[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OperationRecord]] = js.native
  def precedes(): js.Promise[TransactionRecord] = js.native
  def self(): js.Promise[TransactionRecord] = js.native
  def succeeds(): js.Promise[TransactionRecord] = js.native
}

