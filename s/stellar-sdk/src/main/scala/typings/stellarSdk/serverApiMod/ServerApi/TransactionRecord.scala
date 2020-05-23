package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.MemoType
import typings.stellarSdk.anon.keyinaccountledgeroperati
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent utility-types.utility-types.Omit<stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.TransactionResponse, 'ledger'> */
@js.native
trait TransactionRecord extends js.Object {
  var _links: keyinaccountledgeroperati = js.native
  @JSName("account")
  var account_Original: CallFunction[AccountRecord] = js.native
  var created_at: String = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  var envelope_xdr: String = js.native
  var fee_charged: Double = js.native
  var fee_meta_xdr: String = js.native
  var hash: String = js.native
  var id: String = js.native
  @JSName("ledger")
  var ledger_Original: CallFunction[LedgerRecord] = js.native
  var ledger_attr: Double = js.native
  var max_fee: Double = js.native
  var memo: js.UndefOr[String] = js.native
  var memo_type: MemoType = js.native
  var operation_count: Double = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  var paging_token: String = js.native
  @JSName("precedes")
  var precedes_Original: CallFunction[TransactionRecord] = js.native
  var result_meta_xdr: String = js.native
  var result_xdr: String = js.native
  @JSName("self")
  var self_Original: CallFunction[TransactionRecord] = js.native
  var signatures: js.Array[String] = js.native
  var source_account: String = js.native
  var source_account_sequence: String = js.native
  @JSName("succeeds")
  var succeeds_Original: CallFunction[TransactionRecord] = js.native
  def account(): js.Promise[AccountRecord] = js.native
  def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
  def ledger(): js.Promise[LedgerRecord] = js.native
  def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
  def precedes(): js.Promise[TransactionRecord] = js.native
  def self(): js.Promise[TransactionRecord] = js.native
  def succeeds(): js.Promise[TransactionRecord] = js.native
}

