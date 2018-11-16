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
  var envelope_xdr: java.lang.String = js.native
  var fee_paid: scala.Double = js.native
  var hash: java.lang.String = js.native
  var id: java.lang.String = js.native
  @JSName("ledger")
  var ledger_Original: CallFunction[LedgerRecord] = js.native
  var ledger_attr: scala.Double = js.native
  var max_fee: scala.Double = js.native
  var memo: java.lang.String = js.native
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
  def account(): stdLib.Promise[AccountRecord] = js.native
  def effects(): stdLib.Promise[CollectionRecord[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[EffectRecord]] = js.native
  def ledger(): stdLib.Promise[LedgerRecord] = js.native
  def operations(): stdLib.Promise[CollectionRecord[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): stdLib.Promise[CollectionRecord[OperationRecord]] = js.native
  def precedes(): stdLib.Promise[TransactionRecord] = js.native
  def self(): stdLib.Promise[TransactionRecord] = js.native
  def succeeds(): stdLib.Promise[TransactionRecord] = js.native
}

