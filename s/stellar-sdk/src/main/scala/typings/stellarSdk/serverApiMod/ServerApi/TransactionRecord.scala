package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.MemoType
import typings.stellarSdk.anon.keyinaccountledgeroperati
import typings.stellarSdk.horizonApiMod.Horizon.FeeBumpTransactionResponse
import typings.stellarSdk.horizonApiMod.Horizon.InnerTransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent utility-types.utility-types.Omit<stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.TransactionResponse, 'ledger'> */
@js.native
trait TransactionRecord extends StObject {
  
  var _links: keyinaccountledgeroperati = js.native
  
  def account(): js.Promise[AccountRecord] = js.native
  @JSName("account")
  var account_Original: CallFunction[AccountRecord] = js.native
  
  var created_at: String = js.native
  
  def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  
  var envelope_xdr: String = js.native
  
  var fee_account: String = js.native
  
  var fee_bump_transaction: js.UndefOr[FeeBumpTransactionResponse] = js.native
  
  var fee_charged: Double | String = js.native
  
  var fee_meta_xdr: String = js.native
  
  var hash: String = js.native
  
  var id: String = js.native
  
  var inner_transaction: js.UndefOr[InnerTransactionResponse] = js.native
  
  def ledger(): js.Promise[LedgerRecord] = js.native
  @JSName("ledger")
  var ledger_Original: CallFunction[LedgerRecord] = js.native
  
  var ledger_attr: Double = js.native
  
  var max_fee: Double | String = js.native
  
  var memo: js.UndefOr[String] = js.native
  
  var memo_bytes: js.UndefOr[String] = js.native
  
  var memo_type: MemoType = js.native
  
  var operation_count: Double = js.native
  
  def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
  def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  
  var paging_token: String = js.native
  
  def precedes(): js.Promise[TransactionRecord] = js.native
  @JSName("precedes")
  var precedes_Original: CallFunction[TransactionRecord] = js.native
  
  var result_meta_xdr: String = js.native
  
  var result_xdr: String = js.native
  
  def self(): js.Promise[TransactionRecord] = js.native
  @JSName("self")
  var self_Original: CallFunction[TransactionRecord] = js.native
  
  var signatures: js.Array[String] = js.native
  
  var source_account: String = js.native
  
  var source_account_sequence: String = js.native
  
  def succeeds(): js.Promise[TransactionRecord] = js.native
  @JSName("succeeds")
  var succeeds_Original: CallFunction[TransactionRecord] = js.native
}
