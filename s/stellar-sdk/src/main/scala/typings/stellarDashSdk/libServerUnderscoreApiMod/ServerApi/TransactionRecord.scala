package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.TransactionResponse extends any ? std.Pick<stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.TransactionResponse, utility-types.utility-types/dist/mapped-types.SetComplement<keyof stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.TransactionResponse, 'ledger'>> : never */ @js.native
trait TransactionRecord extends js.Object {
  @JSName("account")
  var account_Original: CallFunction[AccountRecord] = js.native
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  @JSName("ledger")
  var ledger_Original: CallFunction[LedgerRecord] = js.native
  var ledger_attr: Double = js.native
  @JSName("operations")
  var operations_Original: CallCollectionFunction[OperationRecord] = js.native
  @JSName("precedes")
  var precedes_Original: CallFunction[TransactionRecord] = js.native
  @JSName("self")
  var self_Original: CallFunction[TransactionRecord] = js.native
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

