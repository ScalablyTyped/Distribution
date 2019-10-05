package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseOperationResponse
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseType
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.OperationResponseTypeI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOperationRecord[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseOperationResponse[T, TI] {
  @JSName("effects")
  var effects_Original: CallCollectionFunction[EffectRecord] = js.native
  @JSName("precedes")
  var precedes_Original: CallFunction[OperationRecord] = js.native
  @JSName("self")
  var self_Original: CallFunction[OperationRecord] = js.native
  @JSName("succeeds")
  var succeeds_Original: CallFunction[OperationRecord] = js.native
  @JSName("transaction")
  var transaction_Original: CallFunction[TransactionRecord] = js.native
  def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
  def precedes(): js.Promise[OperationRecord] = js.native
  def self(): js.Promise[OperationRecord] = js.native
  def succeeds(): js.Promise[OperationRecord] = js.native
  def transaction(): js.Promise[TransactionRecord] = js.native
}

